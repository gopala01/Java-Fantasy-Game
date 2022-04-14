package com.company;

public class Cure extends Item{

    private String name;
    private int healingProperties;
    Protagonist h = new Protagonist();





    public Cure(String name, int healingProperties) {
        this.name = name;
        this.healingProperties = healingProperties;
    }


    public void cure(int healingProperties){
        h.heal(healingProperties);
    }

}
