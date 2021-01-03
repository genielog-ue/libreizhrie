package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class RemMedQuery extends LibBDD {

    public RemMedQuery() throws SQLException {
        super();
    }

    public void RemMed(Media media) throws SQLException {
        /**
         * Retire un media dans la BDD
         */
        String requete="DELETE FROM mediabdd WHERE idMedia=? AND Titre=?";
        stmt=connect.prepareStatement(requete);
        stmt.setInt(1,media.getIdMedia());
        stmt.setString(2,media.getTitre());
        stmt.execute();
        stmt.close();
        connect.close();

    }

}
