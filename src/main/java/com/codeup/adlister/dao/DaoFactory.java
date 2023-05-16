package com.codeup.adlister.dao;

import com.codeup.adlister.models.User;

public class DaoFactory {
    private static Ads adsDao;
    private static Users usersDao;

    public static Ads getAdsDao() {
        if (adsDao == null) {
            adsDao = new MySQLAdsDao();
        }
        return adsDao;
    }

    public static Users getUsersDao() {
        if (usersDao == null) {
            usersDao = new MySQLUsersDao();
        }
        return usersDao;
    }
}
