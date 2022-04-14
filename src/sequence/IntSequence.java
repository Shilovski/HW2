package sequence;

interface IntSequence {

    default boolean hasNext() { return true; }
    int next();

    static IntSequence of (int... numbers) {
        return new IntSequence() {
            private int count = 0;

            public boolean hasNext() {
                return count < numbers.length;
            }

            public int next() {
                count++;
                return numbers[count - 1];
            }
        };
    }

    static IntSequence constant(int value) {
        return () -> value;
    }
}
