package exercise7;

public class Main1 {
    public static void main(String[] args) {
        // Create an array of Rectangle objects
        Rectangle[] rectangles = {
                new Rectangle(4, 5),
                new Rectangle(7, 3),
                new Rectangle(6, 8),
                new Rectangle(5, 5)
        };

        // Create a PerimeterMeasurer instance
        Measurer perimeterMeasurer = new PerimeterMeasurer();

        // Find the rectangle with the largest perimeter
        Rectangle largestPerimeterRectangle = (Rectangle) Data.largest(rectangles, perimeterMeasurer);

        // Display the rectangle with the largest perimeter
        System.out.println("The rectangle with the largest perimeter has a width of " +
                largestPerimeterRectangle.getWidth() + " and a height of " +
                largestPerimeterRectangle.getHeight() + ", with a perimeter of " +
                largestPerimeterRectangle.getPerimeter());
    }
}
