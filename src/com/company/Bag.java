package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Bag {
    private ArrayList<Item> bagArray;

    public Bag(){
        this.bagArray = new ArrayList<>();
    }

    public void add(Item item){
        this.bagArray.add(item);
    }


    public int getSize(){
        return bagArray.size();
    }


    public Item getItem(int index){
        return this.bagArray.get(0);
    }
    public String returnItem(Item item){

        for (int i = 0; i < bagArray.size(); i++) {

            if (bagArray.get(i).equals(item.getName())){
                return bagArray.get(i).getName();

            }
        }

        throw new NoSuchElementException("Item not found");

    }

    public void removeItem(Item item){
        for (int i = 0; i < bagArray.size(); i++) {
            if (bagArray.get(i).getName().equals(item)){
                bagArray.remove(i);
            }
        }
        throw new NoSuchElementException("Item not found");
    }
}
