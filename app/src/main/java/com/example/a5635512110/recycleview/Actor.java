package com.example.a5635512110.recycleview;

/**
 * Created by 5635512110 on 3/30/2018.
 */

public class Actor {
    private String name;


    public Actor(String name) {
        this.name = name;

    }

    public Actor() { }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return getName() + ": " ;
    }

}
