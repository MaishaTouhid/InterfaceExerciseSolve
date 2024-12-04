package exercise3;

public class SequenceTest {

        public static void main(String[] args) {
            // Create a sequence of multiples of 3
            Sequence multiplesOf3 = Sequence.multiplesOf(3);
            System.out.println("Multiples of 3:");
            for (int i = 0; i < 10; i++) {
                System.out.println(multiplesOf3.next());
            }

            // Create a sequence of powers of 2
            Sequence powersOf2 = Sequence.powersOf(2);
            System.out.println("Powers of 2:");
            for (int i = 0; i < 10; i++) {
                System.out.println(powersOf2.next());
            }
        }


}
