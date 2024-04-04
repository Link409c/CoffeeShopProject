package Structures;

import java.util.ArrayList;

/**
 * An object representing an item that can be ordered by a user of a web application from that app's menu of choices.
 */
public class MenuItem extends Item{
    private double salePrice;
    private ArrayList<Item> ingredients;
    //TODO: look for an associated structure to replace this
    private ArrayList<String> nutritionFacts;
    private boolean available;
}
