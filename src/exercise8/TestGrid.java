package exercise8;

public class TestGrid {
    public static void main(String[] args) {
        // Create a 3x3 grid
        Grid grid = new Grid(3, 3);

        // Add descriptions to some locations
        grid.add(0, 0, "Top-left corner");
        grid.add(1, 1, "Center");
        grid.add(2, 2, "Bottom-right corner");

        // Get and display descriptions
        System.out.println("Description at (0, 0): " + grid.getDescription(0, 0));
        System.out.println("Description at (1, 1): " + grid.getDescription(1, 1));
        System.out.println("Description at (2, 2): " + grid.getDescription(2, 2));

        // Get all described locations
        System.out.println("Described Locations:");
        for (Grid.Location location : grid.getDescribedLocations()) {
            System.out.println(location + " - " + grid.getDescription(location.getRow(), location.getColumn()));
        }
    }

}
