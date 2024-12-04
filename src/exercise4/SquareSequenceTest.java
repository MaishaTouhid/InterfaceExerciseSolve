package exercise4;

public class SquareSequenceTest {

        public static void main(String[] args) {
            Sequence1 squareSequence = new SquareSequence();
            int[] firstFiveSquares = squareSequence.values(5);

            for (int value : firstFiveSquares) {
                System.out.println(value);
            }
        }


}
