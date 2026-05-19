import java.util.ArrayList;

public class ArrayVersusArrayList {

    public static void main(String[] args) {

        System.out.println("== Testing Arrays lastComesFirst() ==");
        testLastComesFirst1();
        System.out.println();

        System.out.println("== Testing ArrayLists lastComesFirst() ==");
        testLastComesFirst2();
        System.out.println();

        System.out.println("== Testing Arrays firstComesLast() ==");
        testFirstComesLast1();
        System.out.println();

        System.out.println("== Testing ArrayLists firstComesLast() ==");
        testFirstComesLast2();

    }

    // modifies the given array by moving the last element to the first index,
    // and shifting all other elements to the right.
    public static void lastComesFirst(String[] arr) {
        // Handle null or empty array
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (arr.length == 0) {
            return; // Do nothing for empty array
        }

        // Save the last element
        String lastElement = arr[arr.length - 1];

        // Shift all elements to the right (from end to beginning)
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Place the last element at the first index
        arr[0] = lastElement;
    }

    // modifies the given array by moving the last element to the first index,
    // and shifting all elements to the right.
    public static void lastComesFirst(ArrayList<String> arrList) {
        // Handle null or empty list
        if (arrList == null) {
            throw new IllegalArgumentException("ArrayList cannot be null");
        }
        if (arrList.isEmpty()) {
            return; // Do nothing for empty list
        }

        // Remove the last element and add it at index 0
        String lastElement = arrList.remove(arrList.size() - 1);
        arrList.add(0, lastElement);
    }

    // modifies the given array by moving the first element to the last index,
    // and shifting all elements to the left.
    public static void firstComesLast(String[] arr) {
        // Handle null or empty array
        if (arr == null) {
            throw new IllegalArgumentException("Array cannot be null");
        }
        if (arr.length == 0) {
            return; // Do nothing for empty array
        }

        // Save the first element
        String firstElement = arr[0];

        // Shift all elements to the left (from beginning to end)
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Place the first element at the last index
        arr[arr.length - 1] = firstElement;
    }

    // modifies the given array by moving the first element to the last index,
    // and shifting all elements to the left.
    public static void firstComesLast(ArrayList<String> arrList) {
        // Handle null or empty list
        if (arrList == null) {
            throw new IllegalArgumentException("ArrayList cannot be null");
        }
        if (arrList.isEmpty()) {
            return; // Do nothing for empty list
        }

        // Remove the first element and add it at the end
        String firstElement = arrList.remove(0);
        arrList.add(firstElement);
    }

    // Test Methods
    // method to print an array
    public static String printArray(String[] arr) {
        String arrayStr = "[";

        for (int k = 0; k < arr.length; k++) {
            if (k < arr.length - 1) {
                arrayStr += arr[k] + ", ";

            } else {
                arrayStr += arr[k] + "]";
            }
        }

        return arrayStr;
    }

    public static void testLastComesFirst1() {
        String[] strArray = { "first", "second", "third", "fourth", "fifth" };
        String[] expectedArray = { "fifth", "first", "second", "third", "fourth" };

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        lastComesFirst(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast1() {
        String[] strArray = { "one", "two", "three", "four", "five" };
        String[] expectedArray = { "two", "three", "four", "five", "one" };

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + printArray(strArray));
        System.out.println("\tExpecting: " + printArray(expectedArray));

        firstComesLast(strArray);
        System.out.println("\tOutput: " + printArray(strArray));
        System.out.println("\tResult: "
                + (printArray(expectedArray).equals(printArray(strArray)) ? "PASS" : "FAIL"));
    }

    public static void testLastComesFirst2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.add("fourth");
        list.add("fifth");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("fifth");
        expectedList.add("first");
        expectedList.add("second");
        expectedList.add("third");
        expectedList.add("fourth");

        System.out.println("\tTesting lastComesFirst():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        lastComesFirst(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

    public static void testFirstComesLast2() {
        ArrayList<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");
        list.add("five");

        ArrayList<String> expectedList = new ArrayList<String>();
        expectedList.add("two");
        expectedList.add("three");
        expectedList.add("four");
        expectedList.add("five");
        expectedList.add("one");

        System.out.println("\tTesting firstComesLast():");
        System.out.println("\tOriginal: " + list);
        System.out.println("\tExpecting: " + expectedList);

        firstComesLast(list);

        System.out.println("\tOutput: " + list);
        boolean result = (expectedList).equals(list);
        System.out.println("\tResult: " + (result ? "PASS" : "FAIL"));

    }

}

