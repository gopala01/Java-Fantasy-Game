package com.company;

public class Dog extends Pet{

    private int age;
    public Dog(String name){
        super(name);
        this.age = 0;
    }

    public void bark(){
        System.out.println("Woof");
    }
}
