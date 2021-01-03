package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;

public class ReturnMedQuery extends LibBDD {
    public ReturnMedQuery() throws SQLException {
        super();
    }

    public void ReturnMedia(Usager user, Media media) throws SQLException {
        /**
         * Permet de retirer l'emprunt d'un media par un utilisateur dans la BDD
         */
        String requete = "DELETE FROM T_Emprunt WHERE idUsager=? and idMedia=?";
        stmt = connect.prepareStatement(requete);
        stmt.setInt(1, user.getIdUsager());
        stmt.setInt(2, media.getIdMedia());
        stmt.execute();
        stmt.close();
        connect.close();
    }
}
