package com.company;

public class Pet {
    private String name;
    private int age;

    public Pet(String name){
        this.name = name;
        this.age = 0;
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

    public void ageUp(){
        this.age++;
    }
}
