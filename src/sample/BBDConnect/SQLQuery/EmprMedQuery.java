package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Media;
import sample.BBDConnect.TableClass.Usager;

import java.sql.SQLException;

public class EmprMedQuery extends LibBDD {

    public EmprMedQuery() throws SQLException {
        super();
    }
    public void EmprMedQuery(Usager user, Media media) throws SQLException {
        /* TODO
        *   Check if User can Borrow Media, with another SQL request to check the count */
        String requete="INSERT INTO T_Emprunt (idUsager,idMedia) VALUES (?,?)";
        stmt=connect.prepareStatement(requete);
        stmt.setInt(1,user.getIdUsager());
        stmt.setInt(2,media.getIdMedia());
        stmt.execute();
    }
}
