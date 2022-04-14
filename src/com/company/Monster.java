package com.company;

public class Monster extends Animal{

    private int damage;
    public Monster(String name, int damage){
        super(name);
        this.damage = damage;
    }


    public String stomp(){
        return "THUD!";
    }

    @Override
    public void talk() {
        System.out.println("RAR!");
    }
}
