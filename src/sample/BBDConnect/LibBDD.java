package sample.BBDConnect;

import java.sql.*;

public class LibBDD {
    protected Connection connect;
    protected PreparedStatement stmt;
    protected ResultSet res;

    public LibBDD() throws SQLException {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.exit(1);
        }
        this.connect = null;
        this.stmt = null;
        this.res = null;
        try {
            String url = "jdbc:mysql://mysql-libreizhrie.alwaysdata.net/ libreizhrie_bdd?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
            String user = "222286_gl";
            String pwd = "UE-genie-log-56";
            connect = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(2);
        }

    }

}