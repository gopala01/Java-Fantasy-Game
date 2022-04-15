package com.company;

public class Dog extends Animal implements Mammal{

    //A subclass of Animal usinf the interface Mammal
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
    public void talk() {
        System.out.println("WOOF!");
    } //USing the talk abstract method from the abstract class of Animal

    public String wagTail(){
        return "SWISH! SWISH!";
    }

    @Override
    public void eat() {
        this.health = this.health + 2;
    }

    @Override
    public void run() {
        System.out.println("Rahhhh!");
    }

    //Using the Mammal interfaces methods of eat and run
}
