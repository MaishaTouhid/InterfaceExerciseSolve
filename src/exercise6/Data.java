package exercise6;

public class Data {
    public static Object largest(Object[] objects, Measurer m) {
        if (objects == null || objects.length == 0) {
            return null; // Return null or throw an exception if the array is empty or null
        }

        Object largest = objects[0];
        double largestMeasure = m.measure(largest);

        for (Object obj : objects) {
            double currentMeasure = m.measure(obj);
            if (currentMeasure > largestMeasure) {
                largest = obj;
                largestMeasure = currentMeasure;
            }
        }

        return largest;
    }
}

