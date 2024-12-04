package exercise3;

public interface Sequence {
    int next();
   // boolean hasNext();

    // Static method to create a sequence of multiples of n
    static Sequence multiplesOf(int n) {
        return new Sequence() {
            private int current = n;

            @Override
            public int next() {
                int result = current;
                current += n;
                return result;
            }

          //  @Override
          //  public boolean hasNext() {
              //  return true; // Always true for this sequence
          //  }
        };
    }

    // Static method to create a sequence of powers of n
    static Sequence powersOf(int n) {
        return new Sequence() {
            private int current = 1;

            @Override
            public int next() {
                int result = current;
                current *= n;
                return result;
            }

          //  @Override
          //  public boolean hasNext() {
             //   return true; // Always true for this sequence
           // }
        };
    }
}

