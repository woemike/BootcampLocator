package com.devslopes.bootcamplocator.services;

import com.devslopes.bootcamplocator.model.Devslopes;

import java.util.ArrayList;

/**
 * Created by markprice on 6/13/16.
 */
public class DataService {
    private static DataService instance = new DataService();

    public static DataService getInstance() {
        return instance;
    }

    private DataService() {

    }

    public ArrayList<Devslopes> getBootcampLocationsWithin10MilesOfZip(int zipcode) {
        //pretending we are downloading data from the server

        ArrayList<Devslopes> list = new ArrayList<>();
        list.add(new Devslopes(35.279f,-120.663f,"Downtown","762 Higuera Street, San Luis Obispo, CA 93401","slo"));
        list.add(new Devslopes(35.302f,-120.658f,"On The Campus","1 Grand Ave, San Luis Obispo, CA 93401","slo"));
        list.add(new Devslopes(35.267f,-120.652f,"East Side Tower","2494 Victoria Ave, San Luis Obispo, CA 93401","slo"));
        return list;
    }
}
