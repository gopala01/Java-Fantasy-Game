package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Bag {
    private ArrayList<String> bagArray;

    public Bag(){
        this.bagArray = new ArrayList<>();
    }

    public void add(String item){
        this.bagArray.add(item);
    }


    public int getTotalItems(){
        return bagArray.size();
    }


    public String getItem(int index){
        return this.bagArray.get(0);
    }
    public String returnItem(String item){

        for (int i = 0; i < bagArray.size(); i++) {

            if (bagArray.get(i).equals(item)){
                return bagArray.get(i);

            }
        }

        throw new NoSuchElementException("Item not found");

    }

    public void remove(String item){
        for (int i = 0; i < bagArray.size(); i++) {


            if (bagArray.get(i).equals(item)){
                bagArray.remove(i);
            }
        }
        throw new NoSuchElementException("Item not found");
    }
}
