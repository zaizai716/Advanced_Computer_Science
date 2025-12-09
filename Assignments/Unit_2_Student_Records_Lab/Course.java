public class Course {
    // instance variables
    private String courseName;
    private StudentRecord[] enrolledStudents;

    // constructor
    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    // getters and setters
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public StudentRecord[] getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setEnrolledStudents(StudentRecord[] enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }

    // methods
    public String toString() {
        StudentRecord[] enrolledStudents = getEnrolledStudents();
        String result = "== " + getCourseName() + " ==\n";

        for (int i = 0; i < enrolledStudents.length; i++) {
            result += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
        }
        return result;
    }

    public String findBestStudent() {
        StudentRecord[] enrolledStudents = getEnrolledStudents();
        String studentName = "";
        double finalAverage = 0.0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i].getFinalAverage() > finalAverage) {
                finalAverage = enrolledStudents[i].getFinalAverage();
                studentName = enrolledStudents[i].getName();
            }
            
        }

        return studentName;
    }

    public double calculateTestAverage(int testNumber) {
        StudentRecord[] enrolledStudents = getEnrolledStudents();
        int finalSum = 0;
        int numTests = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            finalSum += enrolledStudents[i].getTestScore(testNumber);
            numTests++;
        }

        return (double) finalSum / numTests;
    }

    
}
