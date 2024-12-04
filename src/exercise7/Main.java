package exercise7;
// Implement the Measurer as an Inner Class in the Main Class
public class Main {
    // Inner class PerimeterMeasurer
    class PerimeterMeasurer implements Measurer {
        @Override
        public double measure(Object obj) {
            Rectangle rect = (Rectangle) obj;
            return rect.getPerimeter();
        }
    }

    public static void main(String[] args) {
        // Create an array of Rectangle objects
        Rectangle[] rectangles = {
                new Rectangle(4, 5),
                new Rectangle(7, 3),
                new Rectangle(6, 8),
                new Rectangle(5, 5)
        };

        // Create an instance of Main to access the inner class
        Main mainInstance = new Main();

        // Create an instance of the inner class PerimeterMeasurer
        Measurer perimeterMeasurer = mainInstance.new PerimeterMeasurer();

        // Find the rectangle with the largest perimeter
        Rectangle largestPerimeterRectangle = (Rectangle) Data.largest(rectangles, perimeterMeasurer);

        // Display the rectangle with the largest perimeter
        System.out.println("The rectangle with the largest perimeter has a width of " +
                largestPerimeterRectangle.getWidth() + " and a height of " +
                largestPerimeterRectangle.getHeight() + ", with a perimeter of " +
                largestPerimeterRectangle.getPerimeter());
    }
}
