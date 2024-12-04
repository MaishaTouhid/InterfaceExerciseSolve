package exercise2;

public class PersonTest {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 170),
                new Person("Bob", 180),
                new Person("Charlie", 175),
                new Person("Diana", 160),
                new Person("Eve", 165)
        };

      //  double averageHeight = Data.average(people);
      //  Person tallestPerson = (Person) Data.max(people);
        double averageHeight = Data.average(people);
        Person tallestPerson = (Person) Data.max(people);

        System.out.println("Average Height: " + averageHeight + " cm");
        System.out.println("Tallest Person: " + tallestPerson.getName() + " (" + tallestPerson.getMeasure() + " cm)");
    }
}
