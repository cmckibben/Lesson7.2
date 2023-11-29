package org.example;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    //Create an ArrayList
    ArrayList<String> shoppingList = new ArrayList<String>();

    System.out.println("Your list contains:");
    System.out.println(shoppingList);

    //Check the size
    System.out.println("Your shopping list contains " + shoppingList.size() + " items");

    //Add ingredients missing for Chile Verde
    shoppingList.add("1.5 lbs tomatillos");
    shoppingList.add("2 poblano peppers");
    shoppingList.add("1 bunch cilantro");
    shoppingList.add("8 garlic cloves");
    shoppingList.add("2 jalapenos");
    shoppingList.add("3 pounds pork tenderloin");
    shoppingList.add("2 yellow onions");
    shoppingList.add("2 1/2 cups chicken stock");

    System.out.println("Your list contains:");
    System.out.println(shoppingList);
    System.out.println("Your shopping list contains " + shoppingList.size() + " items");

    //Change the poblano peppers to anaheim peppers
    shoppingList.set(1,"2 anaheim peppers");

    System.out.println("Your list contains:");
    System.out.println(shoppingList);
    System.out.println("Your shopping list contains " + shoppingList.size() + " items");

    //Remove the garlic
    shoppingList.remove(3);

    System.out.println("Your list contains:");
    System.out.println(shoppingList);
    System.out.println("Your shopping list contains " + shoppingList.size() + " items");

    //Insert cloves between anaheim peppers and cilantro
    shoppingList.add(2,"whole cloves");

    System.out.println("Your list contains:");
    System.out.println(shoppingList);
    System.out.println("Your shopping list contains " + shoppingList.size() + " items");
  }
}