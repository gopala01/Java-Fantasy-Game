package com.company;

public class Dog extends Animal{

    private int age;
    public Dog(String name){
        super(name);
        this.age = 0;
    }

    public Dog(String name, int age){
        super(name);
        this.age = age;
    }

    @Override
    public void talk() {
        System.out.println("Woof!");
    }
}
