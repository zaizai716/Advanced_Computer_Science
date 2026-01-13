import java.util.Arrays;

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
        }

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

        // test calculateSumOfSquares()
        int[] practiceArray = {0, 1, 2, 3};
        System.out.println("Expected 14: " + Unit3Exercises.calculateSumOfSquares(practiceArray));
        // test null array
        try {
            int[] practiceArray1 = {};
            System.out.println("Expected exception: " + Unit3Exercises.calculateSumOfSquares(practiceArray1));
        } catch (Exception l) {
            System.out.println(l.toString());
            System.out.println("The method threw an exception when the string was null, as intended");
        }

        // test getNthFibonnaci()
        System.out.println("Expected 2: " + Unit3Exercises.getNthFibonacci(3));
        System.out.println("Expected 3: " + Unit3Exercises.getNthFibonacci(4));
        try {
            System.out.println("Expected exception: " + Unit3Exercises.getNthFibonacci(-2));
        } catch (Exception i) {
            System.out.println(i.toString());
            System.out.println("The method threw an exception when the number was negatives, as intended");
        }

        // test sortArrayDescending()
        int[] a = {1, 4, 2, 3, 0};
        Unit3Exercises.sortArrayDescending(a);
        System.out.println("Expected [4, 3, 2, 1, 0]: " + Arrays.toString(a));
        // test negative values
        int[] b = {-1, -4, -2, -3, 0};
        Unit3Exercises.sortArrayDescending(b);
        System.out.println("Expected [0, -1, -2, -3, -4]: " + Arrays.toString(b));
        // test null array
        try {
            int[] c = {};
            Unit3Exercises.sortArrayDescending(c);
            System.out.println("Expected [0, -1, -2, -3, -4]: " + Arrays.toString(c));
        } catch (Exception p) {
            System.out.println(p.toString());
            System.out.println("The method threw an exception when the array was null, as expected.");
        }

        // test findLongestWord()
        String sentence = "Hello my name is Justin";
        System.out.println("Expected Justin: " + Unit3Exercises.findLongestWord(sentence));
        // test if it returns first longest same length word
        String sentence2 = "Justin Hellos";
        System.out.println("Expected Justin: " + Unit3Exercises.findLongestWord(sentence2));
        // test null string
        try {
            String sentence3 = null;
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence3));
        } catch (Exception y) {
            System.out.println(y.toString());
            System.out.println("The method returned an exception, as expected.");
        }
        
        // test empty string
        try {
            String sentence4 = "";
            System.out.println("Expected exception: " + Unit3Exercises.findLongestWord(sentence4));
        } catch (Exception t) {
            System.out.println(t.toString());
            System.out.println(("The method returned an exception, as expected."));
        }

        // test calculateInterest()
        // main Case 1
        System.out.println("Expected 1102.5: " + Unit3Exercises.calculateInterest(1000, 5, 2));
        
        // main Case 2
        System.out.println("Expected 665.5: " + Unit3Exercises.calculateInterest(500, 10, 3));
        
        // test negative principal amount
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(-100, 5, 2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the principal was negative, as intended");
        }
        
        // test negative interest rate
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(1000, -5, 2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the interest rate was negative, as intended");
        }
        
        // test non-positive number of years (zero)
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(1000, 5, 0));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the number of years was zero, as intended");
        }
        
        // test non-positive number of years (negative)
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateInterest(1000, 5, -2));
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method threw an exception when the number of years was negative, as intended");
        }

        // test parsePositiveInteger()
        // test negative numbers
        try {
            String number = "-4";
            System.out.println("Expected exception: " + Unit3Exercises.parsePositiveInteger(number));
        } catch (Exception x) {
            System.out.println(x.toString());
            System.out.println("The method returned an exception for a negative number, as intended");
        }
        
        // test getArrayElement()
        // test out of bonds indices
        try {
            String[] array3 = {"a", "b", "c", "d", "e"};
            int number2 = -80;
            System.out.println("Expected exception: " + Unit3Exercises.getArrayElement(array3, number2));
        } catch (Exception z) {
            System.out.println(z.toString());
            System.out.println("The method threw an exception with an out of bound index, as intended.");
        }

        // test calculateSquareRoot()
        // test out negative number
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculateSquareRoot(-3));
        } catch (Exception c) {
            System.out.println(c.toString());
            System.out.println("Double.NaN");
        }

        // test sumArrayElements()
        try {
            int[] array5 = {};
            System.out.println("Expected exception: "+ Unit3Exercises.sumArrayElements(array5));
        } catch (Exception v) {
            System.out.println(v.toString());
            System.out.println("The method returned an exception with a null array, as intended");
        }

        // test calculatePower()
        try {
            System.out.println("Expected exception: " + Unit3Exercises.calculatePower(3.2, -1));
        } catch (Exception n) {
            System.out.println(n.toString());
            System.out.println("The method returned an exception when the exponent was negative, as intended");
        }



    }
}
