package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class EmprMedQuery extends LibBDD {
    /**
     * Requete pour emprunter un livre
     *
     * @throws SQLException
     */
    public EmprMedQuery() throws SQLException {
        super();
    }

    public void EmprMedQuery(Usager user, Media media, String typeMedia) throws SQLException {
        int age = 0;
        String firstrequete = "SELECT COUNT(idUsager) FROM T_Emprunt WHERE idUsager=?";
        stmt = connect.prepareStatement(firstrequete);
        stmt.setInt(1, user.getIdUsager());
        res = stmt.executeQuery();
        int count = 0;
        while (res.next()) {
            count = res.getInt(1);
        }
        if (count == 0) {
            String secondrequete = "SELECT age FROM usagerbdd WHERE idUsager=?";
            stmt = connect.prepareStatement(secondrequete);
            stmt.setInt(1, user.getIdUsager());
            res = stmt.executeQuery();
            while (res.next()) {
                age = res.getInt(1);
            }
            if (typeMedia.equals("DVD")) {
                if (age >= 18) {
                    SendRequest(user, media);
                }
            } else {
                SendRequest(user, media);
            }
        } else {
            String requeteCheck = "SELECT COUNT(T_Emprunt.idUsager),usagerbdd.age,usagerbdd.dateInscription FROM T_Emprunt " +
                    "INNER JOIN usagerbdd ON usagerbdd.idUsager=T_Emprunt.idUsager " +
                    "INNER JOIN mediabdd ON mediabdd.idMedia=T_Emprunt.idMedia " +
                    "WHERE usagerbdd.idUsager=? AND mediabdd.Type=? GROUP BY usagerbdd.age,usagerbdd.dateInscription";
            stmt = connect.prepareStatement(requeteCheck);
            stmt.setInt(1, user.getIdUsager());
            stmt.setString(2, typeMedia);
            res = stmt.executeQuery();
            int compteur = 0;
            String date = "9999-01-01";
            while (res.next()) {
                compteur = res.getInt(1);
                age = res.getInt(2);
                date = res.getString(3);
            }
            date = date.substring(0, 10);
            LocalDate inscription = LocalDate.parse(date, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LocalDate today = LocalDate.now();
            int years = (int) ChronoUnit.YEARS.between(inscription, today);
            typeMedia = typeMedia.toUpperCase();
            if (age < 18) {
                if (typeMedia.equals("LIVRE") && compteur < 5) {
                    SendRequest(user, media);
                }
            } else {
                if (years == 0) {
                    if (typeMedia.equals("LIVRE") && compteur < 4) {
                        SendRequest(user, media);
                    } else if (typeMedia.equals("DVD") && compteur < 2) {
                        SendRequest(user, media);
                    }
                } else if (years == 1) {
                    if (typeMedia.equals("LIVRE") && compteur < 5) {
                        SendRequest(user, media);
                    } else if (typeMedia.equals("DVD") && compteur < 3) {
                        SendRequest(user, media);
                    }
                } else if (years >= 2) {
                    if (typeMedia.equals("LIVRE") && compteur < 7) {
                        SendRequest(user, media);
                    } else if (typeMedia.equals("DVD") && compteur < 5) {
                        SendRequest(user, media);
                    }
                }
            }
        }
    }

    private void SendRequest(Usager user, Media media) throws SQLException {
        String requete = "INSERT INTO T_Emprunt (idUsager,idMedia) VALUES (?,?)";
        stmt = connect.prepareStatement(requete);
        stmt.setInt(1, user.getIdUsager());
        stmt.setInt(2, media.getIdMedia());
        stmt.execute();
        stmt.close();
        connect.close();
    }
}

