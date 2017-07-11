package com.develogical;

import java.util.ArrayList;

/**
 * Created by ape09 on 11/07/2017.
 */
public class ApeList {
    private ArrayList<String> elements;

    public ApeList() {
        elements = new ArrayList<>();
    }

    public int getSize() {
        return this.elements.size();
    }

    public boolean add(int s) {
        String sStr = "" + s;
        return this.add(sStr);
    }

    public boolean add(String s) {



        if(s == null || !s.matches("[+-]?\\d*\\.?\\d+")) {
            throw new IllegalArgumentException("only numerics allowed in string");
        }

        if(this.elements.contains(s))
        {
            //Duplicate, remove old entry
            this.elements.remove(this.elements.indexOf(s));
        }

        //Insert at front
        this.elements.add(0, s);
        return true;
    }

    public String get() {
        return this.elements.get(0);
    }

}
