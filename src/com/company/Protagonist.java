package com.company;

import java.util.ArrayList;

public class Protagonist {
    private final String name;
    private final int age;
    private int points;
    private Bag bag;


    public Protagonist(){
        this.name = "";
        this.age = 0;
        this.points = 0;
        this.bag = new Bag();
    }

    public Protagonist(String name, int age){
        this.name = name;
        this.age = age;
        this.points = 0;
        this.bag = new Bag();
    }


    public String getName(){
        return this.name;
    }


    public int getAge(){return this.age;}

    public int getPoints(){
        return this.points;
    }

    public void addPoints(int n){this.points = this.points + n;}

    public void addItem(String item){
        this.bag.add(item);
    }

    public void removeItem(String item){this.bag.remove(item);}

    public String getItem(int index){
         return this.bag.getItem(index);
    }

    public String returnItem(String item){
        return this.bag.returnItem(item);
    }
}
