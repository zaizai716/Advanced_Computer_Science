public class ShortCircuitEvaluation {
    public static void main(String[] args) {
        
        String[] names = {"henry", "Crystal", "Boyan", "Daniel", "Owen", "Ava", "Morgan", "Justin", null};

        // count how many students are in the class

        int count = 0;
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                count++;
            }
        }

        System.out.println(count);
    }

    // short circuit evaluation

    // T && T -> true
    // F && ?? -> false (skips second condition)

    // T || ?? -> true (skips second condition)
    // F || T -> true

}