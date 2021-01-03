package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;
import java.util.ArrayList;

public class RechMedQuery extends LibBDD {
    public RechMedQuery() throws SQLException {
        super();
    }
    public ArrayList<Media> RechMedQuery(Media recherche) throws SQLException {
        ArrayList<Media> tmpList = new ArrayList<Media>();
        ArrayList<String> parameterList=new ArrayList<String>();
        String Type=recherche.getType();
        String Titre=recherche.getTitre();
        String Genre=recherche.getGenre();

        String requete = "SELECT * FROM mediabdd ";
        if(!(Type.isEmpty())){
            parameterList.add("Type=(?)");
        }
        if(!(Titre.isEmpty())){
            parameterList.add("Titre=(?)");
        }
        if(!(Genre.isEmpty())){
            parameterList.add("Genre=(?)");
        }
        if (parameterList.size() != 0) {
            int i;
            requete=requete+"WHERE ";
            for (i = 0; i < parameterList.size(); i++) {
                requete = requete + parameterList.get(i) + " AND ";
            }
            requete = requete.substring(0, requete.length() - 5);
        }
        stmt=connect.prepareStatement(requete);
        int cnt=1;
        if(!(Type.isEmpty())){
            stmt.setString(cnt,Type);
            cnt++;
        }
        if(!(Titre.isEmpty())){
            stmt.setString(cnt,Titre);
            cnt++;
        }
        if(!(Genre.isEmpty())){
            stmt.setString(cnt,Genre);
        }
        res=stmt.executeQuery();
        while(res.next()){
            Titre=res.getString(1);
            Type=res.getString(2);
            Genre=res.getString(3);
            int emplacement=res.getInt(4);
            int dispo=res.getInt(5);
            int nbExemplaires=res.getInt(6);
            int id=res.getInt(7);
            tmpList.add(new Media(Type,Titre,Genre,nbExemplaires,emplacement,dispo,id));
        }
        stmt.close();
        connect.close();
        return tmpList;
    }
}
