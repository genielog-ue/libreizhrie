package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;

public class RemUserQuery extends LibBDD {
    public RemUserQuery() throws SQLException {
        super();
    }

    public void RemUser(Usager user) throws SQLException {
        /**
         * Retire un utilisateur dans la BDD
         */
        String requete = "DELETE FROM usagerbdd WHERE nom=? AND prenom=? OR idUsager=?";
        stmt = connect.prepareStatement(requete);
        stmt.setString(1, user.getNom());
        stmt.setString(2, user.getPrenom());
        stmt.setInt(3, user.getIdUsager());
        stmt.execute();
        stmt.close();
        connect.close();
    }
}
