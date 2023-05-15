USE adlister_db;


DROP TABLE IF EXISTS ads;
DROP TABLE IF EXISTS users;

CREATE TABLE users (
                       id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                       username VARCHAR(240) NOT NULL,
                       email VARCHAR(240) NOT NULL,
                       password VARCHAR(255) NOT NULL
);

CREATE TABLE ads (
                     id INT UNSIGNED NOT NULL AUTO_INCREMENT PRIMARY KEY ,
                     user_id INT UNSIGNED NOT NULL,
                     title VARCHAR(240) NOT NULL,
                     description TEXT NOT NULL,
                     FOREIGN KEY (user_id) REFERENCES users(id)
);
