public class Unit3Exercises {

    // Intended: return the average length of the strings in the array.
    public static double calculateAverageStringLength(String[] strs) {
        if (strs == null) {
            throw new NullPointerException("Array cannot be null.");
        }
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
        if (counted == 0) {
            throw new IllegalArgumentException("Array contains no non-null strings.");
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
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
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
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                sum += numbers[i];
            } 
        }
        return sum;
    }

    // The method calculates the sum of the squares of numbers in an array.
    public static int calculateSumOfSquares(int[] numbers) {
        int sum = 0;
        if (numbers == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        if (numbers.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty.");
        }
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i] * numbers[i];
        }
        return sum;
    }   

    // The method returns the nth Fibonacci number, the sequence starts with 1.
    public static int getNthFibonacci(int n) {
        if (n < 1) {
            throw new IllegalArgumentException();
        }
        if (n == 1 || n == 2) {
            return 1;
        }
    
        int a = 1, b = 1;
        for (int i = 3; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }

    // [0, 1, 2, 3, 4]
    public static void sortArrayDescending(int[] arr) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        if (arr.length == 0) {
            throw new IllegalArgumentException("Array cannot be empty, try again!");
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }

    public static String findLongestWord(String sentence) {
        if (sentence == null || sentence.length() == 0) {
            throw new IllegalArgumentException("Sentence input is not valid. It's either empty or null, please try a new string.");
        }
        String[] words = sentence.split(" ");
        String longestWord = "";
        for (int i = 0; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            } 
        }
        return longestWord;
    }

    public static double calculateInterest(double principal, double rate, int years) {
        if (principal < 0) {
            throw new IllegalArgumentException("Principal amount cannot be negative");
        }
        if (rate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        if (years <= 0) {
            throw new IllegalArgumentException("Number of years must be a positive integer");
        }
        double principalSum = principal;
        for (int i = 0; i < years; i++) {
            principalSum += principalSum * (rate / 100);
        }
        return principalSum;
    }

    public static int parsePositiveInteger(String str) {
        if (str == null) {
            throw new NullPointerException("String cannot be null.");
        }
        int number = Integer.parseInt(str);
        if (number <= 0) {
            throw new NumberFormatException("Number needs to be greater than 0. Enter a new number and try again.");
        }
        return number; 
   
    }

    public static String getArrayElement(String[] arr, int index) {
        if (arr == null) {
            throw new NullPointerException("Array cannot be null.");
        }
        if (index < 0 || index >= arr.length) {
            throw new ArrayIndexOutOfBoundsException("Index " + index + " is out of bounds for array of length " + arr.length + ".");
        }
        return arr[index];
    
    }

    public static double calculateSquareRoot(int number) {
  
        if (number < 0) {
            throw new IllegalArgumentException("Cannot calculate square root of a negative number");
        }
        return Math.sqrt(number);

    }

    public static int sumArrayElements(int[] array) {
        if (array == null) {
            throw new NullPointerException("The array is null, please enter a new array and try again.");
        }
        if (array.length == 0) {
            throw new IllegalArgumentException("The array is empty, please enter a new array and try again.");
        }
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    
    }   

    public static double calculatePower(double base, int exponent) {
        if (exponent < 0) {
            throw new IllegalArgumentException("Exponent has to be positive. Try again.");
        }
        return Math.pow(base, exponent);
   }   


}