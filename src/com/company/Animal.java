package com.company;

public abstract class Animal implements Mammal{
    private String name;
    private int age;
    private int damage;
    private int health;



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

    public void talk(){};

    @Override
    public void eat() {
        this.health = this.health + 2;
    }

    @Override
    public void run() {
        System.out.println("RUFF!");
    }


}
