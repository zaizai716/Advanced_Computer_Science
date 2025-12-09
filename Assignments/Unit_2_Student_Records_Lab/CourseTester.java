public class CourseTester {
    public static void main(String[] args) {
        System.out.println("=== Testing Course Methods ===\n");

        // Create test students
        int[] anaScores = {90, 89, 91, 95};
        StudentRecord ana = new StudentRecord("Ana", anaScores);

        int[] bobScores = {95, 90, 85, 80};
        StudentRecord bob = new StudentRecord("Bob", bobScores);

        int[] charlieScores = {90, 89, 91, 94};
        StudentRecord charlie = new StudentRecord("Charlie", charlieScores);

        // Create a course with multiple students
        StudentRecord[] students = {ana, bob, charlie};
        Course mathCourse = new Course("Mathematics", students);

        // Test 1: Course toString()
        System.out.println("Test 1: Course toString() method");
        String courseString = mathCourse.toString();
        System.out.println("Course toString() output:");
        System.out.println(courseString);
        System.out.println("Result: Check manually if format is correct");
        System.out.println();

        // Test 2: findBestStudent()
        System.out.println("Test 2: findBestStudent() method");
        String bestStudent = mathCourse.findBestStudent();
        System.out.println("Students: Ana (improved, avg second half), Bob (declining), Charlie");
        System.out.println("Expected: Ana (should have highest final average)");
        System.out.println("Got:      " + bestStudent);
        boolean test2 = bestStudent.equals("Ana");
        System.out.println("Result: " + (test2 ? "PASS" : "FAIL"));
        System.out.println();

        // Test 3: calculateTestAverage()
        System.out.println("Test 3: calculateTestAverage(0) method");
        double test0Avg = mathCourse.calculateTestAverage(0);
        // Ana: 90, Bob: 95, Charlie: 90 -> average = 91.67
        System.out.println("Test 0 scores: Ana=90, Bob=95, Charlie=90");
        System.out.println("Expected average: ~91.67");
        System.out.println("Got:      " + test0Avg);
        boolean test3 = Math.abs(test0Avg - 91.67) < 0.1;
        System.out.println("Result: " + (test3 ? "PASS" : "FAIL"));
        System.out.println();

        // Test 4: calculateTestAverage() with different test number
        System.out.println("Test 4: calculateTestAverage(1) method");
        double test1Avg = mathCourse.calculateTestAverage(1);
        // Ana: 89, Bob: 90, Charlie: 89 -> average = 89.33
        System.out.println("Test 1 scores: Ana=89, Bob=90, Charlie=89");
        System.out.println("Expected average: ~89.33");
        System.out.println("Got:      " + test1Avg);
        boolean test4 = Math.abs(test1Avg - 89.33) < 0.1;
        System.out.println("Result: " + (test4 ? "PASS" : "FAIL"));
        System.out.println();

        // Test 5: Course getters and setters
        System.out.println("Test 5: Course getters and setters");
        String originalName = mathCourse.getCourseName();
        mathCourse.setCourseName("Advanced Mathematics");
        String newName = mathCourse.getCourseName();
        boolean test5 = originalName.equals("Mathematics")
                && newName.equals("Advanced Mathematics");
        System.out.println("Original: " + originalName);
        System.out.println("After set: " + newName);
        System.out.println("Result: " + (test5 ? "PASS" : "FAIL"));
        System.out.println();

        // Test 6: getEnrolledStudents()
        System.out.println("Test 6: getEnrolledStudents() method");
        StudentRecord[] enrolled = mathCourse.getEnrolledStudents();
        boolean test6 = (enrolled.length == 3);
        System.out.println("Expected: 3 students");
        System.out.println("Got:      " + enrolled.length + " students");
        System.out.println("Result: " + (test6 ? "PASS" : "FAIL"));
        System.out.println();

        // Test 7: setEnrolledStudents()
        System.out.println("Test 7: setEnrolledStudents() method");
        StudentRecord[] newStudents = {ana};
        mathCourse.setEnrolledStudents(newStudents);
        StudentRecord[] updatedEnrolled = mathCourse.getEnrolledStudents();
        boolean test7 = (updatedEnrolled.length == 1);
        System.out.println("Set to 1 student, expected: 1");
        System.out.println("Got:      " + updatedEnrolled.length);
        System.out.println("Result: " + (test7 ? "PASS" : "FAIL"));
        System.out.println();

        System.out.println("=== Testing Complete ===");
    }
}

