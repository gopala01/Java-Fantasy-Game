package com.company;

public class Cure extends Item{

    private int healingProperties;




    public Cure(String name, int healingProperties) {
        super(name);
        this.healingProperties = healingProperties;
    }


    public void cure(Protagonist p){
        p.heal(this.healingProperties);
    }

}
