package com.example.lab8;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import androidx.collection.ArraySet;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;


public class CustomListTest {
    private City city;
    private CustomList cityList;
    private CustomList customList(Object o, ArrayList<> arrayList) {
    }


    @Test
    public void addCityTest(){
        CustomList list = customList(null, new ArrayList<>());
        int listSize = list.getCount();
        list.addCity(new City("Uttara", "Dhaka"));
        assertEquals(list.getCount(),listSize + 1);
    }


}



