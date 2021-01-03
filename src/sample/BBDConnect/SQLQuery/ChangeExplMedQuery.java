package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class ChangeExplMedQuery extends LibBDD {
    public ChangeExplMedQuery() throws SQLException {
        super();
    }

    public void ChangeExpl(Media media) throws SQLException {
        /**
         * Permet de changer le nombre d'exemplaires d'un media dans la limite des 100 000 exemplaires
         */
        String requete = "UPDATE mediabdd SET NbExemplaires=? WHERE idMedia=? AND (SELECT COUNT(NbExemplaires)+? FROM mediabdd)<100000";
        stmt = connect.prepareStatement(requete);
        stmt.setInt(1, media.getNbExemplaires());
        stmt.setInt(2, media.getIdMedia());
        stmt.setInt(3, media.getNbExemplaires());
        stmt.execute();
        stmt.close();
        connect.close();
    }
}
