package com.company;

public class Cure extends Item{

    //A subclass of Item with the additional variable of healingProperties
    private int healingProperties;




    public Cure(String name, int healingProperties) {
        super(name);
        this.healingProperties = healingProperties;
    }

    public int getHealingProperties() {
        return this.healingProperties;
    }

    public void cure(Protagonist p){
        p.heal(this.healingProperties);
    }

}
