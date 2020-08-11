package com.overriding.arraylist.override;

import java.util.ArrayList;

public class CustomArrayList extends ArrayList<Integer> {
   // CustomArrayList arr = new CustomArrayList();

    @Override
    public boolean add(Integer o) {
        System.out.println("Custom Array List");
        return super.add(o);

    }

}
