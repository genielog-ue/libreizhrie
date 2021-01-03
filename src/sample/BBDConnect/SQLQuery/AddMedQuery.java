package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class AddMedQuery extends LibBDD {
    public AddMedQuery() throws SQLException {
        super();
    }

    public void AddMed(Media media) throws SQLException {
        /**
         * Permet d'ajouter un média dans la limite des 100 000 exemplaires de médias
         */
        String check = "SELECT SUM(NbExemplaires) FROM mediabdd";

        stmt = connect.prepareStatement(check);
        res = stmt.executeQuery();
        int maxnb = 0;
        while (res.next()) {
            maxnb = res.getInt("SUM(NbExemplaires)"); // Récupère la somme des exemplaires contenus dans la BDD
        }
        stmt.close();
        res.close();
        if (maxnb + media.getNbExemplaires() < 100000) { // 100 000 est le nombre max d'exemplaires pouvant être contenues dans la BDD
            String requete = "INSERT INTO mediabdd (Type,Titre,Genre,Emplacement,NbExemplaires)" +
                    "VALUES (?,?,?,?,?)";
            stmt = connect.prepareStatement(requete);
            stmt.setString(1, media.getType());
            stmt.setString(2, media.getTitre());
            stmt.setString(3, media.getGenre());
            stmt.setInt(4, media.getEmplacement());
            stmt.setInt(5, media.getNbExemplaires());
            stmt.execute();
            stmt.close();
            connect.close();
        }
    }
}
