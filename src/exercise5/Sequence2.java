package exercise5;

public interface Sequence2 {

        int next();

        default void process(int n) {
            for (int i = 0; i < n; i++) {
                System.out.println(next());
            }
        }


}
