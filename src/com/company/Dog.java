package com.company;

public class Dog extends Animal{

    private int age;
    private int health;
    public Dog(String name){
        super(name);
        this.age = 0;
        this.health = 10;
    }

    public Dog(String name, int age){
        super(name, age);
        this.health = 10;
    }

    @Override
    public void eat() {
        this.health = this.health + 2;
    }





}
