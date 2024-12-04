package exercise5;


    public class SquareSequence1 implements Sequence2 {
        private int current = 0;

        @Override
        public int next() {
            current++;
            return current * current;
        }


}
