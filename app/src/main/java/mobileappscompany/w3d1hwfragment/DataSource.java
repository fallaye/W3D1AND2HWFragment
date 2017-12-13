package mobileappscompany.w3d1hwfragment;

import java.util.ArrayList;

/**
 * Created by fallaye on 12/12/17.
 */

public class DataSource {


    public static ArrayList<Celebrity> getAllCelebrities(){
        ArrayList<Celebrity> celebrityList = new ArrayList<Celebrity>();

        Celebrity celebrity1 = new Celebrity("1", "John Legend", "30", "Male");
        Celebrity celebrity2 = new Celebrity("1", "Morgan Freeman", "60", "Male");
        Celebrity celebrity3 = new Celebrity("1", "Celine Dion", "50", "Female");
        Celebrity celebrity4 = new Celebrity("1", "Tom Cruise", "40", "Male");
        Celebrity celebrity5 = new Celebrity("1", "Michelle Obama", "50", "Female");

        celebrityList.add(celebrity1);
        celebrityList.add(celebrity2);
        celebrityList.add(celebrity3);
        celebrityList.add(celebrity4);
        celebrityList.add(celebrity5);

        return  celebrityList;
    }

}
