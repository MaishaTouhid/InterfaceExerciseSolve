package exercise8;

import java.util.ArrayList;

public class Bag {
    private ArrayList<Item> items;

    // Constructor
    public Bag() {
        items = new ArrayList<>();
    }

    // Inner class Item
    private class Item {
        private String name;
        private int quantity;

        // Constructor for Item
        public Item(String name) {
            this.name = name;
            this.quantity = 1;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public int getQuantity() {
            return quantity;
        }

        public void incrementQuantity() {
            quantity++;
        }
    }

    // Method to add an item to the bag
    public void add(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                item.incrementQuantity();
                return;
            }
        }
        // If the item is not found, add a new Item to the list
        items.add(new Item(itemName));
    }

    // Method to count how many times an item has been added
    public int count(String itemName) {
        for (Item item : items) {
            if (item.getName().equals(itemName)) {
                return item.getQuantity();
            }
        }
        return 0; // Return 0 if the item is not found
    }

    // Optional: Method to display all items in the bag
    public void displayItems() {
        for (Item item : items) {
            System.out.println(item.getName() + ": " + item.getQuantity());
        }
    }

    public static void main(String[] args) {
        Bag myBag = new Bag();
        myBag.add("apple");
        myBag.add("banana");
        myBag.add("apple");
        myBag.add("orange");
        myBag.add("banana");
        myBag.add("apple");

        System.out.println("Count of apples: " + myBag.count("apple")); // Output: 3
        System.out.println("Count of bananas: " + myBag.count("banana")); // Output: 2
        System.out.println("Count of oranges: " + myBag.count("orange")); // Output: 1

        // Display all items
        myBag.displayItems();
    }
}


/*
Implement a class Bag that stores items represented as strings. Items can be repeated.
Supply methods for adding an item, and for counting how many times an item has
been added:
public void add(String itemName)
public int count(String itemName)
Your Bag class should store the data in an ArrayList<Item>, where Item is an inner class
with two instance variables: the name of the item and the quantity
 */
