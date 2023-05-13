package dao;

import models.Artist;

import java.util.List;

public interface Artists {
    List<Artist> all();
    void insert(Artist artist);
}
