package exercise8;

import java.util.ArrayList;

public class Grid {
    private String[][] grid; // 2D array to store descriptions
    private int numRows;
    private int numColumns;

    // Constructor
    public Grid(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns];
    }

    // Inner class Location
    public class Location {
        private int row;
        private int column;

        // Constructor for Location
        public Location(int row, int column) {
            this.row = row;
            this.column = column;
        }

        // Getters
        public int getRow() {
            return row;
        }

        public int getColumn() {
            return column;
        }

        @Override
        public String toString() {
            return "Location [row=" + row + ", column=" + column + "]";
        }
    }

    // Method to add a description to a specific location in the grid
    public void add(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description;
        } else {
            throw new IndexOutOfBoundsException("Invalid grid location");
        }
    }

    // Method to get the description at a specific location
    public String getDescription(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return grid[row][column];
        } else {
            throw new IndexOutOfBoundsException("Invalid grid location");
        }
    }

    // Method to get a list of all locations with descriptions
    public ArrayList<Location> getDescribedLocations() {
        ArrayList<Location> describedLocations = new ArrayList<>();
        for (int row = 0; row < numRows; row++) {
            for (int column = 0; column < numColumns; column++) {
                if (grid[row][column] != null) {
                    describedLocations.add(new Location(row, column));
                }
            }
        }
        return describedLocations;
    }

    public static void main(String[] args) {
        Grid myGrid = new Grid(3, 3);
        myGrid.add(0, 0, "Top left corner");
        myGrid.add(1, 1, "Center");
        myGrid.add(2, 2, "Bottom right corner");

        System.out.println("Description at (1, 1): " + myGrid.getDescription(1, 1));

        ArrayList<Location> describedLocations = myGrid.getDescribedLocations();
        System.out.println("Locations with descriptions:");
        for (Location loc : describedLocations) {
            System.out.println(loc + " -> " + myGrid.getDescription(loc.getRow(), loc.getColumn()));
        }
    }
}

/*
Implement a class Grid that stores measurements in a rectangular grid. The grid has
a given number of rows and columns, and a description string can be added for any
grid location. Supply the following constructor and methods:
public Grid(int numRows, int numColumns)
public void add(int row, int column, String description)
public String getDescription(int row, int column)
public ArrayList<Location> getDescribedLocations()
Here, Location is an inner class that encapsulates the row and the column of a grid
location
 */
