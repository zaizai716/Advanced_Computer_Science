public class Unit3ExercisesTester {
    public static void main(String[] args) {

        // test calculateStringAverage()

        String[] letters = { "abc", "cde", "efg", "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null element in array
        letters = new String[] { "abc", "cde", "efg", null, "hij" };
        // expected output: 3.0
        System.out.println("Expected 3.0: " + Unit3Exercises.calculateAverageStringLength(letters));
        // Test Case - Edge Case: Null array
        try {
            letters = null;
            System.out.println("Expected exception: " + Unit3Exercises.calculateAverageStringLength(letters));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the array was null, as intended");
}

        // test reverseString()
        String testString = "abc";
        System.out.println("Expected cba: " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with spaces at the end and in the middle
        testString = " ab c ";
        System.out.println("Expected ' c ba ': " + Unit3Exercises.reverseString(testString));
        // Test Case - Edge Case: String with special characters,
        testString = "a1b!c&";
        System.out.println("Expected '&c!b1a': " + Unit3Exercises.reverseString(testString));
         // Test Case - Edge Case: Null string
        try{
            testString = null;
            System.out.println("Expected exception: " + Unit3Exercises.reverseString(testString));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the string was null, as intended");


        // test findMaxValue()
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Expected 5: " + Unit3Exercises.findMaxValue(array));
        // Test negative and zero integers
        int[] array1 = {0, -1, -2, -3, -4};
        System.out.println("Expected 0: " + Unit3Exercises.findMaxValue(array1));
        // Test only negative numbers
        int[] array2 = {-1, -2, -3, -4, -5};
        System.out.println("Expected -1: " + Unit3Exercises.findMaxValue(array2));
        // Test null array
        try {
            int[] array3 = {};
            System.out.println("Expected exception: " + Unit3Exercises.findMaxValue(array3));
        } catch (Exception f) {
            System.out.println(f.toString());
            System.out.println("The method threw an exception when the string was null, as intended");

        }

        // test ifPalindrome()
        String string = "deed";
        System.out.println("Expected true: " + Unit3Exercises.isPalindrome(string));
        // test non palindrome string
        String string1 = "hello";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(string1));
        // test empty string
        String string2 = "";
        System.out.println("Expected false: " + Unit3Exercises.isPalindrome(string2));
        // test null string
        try {
            String string3 = null;
            System.out.println("Expected false: " + Unit3Exercises.isPalindrome(string3));
        } catch (Exception d) {
            System.out.println(d.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        // test sumEvenNumbers()
        int[] testArray = {1, 2, 3, 4, 5};
        System.out.println("Expected 6: " + Unit3Exercises.sumEvenNumbers(testArray));
        // negative even and odd integers array
        int[] testArray1 = {-1, -2, -3, -4, -5};
        System.out.println("Expected -6: " + Unit3Exercises.sumEvenNumbers(testArray1));
        // positive and negative even and odd integers array
        int[] testArray2 = {-1, -2, -3, 4, 5}; 
        System.out.println("Expected 2: " + Unit3Exercises.sumEvenNumbers(testArray2));
        // null array
        try {
            int[] testArray3 = {}; 
            System.out.println("Expected exception: " + Unit3Exercises.sumEvenNumbers(testArray3));
        } catch (Exception j) {
            System.out.println(j.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }
      



        



}

    }
   


}
