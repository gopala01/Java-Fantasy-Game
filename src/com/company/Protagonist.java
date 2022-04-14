package com.company;

import java.util.ArrayList;

public class Protagonist implements Mammal{
    private final String name;
    private final int age;
    private int points;
    private Bag bag;
    private int health;

    public Protagonist(){
        this.name = "";
        this.age = 0;
        this.points = 0;
        this.bag = new Bag();
        this.health = 10;
    }

    public Protagonist(String name, int age){
        this.name = name;
        this.age = age;
        this.points = 0;
        this.bag = new Bag();
        this.health = 10;
    }

    public String getName(){
        return this.name;
    }


    public int getAge(){return this.age;}

    public int getPoints(){
        return this.points;
    }

    public void addPoints(int n){this.points = this.points + n;}

    public void addItem(Item item){
        this.bag.add(item);
    }

    public void removeItem(Item item){
        for (int i = 0; i < bag.getTotalItems(); i++) {
            if (bag.getItem(i).equals(item)){
                this.bag.remove(item);

            }
        }

    }

    public Item getItem(int index){
        return this.bag.getItem(index);
    }


    public int getHealth(){
        return this.health;
    }

    public void heal(int n){this.health = this.health + n;}

    public void removeHealth(int damage){
        this.health = this.health - damage;
    }

    @Override
    public void eat() {
        this.health = this.health + 2;
    }
}
