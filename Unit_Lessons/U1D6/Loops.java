public class Loops {
    public static void main(String[] args) {
        int count = 0;
        while (count < 10) {
            System.out.println(count);
            count++;
        }

        boolean isRunning = true;
        while (isRunning) {
            count++;
            if (count == 100) {
                isRunning = false;
            }
        }

        // a for-loop is more compact with its syntax
        // a while loop is best when you don't know the exact number of repetitions

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }
}