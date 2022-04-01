package com.company;

public class Cat extends Pet{

    private int age;
    public Cat(String name){
        super(name);
        this.age = 0;
    }
    public void meow(){
        System.out.println("Meow");
    }
}
