public class ForLoopDemo {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        // For Loop Anatomy
        // 1. Initialize the count
        // 2. Boolean condition to determien if we continue looping
        // 3. Do statements
        // 4. Iterator -> update the count for the next loop

        for (int count = 1; count < 10; count /= 1) {
            System.out.println(count);
        }

        
    }
}