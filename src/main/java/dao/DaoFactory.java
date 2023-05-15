package dao;

import dao.Ads;
import dao.ListAdsDao;

public class DaoFactory {
    private static Ads adsDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new mySQLAdsDao();
        }
        return adsDao;
    }
}
