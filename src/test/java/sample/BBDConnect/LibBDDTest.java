package sample.BBDConnect;

import org.junit.Assert;
import org.junit.Test;
import java.sql.*;

import static org.junit.Assert.*;

public class LibBDDTest {

    @Test
    public void testConnection() throws SQLException {
        System.out.println("Connexion à la base de données");
        LibBDD database = new LibBDD();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }

        try {
            String url = "jdbc:mysql://mysql-libreizhrie.alwaysdata.net/ libreizhrie_bdd?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
            String user = "222286_gl";
            String pwd = "UE-genie-log-56";
            database.connect = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(2);
        }
    }
}