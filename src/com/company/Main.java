package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String name = inputString("Hi friend! Whats your name");

        int age = inputInt("How old are you " + name);

        Protagonist hero = new Protagonist(name, age);

        print("Ok " + hero.getName() + " right now you have " + hero.getPoints() + " points");


        int petChoice = choosePet();

        if (petChoice == 1){
            String petName = inputString("What is the name of the cat?");
            Cat cat = new Cat(petName);
            int petAge = inputInt("What is the age of " + cat.getName() + "?");
            cat.setAge(petAge);
        }
        else if (petChoice == 2){
            String petName = inputString("What is the name of the cat?");
            Dog dog = new Dog(petName);
            int petAge = inputInt("What is the age of " + dog.getName() + "?");
            dog.setAge(petAge);
        }

        print("Well done " + hero.getName() + " for choosing a pet, you get 5 points");
        hero.addPoints(5);


        int itemChoice = chooseItem();

        if (itemChoice == 1){
            hero.addItem("Toothbrush");
            print("Toothbrush? Maybe it can keep your teeth healthier");
            print("For putting " + hero.getItem(0) + " in your bag you get 2 points");
            hero.addPoints(2);
        }
        else {
            hero.addItem("Sword");
            print("Wise choice! This will keep you safe");
            print("For putting " + hero.getItem(0) + " in your bag you get 5 points");
            hero.addPoints(5);

        }

        print("For putting " + hero.getItem(0) + " in your bag you get 2 points");
    }


    public static int chooseItem(){
        int choice = inputInt("What would you like to add to your bag? \n1. A toothbrush\n2. A sword");
        choice = checkNumber(choice);
        return choice;
    }


    public static int choosePet(){
        int choice = inputInt("What is the animal you want as a pet? \n1. Cat \n2. Dog");
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
