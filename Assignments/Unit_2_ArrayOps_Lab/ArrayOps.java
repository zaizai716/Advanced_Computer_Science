public class ArrayOps {

    /**
     * Prints the contents of a string array, separating each element with a
     * comma and enclosing the output in square brackets [].
     *
     * @param array
     *              The String array to be printed.
     * @return The constructed string representation of the array.
     */
    public static String printStringArray(String[] array) {
        String s = "[";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                String c = array[i] + "]";
                s += c;
            } else {
                s += array[i] + ", ";
            }
        }
        System.out.println(s);
        return s;
    }

    /**
     * Prints the contents of an int array, separating each element with a comma and
     * enclosing the output in square brackets [].
     *
     * @param array
     *              The int array to be printed.
     * @return The String representation of the array.
     */

    public static String printIntegerArray(int[] array) {
        String s = "[";

        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                String c = array[i] + "]";
                s += c;
            } else {
                s += array[i] + ", ";
            }
        }
        System.out.println(s);
        return s;
    }

    /**
     * The method finds the largest integer in the array.
     *
     * @param array
     *              The int array to find the maximum value from.
     * @return The largest integer in the array.
     */
    public static int findMax(int[] array) {
        int max = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    /**
     * The method returns the longest String in the array.
     * If two Strings share the longest length, the method will return the one that
     * appears first in the array.
     *
     * @param array
     *              The String array to find the longest String from.
     * @return The longest String in the array.
     */
    public static String findLongestString(String[] array) {
        String longestString = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i].length() > longestString.length()) {
                longestString = array[i];
            }
        }
        return longestString;
    }

    /**
     * Calculates the average length of all the Strings in the array.
     *
     * @param array
     *              The String array to find the average string length from.
     * @return The average length of all the Strings in the array.
     */
    public static double averageStringLength(String[] array) {
        int totalSum = 0;

        for (int i = 0; i < array.length; i++) {
            totalSum += array[i].length();
        }

        return (double) totalSum / array.length;
    }

    /**
     * Counts the number of times each letter appears in the given String.
     * The method creates an array of integers length 26, where each element
     * represents the
     * frequency of a letter in the alphabet. The first element (index 0) represents
     * the frequency of the letter 'a', the second element (index 1) represents the
     * frequency of the letter 'b', and so on.
     *
     * @param input
     *              The input string to count letter frequencies from.
     * @return An int array representing the frequency of each letter in the input
     *         string.
     */
    public static int[] countLetterFrequencies(String input) {
        String lowerInput = input.toLowerCase();
        if (input.length() == 0) {
            return new int[0];
        }
        int[] list = new int[26];

        for (int i = 0; i < lowerInput.length(); i++) {
            int c = lowerInput.charAt(i) - 'a';
            if (c >= 0 && c <= 25) {
                list[c]++;
            }
        }

        return list;
    }

    /**
     * Removes the indicated element, shifts the index of all the elements down by
     * one, and assigns a value of zero to the last element in the array.
     *
     * @param array
     *              The array of int values
     * @param index
     *              The index of the element to be removed
     * @return The updated array
     */
    public static int[] removeIntAndScoot(int[] array, int index) {
        // create duplicate array
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = array[i];
        }

        // shift elements down by one starting from the index
        for (int i = index; i < array2.length - 1; i++) {
            array2[i] = array2[i + 1];
        }
        
        // set the last element to zero
        array2[array2.length - 1] = 0;

        return array2;
    }

    /**
     * Resizes the input array to twice its size.
     *
     * @param array
     *              The input array of integers
     * @return The resized array
     */
    public static int[] resizeIntArray(int[] array) {
        // exception handling
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return new int[0];
        }

        // creating second half of array
        int[] array2 = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            array2[i] = 0;
        }

        int[] array3 = new int[array.length * 2];
        for (int i = 0; i < (array.length * 2); i++) {
            if (i < array.length) {
                array3[i] = array[i];
            } else {
                array3[i] = 0;
            }
        }

        return array3;

    }

    /**
     * Adds the number symbol (#) and the element number (index) to the beginning of
     * each
     * String in the array.
     * For example, if the array contained: {"Hello", "my", "name", "is", "Larry"},
     * then this method would return an array with the contents:
     * {"#0 Hello", "#1 my", "#2 name", "#3 is", "#4 Larry"}.
     *
     * @param array
     *              The array of Strings to modify
     * @return The modified array with the number symbol and element number added to
     *         each String
     */
    public static String[] addNumToStringArray(String[] array) {
        // exception handling
        if (array == null) {
            return null;
        }
        if (array.length == 0) {
            return new String[0];
        }

        String[] result = new String[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                result[i] = null;
            } else {
                result[i] = "#" + i + " " + array[i];
            }
        }

        return result;
    }

    /**
     * Reverses the order of the elements in the given integer array.
     *
     * @param array
     *              The array to be reversed
     * @return The reversed array
     */
    public static int[] reverseIntArray(int[] array) {
        if (array == null) {
            return null;
        }
        int[] reversed = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            reversed[i] = array[array.length - 1 - i];
        }
        return reversed;
    }

}
