public class Unit2Exercises {

    public static String alarmClock(int day, boolean vacation) {
        if (!vacation && day >= 1 && day <= 5) {
            return "7:00";
        }
        if (!vacation && (day == 0 || day == 6)) {
            return "10:00";
        }
        if (vacation && day >= 1 && day <= 5) {
            return "10:00";
        }
        if (vacation && (day == 0 || day == 6)) {
            return "off";
        }
        return "";
    }

    public static boolean love6(int a, int b) {
        if (a == 6 || b == 6 || a + b == 6 || Math.abs(a - b) == 6) {
            return true;
        }
        return false;
    }

    public static int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) {
            return 10;
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
        boolean startsF = str.toLowerCase().startsWith("f");
        boolean endsB = str.toLowerCase().endsWith("b");

        if (startsF && endsB) {
            return "FizzBuzz";
        }
        if (startsF) {
            return "Fizz";
        }
        if (endsB) {
            return "Buzz";
        }
        return str;
    }

    public static String doubleChar(String str) {
        String finalStr = "";
        for (int i = 0; i < str.length(); i++) {
            finalStr += str.charAt(i);
            finalStr += str.charAt(i);
        }
        return finalStr;
    }

    public static int countHi(String str) {
        int numHi = 0;
        for (int i = 0; i <= str.length() - 2; i++) {
            String hiString = str.substring(i, i + 2);
            if (hiString.equals("hi")) {
                numHi++;
            }
        }
        return numHi;
    }

    public static boolean catDog(String str) {
        int catCount = 0;
        int dogCount = 0;

        for (int i = 0; i <= str.length() - 3; i++) {
            String sub = str.substring(i, i + 3);
            if (sub.equals("cat")) {
                catCount++;
            }
            if (sub.equals("dog")) {
                dogCount++;
            }
        }
        return catCount == dogCount;
    }

    public static String mixString(String a, String b) {
        String newString = "";
        int minLength = Math.min(a.length(), b.length());

        for (int i = 0; i < minLength; i++) {
            newString += a.charAt(i);
            newString += b.charAt(i);
        }

        if (a.length() > b.length()) {
            newString += a.substring(minLength);
        } else {
            newString += b.substring(minLength);
        }

        return newString;
    }

    public static String repeatEnd(String str, int n) {
        String repeat = str.substring(str.length() - n);
        String finalString = "";

        for (int i = 0; i < n; i++) {
            finalString += repeat;
        }
        return finalString;
    }

    public static boolean endOther(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();

        if (lowerA.length() >= lowerB.length()) {
            return lowerA.substring(lowerA.length() - lowerB.length()).equals(lowerB);
        } else {
            return lowerB.substring(lowerB.length() - lowerA.length()).equals(lowerA);
        }
    }

    public static int countCode(String str) {
        int count = 0;
        for (int i = 0; i <= str.length() - 4; i++) {
            String sub = str.substring(i, i + 4);
            if (sub.charAt(0) == 'c' && sub.charAt(1) == 'o' && sub.charAt(3) == 'e') {
                count++;
            }
        }
        return count;
    }

    public static int countEvens(int[] nums) {
        int evenNum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                evenNum++;
            }
        }
        return evenNum;
    }

    public static int bigDiff(int[] nums) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
            }
            if (nums[i] < min) {
                min = nums[i];
            }
        }

        return max - min;
    }

    public static int sum13(int[] nums) {
        int sum = 0;

        if (nums.length == 0) {
            return 0;
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 13) {
                continue;
            }
            if (i > 0 && nums[i - 1] == 13) {
                continue;
            }
            sum += nums[i];
        }

        return sum;
    }

    public static int[] fizzArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i;
        }
        return array;
    }

    public static boolean haveThree(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                count++;
                if (i + 1 < nums.length && nums[i + 1] == 3) {
                    return false;
                }
            }
        }

        return count == 3;
    }

    public static String[] fizzArray2(int n) {
        String[] array = new String[n];
        for (int i = 0; i < n; i++) {
            array[i] = String.valueOf(i);
        }
        return array;
    }

    public static int[] zeroFront(int[] nums) {
        int[] result = new int[nums.length];
        int index = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                result[index] = 0;
                index++;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                result[index] = nums[i];
                index++;
            }
        }

        return result;
    }

    public static String[] wordsWithout(String[] words, String target) {
        int numTargets = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(target)) {
                numTargets++;
            }
        }

        String[] array = new String[words.length - numTargets];
        int index = 0;

        for (int i = 0; i < words.length; i++) {
            if (!words[i].equals(target)) {
                array[index] = words[i];
                index++;
            }
        }

        return array;
    }

    public static int average(int[] scores, int start, int end) {
        int sum = 0;
        int numSum = 0;
        for (int i = start; i < end; i++) {
            sum += scores[i];
            numSum++;
        }
        return sum / numSum;
    }

    public static int scoresAverage(int[] scores) {
        int midIndex = scores.length / 2;
        int firstAverage = average(scores, 0, midIndex);
        int secondAverage = average(scores, midIndex, scores.length);
        return Math.max(firstAverage, secondAverage);
    }

    public static boolean scoresIncreasing(int[] scores) {
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < scores[i - 1]) {
                return false;
            }
        }
        return true;
    }

    public static int specialFinder(int[] array) {
        int specialScore = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 10 == 0 && array[i] > specialScore) {
                specialScore = array[i];
            }
        }
        return specialScore;
    }

    public static int scoresSpecial(int[] a, int[] b) {
        int specialScore1 = specialFinder(a);
        int specialScore2 = specialFinder(b);
        return specialScore1 + specialScore2;
    }

    public static String firstTwo(String str) {
        if (str.length() >= 2) {
            return str.substring(0, 2);
        } else if (str.length() == 1) {
            return str + "*";
        } else {
            return "**";
        }
    }

    public static double divide(int a, int b) {
        int biggerNumber = Math.max(a, b);
        int smallerNumber = Math.min(a, b);
        if (smallerNumber == 0) {
            return 0.0;
        }
        return (double) biggerNumber / smallerNumber;
    }
}