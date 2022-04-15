package com.company;

public abstract class Animal{
    //An abstract class that sets all the general methods for Animal with the abstratc method of talk
    private String name;
    private int age;
    private int damage; //How much damage an Animal can do
    private int health; //How much health an animal can have



    public Animal(String name, int damage){
        this.name = name;
        this.age = 0;
        this.damage = damage;
        this.health = 10;
    }

    public Animal(String name){
        this.name = name;
        this.age = 0;
        this.damage = 0;
        this.health = 10;

    }

    public Animal(){
        this.name = null;
        this.age = 0;
        this.damage = 0;
    }

    public void setName(String m){
        this.name = m;
    }

    public String getName(){
        return this.name;
    }

    public void setAge(int n){
        this.age = n;
    }

    public int getAge(){
        return this.age;
    }


    public void setDamage(int n){
        this.damage = n;
    }

    public int getDamage(){
        return this.damage;
    }

    public int getHealth() {
        return this.health;
    }

    public void talk(){};
}
