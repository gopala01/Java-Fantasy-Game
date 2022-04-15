package com.company;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class Bag {
    private ArrayList<Item> bagArray; //A new class Bag uses type Item to create a new ArrayList for the bag

    public Bag(){
        this.bagArray = new ArrayList<>();
    }

    public void add(Item item){
        this.bagArray.add(item);
    } //Adds a new item


    public int getSize(){
        return bagArray.size();
    } //Returns the size of the bag


    public Item getItem(int index){
        return this.bagArray.get(index);
    } //Returns the item at the index mention
    public String returnItem(Item item){

        for (int i = 0; i < bagArray.size(); i++) {

            if (bagArray.get(i).equals(item.getName())){
                return ("Item found at position " + (i+1));

            }
        }

        throw new NoSuchElementException("Item not found");

    } //Allows us to see where a specific item is in the bag

    public void removeItem(Item item){
        for (int i = 0; i < bagArray.size(); i++) {
            if (bagArray.get(i).getName().equals(item)){
                bagArray.remove(i);
            }
        }
        throw new NoSuchElementException("Item not found");
    } //Allows us to remove an item
}
