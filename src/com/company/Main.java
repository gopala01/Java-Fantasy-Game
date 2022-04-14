package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = inputString("Hi friend! Whats your name");

        int age = inputInt("How old are you " + name);

        Protagonist hero = new Protagonist(name, age);

        print("Ok " + hero.getName() + " right now you have " + hero.getPoints() + " points");

        print("To win this game, get to 10 points. You lose this game when your health gets to 0");




        print("Ok " + hero.getName() + " welcome to the kingdom of Narnia! You are a person of nobility in the kingdom, and you decided" +
                " to go hunting with your pet dog.");

        String petName = inputString("What would you like to name your dog?");
        Animal pet = new Dog(petName, 4);
        int petAge = inputInt("What is the age of " + pet.getName() + "?");
        pet.setAge(petAge);

        print("Well done " + hero.getName() + " for choosing a pet, you get 5 points");
        hero.addPoints(5);


        print("On the way your dog gets scared and anxious");
        print(pet.getName() + ": ");
        pet.talk();
        pet.talk();

        Monster mA  = new Monster("Aquarus", 3);

        print("You also hear thuds and you decide to ignore it");

        mA.stomp();
        mA.stomp();
        Item baguette = new Item("baguette", 2);
        Item sword = new Item("Sword", 5);
        print("As you lean over to stroke him, you notice two items in front of you: A toothbrush and a sword");
        print(baguette.getName() + ": " + baguette.getDamage() + " damage \n" + sword.getName() + ": " + sword.getDamage() + " damage");

        int itemChoice = chooseItem();

        if (itemChoice == 1){
            hero.addItem(baguette);
            print("A baguette? Maybe it can keep you healthier");
            print("For putting a " + hero.getItem(0) + " in your bag you get " + baguette.getDamage() + " points");
            hero.addPoints(baguette.getDamage());
        }
        else {
            hero.addItem(sword);
            print("Wise choice! This will keep you safe");
            print("For putting " + hero.getItem(0) + " in your bag you get " + sword.getDamage() + " points");
            hero.addPoints(sword.getDamage());

        }
        print("Now you see a monster in front of you, and you recognize this monster as:\n" + mA.getName() +
                "\nDamage: " + mA.getDamage());

        print("Right now in your bag you have " + hero.getItem(0));

        int attackChoice = inputInt("What would you like to do?\n1. Attack with " + hero.getItem(0) +"\n2.Attack with your dog");

        attackChoice = checkNumber(attackChoice);

        if (attackChoice == 1){
            int result = hero.getItem(0).getDamage() - mA.getDamage();

            if (result > 0){
                hero.addPoints(result);
            }
            else {
                hero.removeHealth(-result);
            }
        }
        else {
            int result = pet.getDamage() - mA.getDamage();

            if (result > 0){
                hero.addPoints(result);
            }
            else {
                hero.removeHealth(-result);
            }
        }

        checkHeroHealth(hero.getHealth());

        checkPoints(hero.getPoints());
        print("You have a health of " + hero.getHealth() + " and " + hero.getPoints() + " so you must keep going");

        int cureChoice = inputInt("From the monster, you find health, you find a cure point. What would you like to do?" +
                "\n1. Heal yourself\n2. Add to bag");
        Cure cure = new Cure("Cure1", 2);
        if (cureChoice == 1){
            cure.cure(2);
        }
        else {
            hero.addItem(cure);
        }
    }




    public static void checkPoints(int points){
        if (points < 10 || points == 10){
            print("You have won the game");
            System.exit(0);
        }

    }

    public static void checkHeroHealth(int health){
        if (health > 0 || health == 0){
            print("You have lost the game");
            System.exit(0);
        }

    }
    public static int chooseItem(){
        int choice = inputInt("What would you like to add to your bag? \n1. A toothbrush\n2. A sword");
        choice = checkNumber(choice);
        return choice;
    }



    public static int checkNumber(int choice){
        while (choice != 1 && choice != 2){
            choice = inputInt("Please choose between 1 or 2");
        }
        return choice;
    }
    public static void print(String m){
        System.out.println(m);
    }

    public static String inputString(String m){
        String answer;
        Scanner scanner = new Scanner(System.in);

        System.out.println(m);

        answer = scanner.nextLine();

        return answer;
    }

    public static int inputInt(String m){
        int answer;
        Scanner scanner = new Scanner(System.in);
        System.out.println(m);
        answer = scanner.nextInt();
        return answer;
    }

}
