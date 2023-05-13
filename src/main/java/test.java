

import static dao.JDBCTest.getArtistNames;

public class test {
    public static void main(String[] args) {
        for(String name : getArtistNames()){
            System.out.println(name);
        }
    }
}
