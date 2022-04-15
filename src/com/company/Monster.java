package com.company;

public class Monster extends Animal{

    //A subclass to Animal, with the addition method of stomp()
    private int damage;
    public Monster(String name){
        super(name);
        this.damage = 0;
    }
    public Monster(String name, int damage){
        super(name, damage);

    }


    public String stomp(){
        return "THUD!";
    }

    @Override
    public void talk() {
        System.out.println("RAR!");
    } //Implementing the abstract method of talk from Animal
}
