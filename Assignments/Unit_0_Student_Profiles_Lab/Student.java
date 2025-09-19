public class Student {

    private String name = "Justin";
    private String id = "XXX-XXXX";
    private int grade = 0;

    // constructors
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.id = generateId();
    }

    public Student(String name) {
        this.name = name;
        this.grade = 10;
        this.id = generateId();
    }

    // getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public double getGrade() {
        return grade;
    }

    // setters
    public void setName(String input) {
        name = input;
    }

    public void setId(String input) {
        id = input;
    }

    public void setGrade(int input) {
        grade = input;
    }

    // methods
    public String toString() {
        return (name + " is a " + grade + "th grader. Their id is " + id + ".");
    }

    public boolean equals(Student other) {
        if (name.equals(other.name) && id.equals(other.id) && grade == other.grade) {
            return true;
        } else {
            return false;
        }
    }

    public String generateId() {
        return "" + ((int) (Math.random() * 7) + 1) + ((int) (Math.random() * 7) + 1)
                + ((int) (Math.random() * 7) + 1) + "-" + ((int) (Math.random() * 10))
                + ((int) (Math.random()) * 10) + ((int) (Math.random() * 10))
                + ((int) (Math.random() * 10));
    }

}
