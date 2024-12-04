package exercise8;

public class TestBag {
    public static void main(String[] args) {
        Bag bag = new Bag();

        // Add items to the bag
        bag.add("Apple");
        bag.add("Banana");
        bag.add("Apple");
        bag.add("Orange");
        bag.add("Banana");
        bag.add("Apple");

        // Display item counts
        System.out.println("Apple count: " + bag.count("Apple"));
        System.out.println("Banana count: " + bag.count("Banana"));
        System.out.println("Orange count: " + bag.count("Orange"));
        System.out.println("Grapes count: " + bag.count("Grapes")); // Item not added

        // Display all items in the bag
        System.out.println("\nAll items in the bag:");
        bag.displayItems();
    }
}
