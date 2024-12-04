package exercise1;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee(50000),
                new Employee(60000),
                new Employee(55000)
        };

       Employee largestSalary = (Employee) Measurable.largest(employees);
       Employee smallestSalary = (Employee) Measurable.smallest(employees);


        System.out.println("Employee with the largest salary: " + largestSalary.getMeasure());
        System.out.println("Employee with the smallest salary: " + smallestSalary.getMeasure());
    }
}
