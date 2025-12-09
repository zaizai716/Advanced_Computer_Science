public class Unit2Exercises {

    public static String alarmClock(int day, boolean vacation) {
        // to-do: implement this method
        if (day >= 1 && day <= 5) {
            return "7:00";
        }
        if ((day == 6 || day == 7) || (vacation && (day >= 1 && day <= 5))) {
            return "10:00";
        }
        if (vacation && (day == 6 || day == 7)) {
            return "off";
        }

        return "";
    }

    public static boolean love6(int a, int b) {
        // to-do: implement this method
        if ((a == 6 || b == 6) || (a + b == 6)) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        // to-do: implement this method
        if (a == 2 && b == 2 && c == 2) {
            return 2;
        }
        if (a == b && b == c) {
            return 5;
        }
        if (b != a && c != a) {
            return 1;
        }
        return 0;
    }

    public static String fizzString(String str) {
        // to-do: implement this method
        if (str.substring(0) == "f") {
            return "Fizz";
        }
        if (str.substring((str.length() - 1)) == "b") {
            return "Buzz";
        }
        if ((str.substring(0) == "f") && (str.substring((str.length() - 1)) == "b")) {
            return "FizzBuzz";
        }
        return "";

    }

    public static String doubleChar(String str) {
        // to-do: implement this method
        String finalStr = "";
        for (int i = 0; i < str.length(); i++) {
            finalStr += str.charAt(i);
            finalStr += str.charAt(i);
        }

        return finalStr;

    }

    public static int countHi(String str) {
        // to-do: implement this method
        
        return 0;
    }

    public static boolean catDog(String str) {
        // to-do: implement this method
        return false;
    }

    public static String mixString(String a, String b) {
        // to-do: implement this method
        return "";

    }

    public static String repeatEnd(String str, int n) {
        // to-do: implement this method
        return "";
    }

    public static boolean endOther(String a, String b) {
        // to-do: implement this method
        return false;
    }

    public static int countCode(String str) {
        // to-do: implement this method
        return 0;
    }

    public static int countEvens(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int bigDiff(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int sum13(int[] nums) {
        // to-do: implement this method
        return 0;
    }

    public static int[] fizzArray(int n) {
        // to-do: implement this method
        return new int[0];
    }

    public static boolean haveThree(int[] nums) {
        // to-do: implement this method
        return false;

    }

    public static String[] fizzArray2(int n) {
        // to-do: implement this method
        return new String[0];
    }

    public static int[] zeroFront(int[] nums) {
        // to-do: implement this method
        return new int[0];
    }

    public static String[] wordsWithout(String[] words, String target) {
        // to-do: implement this method
        return new String[0];
    }

    public static int scoresAverage(int[] scores) {
        // to-do: implement this method
        return 0;
    }

    public static boolean scoresIncreasing(int[] scores) {
        // to-do: implement this method
        return false;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        // to-do: implement this method
        return 0;
    }

    public static String firstTwo(String str) {
        // to-do: implement this method
        return "";
    }

    public static double divide(int a, int b) {
        // to-do: implement this method
        return 0.0;
    }
}
