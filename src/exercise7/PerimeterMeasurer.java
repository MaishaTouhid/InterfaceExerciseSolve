package exercise7;

public class PerimeterMeasurer implements Measurer {
    @Override
    public double measure(Object obj) {
        Rectangle rect = (Rectangle) obj;
        return rect.getPerimeter();
    }
}
