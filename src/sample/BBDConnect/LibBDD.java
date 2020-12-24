package sample.BBDConnect;

import java.sql.*;

public class LibBDD {
    protected Connection connect;
    protected Statement stmt;
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
            String url = "jdbc:mysql://localhost/ librairie?zeroDateTimeBehavior=CONVERT_TO_NULL&serverTimezone=UTC";
            String user = "librairieAgent";
            String pwd = "skaven";
            connect = DriverManager.getConnection(url, user, pwd);
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.exit(2);
        }

    }

    public void getBDD() {
        try {
            String requete = "SELECT * FROM Animal";
            stmt = connect.createStatement();
            res = stmt.executeQuery(requete);
            while (res.next()) {
                System.out.println("ID :" + res.getInt("id"));
                System.out.println(", Espece: " + res.getString("espece"));
                System.out.println(", Sexe: " + res.getString("sexe"));
            }
            res.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }


}