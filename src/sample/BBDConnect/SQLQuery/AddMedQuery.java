package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;

import java.sql.SQLException;

public class AddMedQuery extends LibBDD {
    public AddMedQuery() throws SQLException {
        super();
    }

    public void AddMed(Media media) throws SQLException {
        String requete="INSERT INTO mediabdd (Type,Titre,Genre,Emplacement,NbExemplaires)" +
                "VALUES (?,?,?,?,?)";
        stmt=connect.prepareStatement(requete);
        stmt.setString(1,media.getType());
        stmt.setString(2,media.getTitre());
        stmt.setString(3,media.getGenre());
        stmt.setInt(4,media.getEmplacement());
        stmt.setInt(5,media.getNbExemplaires());
        stmt.execute();
    }
}
