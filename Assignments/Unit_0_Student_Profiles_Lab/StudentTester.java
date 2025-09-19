public class StudentTester {
    public static void main(String[] args) {

        // constructor 1
        Student owen = new Student("Owen", 11);
        Student justin = new Student("Justin", 12);

        // constructor 2
        Student morgan = new Student("Morgan");
        Student ryan = new Student("Ryan");

        // print out students
        System.out.println(owen.toString());
        System.out.println(justin.toString());
        System.out.println(morgan.toString());
        System.out.println(ryan.toString() + "\n");

        // setters
        owen.setGrade(12);
        justin.setGrade(13);
        morgan.setGrade(11);
        ryan.setGrade(11);

        // checking to make sure setters work
        System.out.println(owen.toString());
        System.out.println(justin.toString());
        System.out.println(morgan.toString());
        System.out.println(ryan.toString() + "\n");

        // checking if objects/students are equal
        System.out.println("It's " + owen.equals(justin) + " that Owen equals Justin.");
        System.out.println("It's " + (justin.equals(justin)) + " that Justin equals Justin.");
        
    }
}
