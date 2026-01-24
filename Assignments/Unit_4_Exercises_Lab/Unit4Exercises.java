import java.util.ArrayList;
import java.util.Arrays;

public class Unit4Exercises {

    // Method 1: matchingEndSequences
    public static boolean matchingEndSequences(int[] nums, int n) {
        // to-do: implement the method
        int[] array = Arrays.copyOfRange(nums, 0, n);
        int[] endArray = Arrays.copyOfRange(nums, (nums.length - n) - 1, nums.length - 1);

        for (int i = 0; i < array.length; i++) {
            if (array[i] != endArray[i]) {
                return false;
            }
        }

        return true;
    }

    // Method 2: hasThreeConsecutive
    public static boolean hasThreeConsecutive(int[] nums) {
        // to-do: implement the method

        for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] % 2 == 0 && nums[i + 1] % 2 == 0 && nums[i + 2] % 2 == 0) {
                return true;
            } else if (nums[i] % 2 == 1 && nums[i + 1] % 2 == 1 && nums[i + 2] % 2 == 1) {
                return true;
            }
        }
        return false;
    }

    // Method 3: generateNumberSequence
    public static int[] generateNumberSequence(int start, int end) {
        // to-do: implement the method
        int[] array = {};
        for (int i = start; i < end; i++) {
            array[i] = i;
        }
        return array;
    }

    // Method 4: fizzBuzz
    public static String[] fizzBuzz(int start, int end) {
        // to-do: implement the method
        int[] array = generateNumberSequence(start, end);
        String[] stringArray = {};
        for (int i = 0; i < array.length; i++) {
            stringArray[i] = String.valueOf(array[i]);
        }

        for (int i = 0; i < stringArray.length; i++) {
            if (Integer.parseInt(stringArray[i]) % 3 == 0) {
                stringArray[i] = "Fizz";
            }
            if (Integer.parseInt(stringArray[i]) % 5 == 0) {
                stringArray[i] = "Buzz";
            }
            if (Integer.parseInt(stringArray[i]) % 3 == 0 && Integer.parseInt(stringArray[i]) % 5 == 0) {
                stringArray[i] = "FizzBuzz";
            }
        }

        return stringArray;
    }

    // Method 5: moveEvenBeforeOdd
    public static int[] moveEvenBeforeOdd(int[] nums) {
        // to-do: implement the method
        int[] array = {};
        for (int i = 0; i < nums.length; i++) {
            array[i] = nums[i];
        }

        for (int i = 0; i < array.length; i++) {
            if (nums[i] % 2 == 0) {
                array[i] = nums[i];
            }
        }
        return new int[0];
    }

    // ArrayList Methods

    // Method 1: noNegatives
    public static ArrayList<Integer> noNegatives(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();

    }

    // Method 2: excludeTeenNumbers
    public static ArrayList<Integer> excludeTeenNumbers(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 3: appendY
    public static ArrayList<String> appendY(ArrayList<String> strs) {
        // to-do: implement the method
        return new ArrayList<>();
    }

    // Method 4: squarePlus10
    public static ArrayList<Integer> squarePlus10(ArrayList<Integer> nums) {
        // to-do: implement the method
        return new ArrayList<>();
    }

}
