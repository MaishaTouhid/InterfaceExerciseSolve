package exercise6;

public class Main {
    public static void main(String[] args) {
        // Example objects: let's use an array of strings and measure their lengths
        String[] words = { "apple", "banana", "cherry", "date", "elderberry" };

        // Define a Measurer that measures the length of a String
        Measurer stringLengthMeasurer = new Measurer() {
            @Override
            public double measure(Object obj) {
                String str = (String) obj;
                return str.length();
            }
        };

        // Find the word with the largest length
        String longestWord = (String) Data.largest(words, stringLengthMeasurer);

        System.out.println("The longest word is: " + longestWord);
    }
}

