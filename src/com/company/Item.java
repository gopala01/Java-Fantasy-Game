package com.company;

public class Item {
    private int damage;
    private String name;

    public Item(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public Item() {
    }


    public int getDamage() {
        return this.damage;
    }

    public String getName() {
        return this.name;
    }


    public void setDamage(int damage) {
        this.damage = damage;
    }
}
