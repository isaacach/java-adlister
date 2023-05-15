package dao;

import dao.Ads;
import dao.ListAdsDao;

import java.sql.SQLException;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() throws SQLException {
        if (adsDao == null) {
            adsDao = new mySQLAdsDao();
        }
        return adsDao;
    }
}
