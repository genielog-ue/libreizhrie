package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class ChangeExplMedQuery extends LibBDD {
    public ChangeExplMedQuery() throws SQLException {
        super();
    }
    public void ChangeExpl(Media media) throws SQLException {
        String requete="UPDATE mediabdd SET NbExemplaires=? WHERE idMedia=?";
        stmt=connect.prepareStatement(requete);
        stmt.setInt(1,media.getNbExemplaires());
        stmt.setInt(2,media.getIdMedia());
        stmt.execute();
    }
}
