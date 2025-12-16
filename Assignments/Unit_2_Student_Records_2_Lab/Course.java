public class Course {
    private String courseName;
    private StudentRecord[] enrolledStudents;

    public Course(String courseName, StudentRecord[] enrolledStudents) {
        this.courseName = courseName;
        this.enrolledStudents = enrolledStudents;
    }

    public Course(String courseName, int maxEnrollment) {
        StudentRecord[] students = new StudentRecord[maxEnrollment];
        this.courseName = courseName;
        this.enrolledStudents = students;
    }

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

    public String toString() {
        StudentRecord[] enrolledStudents = getEnrolledStudents();
        String result = "== " + getCourseName() + " ==\n";

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                result += (i + 1) + ".) " + enrolledStudents[i].toString() + "\n";
            }
        }
        return result;
    }

    public String findBestStudent() {
        StudentRecord[] enrolledStudents = getEnrolledStudents();
        String studentName = "";
        double finalAverage = 0.0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null
                    && enrolledStudents[i].getFinalAverage() > finalAverage) {
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
            if (enrolledStudents[i] != null) {
                finalSum += enrolledStudents[i].getTestScore(testNumber);
                numTests++;
            }
        }

        return (double) finalSum / numTests;
    }

    public boolean isFull() {
        StudentRecord[] array = getEnrolledStudents();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                return false;
            }
        }

        return true;
    }

    public void enrollStudent(StudentRecord student) {
        StudentRecord[] array = getEnrolledStudents();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = student;
                return;
            }
        }
    }

    public boolean dropStudent(StudentRecord student) {
        StudentRecord[] array = getEnrolledStudents();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == student) {
                array[i] = null;
                return true;
            }
        }

        return false;
    }

    public int countEnrolledStudents() {
        StudentRecord[] enrolledStudents = getEnrolledStudents();
        int count = 0;

        for (int i = 0; i < enrolledStudents.length; i++) {
            if (enrolledStudents[i] != null) {
                count++;
            }
        }

        return count;
    }

    public void increaseClassSizeBy(int sizeIncrease) {
        StudentRecord[] oldArray = getEnrolledStudents();
        StudentRecord[] newArray = new StudentRecord[oldArray.length + sizeIncrease];

        for (int i = 0; i < oldArray.length; i++) {
            newArray[i] = oldArray[i];
        }

        setEnrolledStudents(newArray);
    }
}