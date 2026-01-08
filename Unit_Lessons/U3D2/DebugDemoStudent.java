// A set of small, intentionally buggy examples for students to debug.
// Each method is short and focuses on a single mistake.
public class DebugDemoStudent {

    // --- Exception tasks (trigger with bad inputs) ---

    // ArrayIndexOutOfBoundsException when array has fewer than 6 items.
    // Students: add a guard and throw ArrayIndexOutOfBoundsException (or a clear
    // message) if the array is too short instead of letting the JVM crash here.
    public static int getFifthElement(int[] arr) {
        if (arr.length < 5) {
            throw new IllegalArgumentException("Array length is less than 5");
        }
        return arr[4];
    }

    // ArithmeticException when b is zero.
    // Students: explicitly check for b == 0 and throw ArithmeticException with a
    // short message before dividing.
    public static int divideNumbers(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("You're attempting to break math!");
        }
        return a / b;
    }

    // NullPointerException when str is null (precondition allows null).
    // Students: if str is null, throw NullPointerException with a helpful message
    // instead of dereferencing it.
    public static int getStringLength(String str) {
        if (str == null) {
            throw new NullPointerException("The string doesn't exist!");
        }
        return str.length();
    }

    // NullPointerException when the target slot is null.
    // Students: check names[1] for null and throw NullPointerException if it is,
    // so callers get a clearer failure.
    public static int middleNameLength(String[] names) {
        if (names[1] == null) {
            throw new NullPointerException("This middle name doesn't exist!");
        }
        return names[1].length();
    }

    // IllegalArgumentException when array is null or empty.
    // Students: validate input and throw IllegalArgumentException with a short
    // message before doing the math.
    public static double averageScore(int[] scores) {
        int sum = 0;
        if (scores == null) {
            throw new IllegalArgumentException("This array is empty!");
        }
        for (int i = 0; i < scores.length; i++) {
            sum += scores[i];
        }
        return (double) sum / scores.length;
    }

    // IllegalArgumentException when n is negative.
    // Students: reject negative inputs with IllegalArgumentException so callers
    // know why they failed.
    public static int squareRootFloor(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("n can't be negative!");
        }
        return (int) Math.sqrt(n);
    }

    // IllegalArgumentException when bounds are invalid or string is null.
    // Students: ensure word is non-null and start/end are inside 0..length and
    // start <= end, otherwise throw IllegalArgumentException with a hint.
    public static String slice(String word, int start, int end) {
        if (word == null || start < 0 || end > word.length()) {
            throw new IllegalArgumentException("NOT CORRECT!");
        }
        return word.substring(start, end);
    }

    // --- Logic/loop bugs to step through in the debugger ---

    // BUG: loop never ends (condition counts up, update counts down).
    public static void countDown(int end) {
        for (int i = end; i > 0; i--) {
            System.out.println(i);
        }
    }

    // BUG: while loop never increments i, so it never stops.
    public static void printNumbersUntil(int n) {
        int i = 0;
        while (i < n) {
            System.out.println(i);
            i++;
        }
    }

    // BUG: off-by-one on the loop bound causes ArrayIndexOutOfBoundsException.
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    // BUG: returns false if either string is null even though precondition allows
    // nulls.
    public static boolean isEqualIgnoreCase(String str1, String str2) {
        return str1.toLowerCase().equals(str2.toLowerCase());
    }

    // Correct logic but useful for stepping through substring math.
    // Precondition: str length is at least n.
    public static String stringEnds(String str, int n) {
        if (str.length() < n) {
            throw new IllegalArgumentException("That's not the right length!");
        }
        return str.substring(0, n) + str.substring(str.length() - n);
    }

    // BUG: modifies the array, which may be unexpected for callers wanting a pure
    // sum.
    public static void incrementArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] += i;
        }
    }

    // BUG: toggling the sign happens at the wrong time; step through to see how
    // sum drifts. Intended to alternate + and - on successive elements.
    public static int alternatingSum(int[] nums) {
        int sum = 0;
        boolean add = true;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (add)
                sum += num;
            else
                sum -= num;
            add = !add;
            add = !add; // extra toggle makes the pattern hard to see without a debugger
        }
        return sum;
    }

    // BUG: tries to find the minimum but the comparison is reversed; debugger
    // watch on "min" helps reveal the mistake.
    public static int strangeMin(int[] nums) {
        int min = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > min) {
                min = nums[i];
            }
        }
        return min;
    }

    // BUG: intended to collect every other character, but increments i twice in
    // some iterations; stepping shows skipped characters and an occasional
    // StringIndexOutOfBoundsException when text is short.
    public static String everyOtherChar(String text) {
        String result = "";
        for (int i = 0; i < text.length(); i++) {
            result += text.charAt(i);
            i++;
            if (i < text.length() && text.charAt(i) == ' ') {
                i++;
            }
        }
        return result;
    }
}
