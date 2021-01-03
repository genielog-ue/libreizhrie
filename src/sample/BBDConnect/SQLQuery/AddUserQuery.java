package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;

public class AddUserQuery extends LibBDD {

    public AddUserQuery() throws SQLException {
        super();
    }

    public void AddUser(Usager newUser) throws SQLException {
        /**
         * Rajout d'un usager dans la BDD
         */
        String requete = "INSERT INTO usagerbdd (nom,prenom,age,adresse,telephone)" +
                "VALUES (?,?,?,?,?)";
        stmt = connect.prepareStatement(requete);
        stmt.setString(1, newUser.getNom());
        stmt.setString(2, newUser.getPrenom());
        stmt.setInt(3, newUser.getAge());
        stmt.setString(4, newUser.getAdresse());
        stmt.setString(5, newUser.getTelephone());
        stmt.execute();
        stmt.close();
        connect.close();

    }
}
