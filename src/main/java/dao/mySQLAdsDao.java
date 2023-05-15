package dao;

import models.Ad;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class mySQLAdsDao implements Ads{

    public mySQLAdsDao(Connection connection) throws SQLException {
        this.connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/adlister_db?allowPublicKeyRetrieval=true&useSSL=false",
                "root",
                "codeup"
        );
    }

    Connection connection;

    @Override
    public List<Ad> all() {
        return null;
    }

    @Override
    public Long insert(Ad ad) {
        return null;
    }
}
