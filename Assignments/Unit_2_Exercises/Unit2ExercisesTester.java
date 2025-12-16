public class Unit2ExercisesTester {

  private static int testsPassed = 0;
  private static int testsFailed = 0;

  public static void main(String[] args) {
      System.out.println("=== Unit 2 Exercises Tester ===\n");
      testAlarmClock();
      testLove6();
      testRedTicket();
      testFizzString();
      testDoubleChar();
      testCountHi();
      testCatDog();
      testMixString();
      testRepeatEnd();
      testEndOther();
      testCountCode();
      testCountEvens();
      testBigDiff();
      testSum13();
      testFizzArray();
      testHaveThree();
      testFizzArray2();
      testZeroFront();
      testWordsWithout();
      testScoresAverage();
      testScoresIncreasing();
      testScoresSpecial();
      testFirstTwo();
      testDivide();
      printResults();
  }

  private static void testAlarmClock() {
      System.out.println("Testing alarmClock():");
      testEquals(Unit2Exercises.alarmClock(1, false), "7:00");
      testEquals(Unit2Exercises.alarmClock(0, true), "off");
      System.out.println();
  }

  private static void testLove6() {
      System.out.println("Testing love6():");
      testEquals(Unit2Exercises.love6(6, 4), true);
      testEquals(Unit2Exercises.love6(4, 5), false);
      System.out.println();
  }

  private static void testRedTicket() {
      System.out.println("Testing redTicket():");
      testEquals(Unit2Exercises.redTicket(2, 2, 2), 10);
      testEquals(Unit2Exercises.redTicket(1, 2, 0), 1);
      System.out.println();
  }

  private static void testFizzString() {
      System.out.println("Testing fizzString():");
      testEquals(Unit2Exercises.fizzString("fig"), "Fizz");
      testEquals(Unit2Exercises.fizzString("fib"), "FizzBuzz");
      System.out.println();
  }

  private static void testDoubleChar() {
      System.out.println("Testing doubleChar():");
      testEquals(Unit2Exercises.doubleChar("The"), "TThhee");
      testEquals(Unit2Exercises.doubleChar(""), "");
      System.out.println();
  }

  private static void testCountHi() {
      System.out.println("Testing countHi():");
      testEquals(Unit2Exercises.countHi("abc hi ho"), 1);
      testEquals(Unit2Exercises.countHi("hihi"), 2);
      System.out.println();
  }

  private static void testCatDog() {
      System.out.println("Testing catDog():");
      testEquals(Unit2Exercises.catDog("catdog"), true);
      testEquals(Unit2Exercises.catDog("catcat"), false);
      System.out.println();
  }

  private static void testMixString() {
      System.out.println("Testing mixString():");
      testEquals(Unit2Exercises.mixString("abc", "xyz"), "axbycz");
      testEquals(Unit2Exercises.mixString("Hi", "There"), "HTihere");
      System.out.println();
  }

  private static void testRepeatEnd() {
      System.out.println("Testing repeatEnd():");
      testEquals(Unit2Exercises.repeatEnd("Hello", 3), "llollollo");
      testEquals(Unit2Exercises.repeatEnd("Hello", 0), "");
      System.out.println();
  }

  private static void testEndOther() {
      System.out.println("Testing endOther():");
      testEquals(Unit2Exercises.endOther("Hiabc", "abc"), true);
      testEquals(Unit2Exercises.endOther("abc", "xyz"), false);
      System.out.println();
  }

  private static void testCountCode() {
      System.out.println("Testing countCode():");
      testEquals(Unit2Exercises.countCode("aaacodebbb"), 1);
      testEquals(Unit2Exercises.countCode("codexxcode"), 2);
      System.out.println();
  }

  private static void testCountEvens() {
      System.out.println("Testing countEvens():");
      testEquals(Unit2Exercises.countEvens(new int[]{2, 1, 2, 3, 4}), 3);
      testEquals(Unit2Exercises.countEvens(new int[]{}), 0);
      System.out.println();
  }

  private static void testBigDiff() {
      System.out.println("Testing bigDiff():");
      testEquals(Unit2Exercises.bigDiff(new int[]{10, 3, 5, 6}), 7);
      testEquals(Unit2Exercises.bigDiff(new int[]{2, 10}), 8);
      System.out.println();
  }

  private static void testSum13() {
      System.out.println("Testing sum13():");
      testEquals(Unit2Exercises.sum13(new int[]{1, 2, 2, 1}), 6);
      testEquals(Unit2Exercises.sum13(new int[]{1, 2, 13, 2, 1, 13}), 4);
      System.out.println();
  }

  private static void testFizzArray() {
      System.out.println("Testing fizzArray():");
      testEquals(Unit2Exercises.fizzArray(4), new int[]{0, 1, 2, 3});
      testEquals(Unit2Exercises.fizzArray(0), new int[]{});
      System.out.println();
  }

  private static void testHaveThree() {
      System.out.println("Testing haveThree():");
      testEquals(Unit2Exercises.haveThree(new int[]{3, 1, 3, 1, 3}), true);
      testEquals(Unit2Exercises.haveThree(new int[]{3, 1, 3, 3}), false);
      System.out.println();
  }

  private static void testFizzArray2() {
      System.out.println("Testing fizzArray2():");
      testEquals(Unit2Exercises.fizzArray2(4), new String[]{"0", "1", "2", "3"});
      testEquals(Unit2Exercises.fizzArray2(0), new String[]{});
      System.out.println();
  }

  private static void testZeroFront() {
      System.out.println("Testing zeroFront():");
      testEquals(Unit2Exercises.zeroFront(new int[]{1, 0, 0, 1}), new int[]{0, 0, 1, 1});
      testEquals(Unit2Exercises.zeroFront(new int[]{2, 2, 2}), new int[]{2, 2, 2});
      System.out.println();
  }

  private static void testWordsWithout() {
      System.out.println("Testing wordsWithout():");
      testEquals(Unit2Exercises.wordsWithout(new String[]{"a", "b", "c", "a"}, "a"), new String[]{"b", "c"});
      testEquals(Unit2Exercises.wordsWithout(new String[]{"a", "a"}, "a"), new String[]{});
      System.out.println();
  }

  private static void testScoresAverage() {
      System.out.println("Testing scoresAverage():");
      testEquals(Unit2Exercises.scoresAverage(new int[]{2, 2, 4, 4}), 4);
      testEquals(Unit2Exercises.scoresAverage(new int[]{5, 6}), 6);
      System.out.println();
  }

  private static void testScoresIncreasing() {
      System.out.println("Testing scoresIncreasing():");
      testEquals(Unit2Exercises.scoresIncreasing(new int[]{1, 3, 4}), true);
      testEquals(Unit2Exercises.scoresIncreasing(new int[]{1, 3, 2}), false);
      System.out.println();
  }

  private static void testScoresSpecial() {
      System.out.println("Testing scoresSpecial():");
      testEquals(Unit2Exercises.scoresSpecial(new int[]{12, 10, 4}, new int[]{2, 20, 30}), 40);
      testEquals(Unit2Exercises.scoresSpecial(new int[]{12, 11, 4}, new int[]{2, 20, 31}), 20);
      System.out.println();
  }

  private static void testFirstTwo() {
      System.out.println("Testing firstTwo():");
      testEquals(Unit2Exercises.firstTwo("hello"), "he");
      testEquals(Unit2Exercises.firstTwo(""), "**");
      System.out.println();
  }

  private static void testDivide() {
      System.out.println("Testing divide():");
      testEquals(Unit2Exercises.divide(5, 2), 2.5);
      testEquals(Unit2Exercises.divide(4, 2), 2.0);
      System.out.println();
  }

  private static <T> void testEquals(T actual, T expected) {
      if (actual == null && expected == null) {
          pass();
      } else if (actual instanceof int[] && expected instanceof int[]) {
          testArrayEquals((int[]) actual, (int[]) expected);
      } else if (actual instanceof String[] && expected instanceof String[]) {
          testArrayEquals((String[]) actual, (String[]) expected);
      } else if (actual instanceof Double && expected instanceof Double) {
          if (Math.abs((Double) actual - (Double) expected) < 0.0001) {
              pass(actual.toString());
          } else {
              fail(expected, actual);
          }
      } else if (actual != null && actual.equals(expected)) {
          pass(actual.toString());
      } else {
          fail(expected, actual);
      }
  }

  private static void testArrayEquals(int[] actual, int[] expected) {
      if (arraysEqual(actual, expected)) {
          pass(arrayToString(actual));
      } else {
          fail(arrayToString(expected), arrayToString(actual));
      }
  }

  private static void testArrayEquals(String[] actual, String[] expected) {
      if (arraysEqual(actual, expected)) {
          pass(arrayToString(expected));
      } else {
          fail(arrayToString(expected), arrayToString(actual));
      }
  }

  private static void pass() {
      testsPassed++;
      System.out.println("  [PASS]");
  }

  private static void pass(String value) {
      testsPassed++;
      System.out.println("  [PASS] " + value);
  }

  private static void fail(Object expected, Object actual) {
      testsFailed++;
      System.out.println("  [FAIL] Expected " + expected + " but got " + actual);
  }

  private static boolean arraysEqual(int[] a, int[] b) {
      if (a.length != b.length) {
          return false;
      }
      for (int i = 0; i < a.length; i++) {
          if (a[i] != b[i]) {
              return false;
          }
      }
      return true;
  }

  private static boolean arraysEqual(String[] a, String[] b) {
      if (a.length != b.length) {
          return false;
      }
      for (int i = 0; i < a.length; i++) {
          if (!a[i].equals(b[i])) {
              return false;
          }
      }
      return true;
  }

  private static String arrayToString(int[] arr) {
      if (arr.length == 0) {
          return "[]";
      }
      String result = "[";
      for (int i = 0; i < arr.length; i++) {
          result += arr[i];
          if (i < arr.length - 1) {
              result += ", ";
          }
      }
      return result + "]";
  }

  private static String arrayToString(String[] arr) {
      if (arr.length == 0) {
          return "[]";
      }
      String result = "[";
      for (int i = 0; i < arr.length; i++) {
          result += "\"" + arr[i] + "\"";
          if (i < arr.length - 1) {
              result += ", ";
          }
      }
      return result + "]";
  }

  private static void printResults() {
      System.out.println("=================================");
      System.out.println("Tests Passed: " + testsPassed);
      System.out.println("Tests Failed: " + testsFailed);
      System.out.println("Total Tests:  " + (testsPassed + testsFailed));
      System.out.println("=================================");
      if (testsFailed == 0) {
          System.out.println("All tests passed!");
      } else {
          System.out.println("Some tests failed. Please review your code.");
      }
  }
}