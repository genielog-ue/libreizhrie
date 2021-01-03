package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class EmprMedQuery extends LibBDD {

    public EmprMedQuery() throws SQLException {
        super();
    }
    public void EmprMedQuery(Usager user, Media media,String typeMedia) throws SQLException {
        String requeteCheck="SELECT COUNT(T_Emprunt.idUsager),age,dateInscription FROM T_Emprunt,usagerbdd,mediabdd " +
                "WHERE mediabdd.Type=? AND T_Emprunt.idUsager=? AND T_Emprunt.idUsager=usagerbdd.idUsager " +
                "AND T_Emprunt.idMedia=mediabdd.idMedia";
        stmt=connect.prepareStatement(requeteCheck);
        stmt.setString(1,typeMedia);
        stmt.setInt(2,user.getIdUsager());
        res=stmt.executeQuery();
        int compteur=0;
        int age = 0;
        String date = "9999-01-01";
        while(res.next()){
            compteur=res.getInt(1);
            age=res.getInt(2);
            date=res.getString(3);
        }
        LocalDate inscription= LocalDate.parse(date);
        LocalDate today=LocalDate.now();
        int years= (int) ChronoUnit.YEARS.between(inscription,today);
        res.close();
        stmt.close();
        connect.close();

        if(age<18){
            if(typeMedia.equals("Livre")&&compteur<5){
                SendRequest(user,media);
            }
        }
        else {
            if (years == 0) {
                if (typeMedia.equals("Livre") && compteur < 4) {
                    SendRequest(user, media);
                } else if (typeMedia.equals("DVD") && compteur < 2) {
                    SendRequest(user, media);
                }
            } else if (years == 1) {
                if (typeMedia.equals("Livre") && compteur < 5) {
                    SendRequest(user, media);
                } else if (typeMedia.equals("DVD") && compteur < 3) {
                    SendRequest(user, media);
                }
            } else if (years >= 2) {
                if (typeMedia.equals("Livre") && compteur < 7) {
                    SendRequest(user, media);
                } else if (typeMedia.equals("DVD") && compteur < 5) {
                    SendRequest(user, media);
                }
            }
        }

    }
    public void SendRequest(Usager user,Media media) throws SQLException {
        String requete = "INSERT INTO T_Emprunt (idUsager,idMedia) VALUES (?,?)";
        stmt = connect.prepareStatement(requete);
        stmt.setInt(1, user.getIdUsager());
        stmt.setInt(2, media.getIdMedia());
        stmt.execute();
        stmt.close();
        connect.close();
    }

    }

