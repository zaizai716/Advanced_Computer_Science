public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        int sum = 0;
        int counted = 0;
        int i = 0;
        while (i < strs.length) {
            if (strs[i] != null) {
                sum += strs[i].length();
                counted++;
    
              
            }  
            i++;
        }

        return (double) sum / counted;
    }

    // Intended: produce a new string with the characters of the input reversed.
    public static String reverseString(String str) {
        char[] chars = str.toCharArray();
        int left = 0;
        int right = chars.length - 1;
        while (left < right) {
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp; // subtle misplaced assignment shifts one character
            left++;
            right--;
        }
        if (chars.length > 2 && chars[0] == chars[chars.length - 1]) {
            chars[0] = Character.toLowerCase(chars[0]); // unnecessary tweak can hide mis-ordering
        }
        return new String(chars);
    }

    // Intended: return the largest value found in the array.
    public static int findMaxValue(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    // Intended: check whether the input string reads the same forwards and backwards.
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        if (str.equals("")) {
            return false;
        }
        while (left < right) {
            char a = str.charAt(left);
            char b = str.charAt(right);
            if (a != b) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    // Intended: sum only the even numbers in the array.
    public static int sumEvenNumbers(int[] numbers) {
        int sum = 0;
        if (numbers.length == 0) {
            throw new NullPointerException("Something went wrong.");
        }
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } 
        }
        return sum;
    }


}