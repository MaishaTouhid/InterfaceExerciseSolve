package exercise2;

public class Data {
    public static double average(Measurable[] objects) {
        if (objects == null || objects.length == 0) {
            return 0;
        }

        double sum = 0;
        for (Measurable obj : objects) {
            sum += obj.getMeasure();
        }
        return sum / objects.length;
    }

    public static Measurable max(Measurable[] objects) {

        return Measurable.largest(objects);
    }
}

