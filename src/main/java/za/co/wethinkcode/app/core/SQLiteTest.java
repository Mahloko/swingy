package za.co.wethinkcode.app.core;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class SQLiteTest {
    private static Connection con;
    private static boolean hasData = false;

    public ResultSet displayUsers() throws ClassNotFoundException, SQLException {
        if (con == null) {
            getConnection();
        }
        Statement state = con.createStatement();
        ResultSet res =  state.executeQuery("SELECT fname, lname FROM user");
        return res;
    }

    private void getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
        con = DriverManager.getConnection("jdbc:sqlite:SQLiteTest1.db");
        initialise();
    }

    private void initialise() throws  SQLException {
        if (!hasData) {
            hasData = true;
            Statement state = con.createStatement();
            ResultSet res =  state.executeQuery("SELECT name FROM sqlite master WHERE type ='table' AND name='user'");
            if (!res.next()) {
                System.out.println("building the user table");
                // need to build the table
                Statement state2 = con.createStatement();
                state2.execute("CREATE TABLE user(id integer,"
                + "fname varchar(60)," + "lname varchar(60),"
                + "primary key(id);");
                // inserting some sample data
                PreparedStatement prep = con.prepareStatement("INSERT INTO user VALUES(?,?,?);");
                prep.setString(2, "Mpho");
                prep.setString(3, "Mahloko");
                prep.execute();

                PreparedStatement prep2 = con.prepareStatement("INSERT INTO user VALUES(?,?,?);");
                prep2.setString(2, "Mpho1");
                prep2.setString(3, "Mahlok1o");
                prep2.execute();
            }
        }
    }

    public void addUser(String firstname, String lastname) throws SQLException, ClassNotFoundException {
        if (con == null ) {
            getConnection();
        }
        PreparedStatement prep = con.prepareStatement("INSERT INTO user VALUES(?,?,?);");
        prep.setString(2, firstname);
        prep.setString(3, lastname);
        prep.execute();
    } 
}