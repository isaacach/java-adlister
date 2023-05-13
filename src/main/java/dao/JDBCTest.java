package dao;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCTest {

    private static List<String> artistNames = new ArrayList<>();

    public static List<String> getArtistNames(){

        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT artist FROM albums");
            while (rs.next()) {
                artistNames.add(rs.getString("artist"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return artistNames;
    }

}
