public class Student {

    private String name = "Justin";
    private String id = "XXX-XXXX";
    private int grade = 0;

    // constructors
    public Student(String Pname, int Pgrade) {
        this.name = Pname;
        this.grade = Pgrade;
        this.id = generateId();
    }

    public Student(String Pname) {
        this.name = Pname;
        this.grade = 10;
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
        return (name == other.name && id == other.id && grade == other.grade);
    }

    public String generateId() {
        return ((Math.random() * 8) + 1) + ((Math.random() * 8) + 1) +
        ((Math.random() * 8) + 1) + "-" + Math.random() + Math.random() + Math.random()
        + Math.random();
    }


}
