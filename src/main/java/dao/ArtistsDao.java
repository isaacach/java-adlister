package dao;

import com.mysql.cj.jdbc.Driver;
import models.Artist;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ArtistsDao implements Artists{

    private Connection connection;

    public ArtistsDao() {
        try {
            DriverManager.registerDriver(new Driver());
            Connection connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/codeup_test_db?allowPublicKeyRetrieval=true&useSSL=false",
                    "root",
                    "codeup"
            );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    @Override
    public List<Artist> all() {
        List<Artist> artists = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT artist FROM albums");
            while (rs.next()) {
                Artist artist = new Artist(1, rs.getString(""))
                artists.add(rs.getString("artist"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database", e);
        }
    }

    @Override
    public void insert(Artist artist) {
    }
}
