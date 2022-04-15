package com.company;

public class Item {

    //Class mammal, indicating what the name of the item is and how much damage it has.
    private int damage;
    private String name;

    public Item(String name, int damage){
        this.name = name;
        this.damage = damage;
    }

    public Item(String name) {
        this.name = name;
        this.damage = 0;
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
