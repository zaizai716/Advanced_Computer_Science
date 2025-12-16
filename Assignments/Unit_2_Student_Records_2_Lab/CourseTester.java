public class CourseTester {
    public static void main(String[] args) {
        System.out.println("=== Course Tester ===\n");

        int[] anaScores = {90, 89, 91, 95};
        StudentRecord ana = new StudentRecord("Ana", anaScores);

        int[] bobScores = {95, 90, 85, 80};
        StudentRecord bob = new StudentRecord("Bob", bobScores);

        int[] charlieScores = {90, 89, 91, 94};
        StudentRecord charlie = new StudentRecord("Charlie", charlieScores);

        StudentRecord[] students = {ana, bob, charlie};
        Course mathCourse = new Course("Mathematics", students);

        // Test toString()
        System.out.println("Test 1: toString()");
        boolean test1 = mathCourse.toString().contains("Mathematics")
                && mathCourse.toString().contains("Ana");
        if (test1) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test findBestStudent()
        System.out.println("Test 2: findBestStudent()");
        boolean test2 = mathCourse.findBestStudent().equals("Ana");
        if (test2) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test calculateTestAverage()
        System.out.println("Test 3: calculateTestAverage(0)");
        boolean test3 = Math.abs(mathCourse.calculateTestAverage(0) - 91.67) < 0.1;
        if (test3) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test getters/setters
        System.out.println("Test 4: getCourseName() and setCourseName()");
        mathCourse.setCourseName("Advanced Math");
        boolean test4 = mathCourse.getCourseName().equals("Advanced Math");
        if (test4) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test countEnrolledStudents()
        System.out.println("Test 5: countEnrolledStudents()");
        boolean test5 = mathCourse.countEnrolledStudents() == 3;
        if (test5) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test isFull()
        System.out.println("Test 6: isFull()");
        Course course1 = new Course("Full Course", 2);
        course1.enrollStudent(ana);
        course1.enrollStudent(bob);
        boolean test6 = course1.isFull() == true;
        if (test6) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test enrollStudent()
        System.out.println("Test 7: enrollStudent()");
        Course course2 = new Course("Test Course", 3);
        course2.enrollStudent(ana);
        boolean test7 = course2.countEnrolledStudents() == 1;
        if (test7) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test dropStudent()
        System.out.println("Test 8: dropStudent()");
        course2.enrollStudent(bob);
        boolean dropped = course2.dropStudent(ana);
        boolean test8 = dropped && course2.countEnrolledStudents() == 1;
        if (test8) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Test increaseClassSizeBy()
        System.out.println("Test 9: increaseClassSizeBy()");
        Course course3 = new Course("Growing Course", 2);
        course3.enrollStudent(ana);
        course3.increaseClassSizeBy(3);
        boolean test9 = course3.getEnrolledStudents().length == 5
                && course3.countEnrolledStudents() == 1;
        if (test9) {
            System.out.println("Result: PASS\n");
        } else {
            System.out.println("Result: FAIL\n");
        }

        // Summary
        int passed = 0;
        if (test1) {
            passed++;
        }
        if (test2) {
            passed++;
        }
        if (test3) {
            passed++;
        }
        if (test4) {
            passed++;
        }
        if (test5) {
            passed++;
        }
        if (test6) {
            passed++;
        }
        if (test7) {
            passed++;
        }
        if (test8) {
            passed++;
        }
        if (test9) {
            passed++;
        }

        System.out.println("===================");
        System.out.println("Passed: " + passed + "/9");
        System.out.println("===================");
        if (passed == 9) {
            System.out.println("All tests passed!");
        } else {
            System.out.println("Some tests failed");
        }
    }
}