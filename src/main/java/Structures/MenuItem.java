package Structures;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.ArrayList;

/**
 * An object representing an item that can be ordered by a user of a web application from that app's menu of choices.
 */
@Table (name = "menu item")
public class MenuItem extends Item{
    @Id
    @Column(name = "id", nullable = false)
    private int id;
    @Column(name = "price", nullable = false)
    private double salePrice;
    private ArrayList<Item> ingredients;
    //TODO: look for an associated structure to replace this
    private ArrayList<String> nutritionFacts;
    @Column(name = "available", nullable = false)
    private boolean available;

    public MenuItem(String aName, int id, double salePrice, ArrayList<Item> ingredients,
                    ArrayList<String> nutritionFacts, boolean available) {
        super(aName);
        this.id = id;
        this.salePrice = salePrice;
        this.ingredients = ingredients;
        this.nutritionFacts = nutritionFacts;
        this.available = available;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(double salePrice) {
        this.salePrice = salePrice;
    }

    public ArrayList<Item> getIngredients() {
        return ingredients;
    }

    public void setIngredients(ArrayList<Item> ingredients) {
        this.ingredients = ingredients;
    }

    public ArrayList<String> getNutritionFacts() {
        return nutritionFacts;
    }

    public void setNutritionFacts(ArrayList<String> nutritionFacts) {
        this.nutritionFacts = nutritionFacts;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
