package exercise4;

public interface Sequence1 {
    int next();

    default int[] values(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = next();
        }
        return result;
    }
}

