package exercise4;

public class SquareSequence implements Sequence1 {
    private int current = 0;

    @Override
    public int next() {
        current++;
        return current * current;
    }
}
