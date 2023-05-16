<<<<<<<< HEAD:src/main/java/dao/Ads.java
package dao;

import models.Ad;
========
package com.codeup.adlister.dao;

import com.codeup.adlister.models.Ad;
>>>>>>>> user-input-exercise:src/main/java/com/codeup/adlister/dao/Ads.java

import java.util.List;

public interface Ads {
    // get a list of all the ads
    List<Ad> all();
    // insert a new ad and return the new ad's id
    Long insert(Ad ad);
}
