public class DecompositionSolution {
    public static void run() {
        int[] hours = hoursArray();
        int[] steps = stepsArray();
        int[] activeMinutes = activeMinutesArray();
    }

    public static int[] hoursArray() {
        return new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};
    }

    public static int[] stepsArray() {
        return new int[] {120, 90, 60, 50, 80, 300, 120, 2200, 2800, 2500, 1000, 900};
    }

    public static int[] activeMinutesArray() {
        return new int[] {2, 1, 0, 0, 1, 10, 35, 50, 55, 48, 32, 15};
    }

    public static boolean lengthValidator(int[] array1, int[] array2, int[] array3) {
        return array1.length == array2.length && array2.length == array3.length;
    }

    public static int sum(int[] array) {
        int sumTotal = 0;
        for (int i = 0; i < array.length; i++) {
            sumTotal += array[i];
        }
        return sumTotal;
    }

    // Methods have to have a single purpose

}