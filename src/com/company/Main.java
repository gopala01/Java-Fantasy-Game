package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = inputString("Hi friend! Whats your name");

        int age = inputInt("How old are you " + name);

        Protagonist hero = new Protagonist(name, age);
        //Implementing the class hero using their name and age

        print("Ok " + hero.getName() + " right now you have " + hero.getPoints() + " points");

        print("To win this game, get to 10 points. You lose this game when your health gets to 0");




        print("Ok " + hero.getName() + " welcome to the kingdom of Narnia! You are a person of nobility in the kingdom, and you decided" +
                " to go hunting with your pet dog.");

        String petName = inputString("What would you like to name your dog?");
        Dog pet = new Dog(petName, 4);
        int petAge = inputInt("What is the age of " + pet.getName() + "?");
        pet.setAge(petAge);

        //Creating a new pet, implementing the method setAge
        print("Well done " + hero.getName() + " for choosing a pet, you get 5 points");
        hero.addPoints(5);
        //Adding on points to the user



        print("On the way your dog gets scared and anxious");
        print(pet.getName() + ": ");
        pet.talk();
        pet.talk();
        //Using the method talk()



        print("You also hear thuds and you decide to ignore it");

        Monster mA  = new Monster("Aquarus", 3);
        //Creating a new Monster

        mA.stomp();
        mA.stomp();
        Item toothbrush = new Item("Toothbrush", 2);
        Item sword = new Item("Sword", 5);
        //Creating two new Items
        print("As you lean over to stroke him, you notice two items in front of you: A toothbrush and a sword");
        print(toothbrush.getName() + ": " + toothbrush.getDamage() + " damage \n" + sword.getName() + ": " + sword.getDamage() + " damage\nWhat would you like to add to your bag?");

        int itemChoice = chooseItem();

        if (itemChoice == 1){
            hero.addItem(toothbrush);
            print("A toothbrush? Maybe it can keep you healthier");
            print("For putting a " + hero.getItem(0).getName() + " in your bag you get " + toothbrush.getDamage() + " points");
            hero.addPoints(toothbrush.getDamage());
        }
        else {
            hero.addItem(sword);
            print("Wise choice! This will keep you safe");
            print("For putting " + hero.getItem(0).getName() + " in your bag you get " + sword.getDamage() + " points");
            hero.addPoints(sword.getDamage());

        }


        print("Now you see a monster in front of you, and you recognize this monster as:\n" + mA.getName() +
                "\nDamage: " + mA.getDamage());

        print("Right now in your bag you have " + hero.getItem(0).getName());

        int attackChoice = inputInt("What would you like to do?\n1. Attack with " + hero.getItem(0).getName() +"\n2.Attack with your dog");

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
        print("You have a health of " + hero.getHealth() + " and " + hero.getPoints() + " points so you must keep going");

        print(pet.getName() + " is happy now:");
        pet.wagTail();
        int cureChoice = inputInt("From the monster you find a cure point. What would you like to do?" +
                "\n1. Heal yourself\n2. Add to bag");
        Cure cureA = new Cure("Cure1", 2);
        if (cureChoice == 1){
            cureA.cure(hero);
        }
        else {
            hero.addItem(cureA);
        }


        int foodChoice = inputInt("On your way there you notice food. What would you like to do with it?\n1. Eat it\n2. Feed your dog");
        foodChoice = checkNumber(foodChoice);

        if (foodChoice == 1){
            hero.eat();
        }
        else {
            pet.eat();
        }
        //Using the eat methods

        Monster mB = new Monster("Blightous", 10);
        //Creating a new Monsyer
        print("You suddenly notice a second monster behind  you");
        mB.stomp();

        print("As this stomp is very loud, you both start running");
        print(pet.getName() + ":");
        pet.run();

        print(hero.getName() + ":");
        hero.run();
        int choice = inputInt("You are confronted by the monster now, what do you do?\n1. Attack \n2. Run");

        choice = checkNumber(choice);
        if (choice == 1){
            print("Right now in your bag you have " + hero.getItem(0));

            int weaponChoice = inputInt("What would you like to do?\n1. Attack with " + hero.getItem(0) +"\n2.Attack with your dog");

            weaponChoice = checkNumber(weaponChoice);

            if (weaponChoice == 1){
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
        }
    }




    public static void checkPoints(int points){
        if (points > 10 || points == 10){
            print("You have won the game");
            System.exit(0);
        }

    }

    public static void checkHeroHealth(int health){
        if (health < 0 || health == 0){
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
