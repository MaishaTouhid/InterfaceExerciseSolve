package exercise7;
//Implement the Measurer as an Inner Class Inside the main Method
public class Main2 {
        public static void main(String[] args) {
            // Create an array of Rectangle objects
            Rectangle[] rectangles = {
                    new Rectangle(4, 5),
                    new Rectangle(7, 3),
                    new Rectangle(6, 8),
                    new Rectangle(5, 5)
            };

            // Implement the Measurer as an inner class
            class PerimeterMeasurer implements Measurer {
                @Override
                public double measure(Object obj) {
                    Rectangle rect = (Rectangle) obj;
                    return rect.getPerimeter();
                }
            }

            // Create an instance of the inner class
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
