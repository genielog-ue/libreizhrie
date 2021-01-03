package sample.BBDConnect.SQLQuery;

import sample.BBDConnect.LibBDD;
import sample.BBDConnect.TableClass.Personnel;

import java.sql.SQLException;

public class AuthQuery extends LibBDD {

    public AuthQuery() throws SQLException {
        super();
    }
   public boolean Auth(Personnel personnel) throws SQLException {
        String requete="SELECT (EXISTS(SELECT 1 FROM personnelbdd WHERE compte=? AND mdp=PASSWORD(?)))";
        stmt=connect.prepareStatement(requete);
        stmt.setString(1,personnel.getCompte());
        stmt.setString(2,personnel.getMdp());
        res=stmt.executeQuery();
        boolean bool=false;
        while(res.next()){
            bool=res.getInt(1)!=0;
        }
       stmt.close();
       connect.close();
       return bool;
    }
}
