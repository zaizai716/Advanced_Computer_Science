public class UniversalTester {
    public static void main(String[] args) {
        // test findStudentIndex() exception
        try {
            Hub hub = new Hub();
            hub.loginStudent("invalid name", "33333");
        } catch (Exception g) {
            System.out.println(g.toString());
            System.out.println("The method returned an exception when there's no students in storage.");
        }

        // test if student exist exception will be thrown
        try {
            Hub hub1 = new Hub();
            hub1.registerStudent("Justin", "12345", "jyu1@hwemail.com");
            hub1.doesStudentExist("Justin");
        } catch (Exception k) {
            System.out.println(k.toString());
            System.out.println("The method returned an exception when the student already exists.");
        }

        // test if title and description contain content
        try {
            String title = "";
            String description = "";
            new Assignment(title, description);
        } catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("The method returned an exception because the title or description was empty.");
        }

        // test if title contains profanity
        try {
            String title1 = "shit";
            Assignment assignment1 = new Assignment("Valid Title", "Valid description");
            assignment1.setTitle(title1);
        } catch (Exception r) {
            System.out.println(r.toString());
            System.out.println("The method returned an exception because of profanity");
        }

        // test if title is within length limit
        try {
            String title2 = "a;slefijawpoeifjawpoeifjapweifjapweifjapwefjawpefjapefijawea;seifapowiejfapwoeijfapwiejfapwiefjapweiofjapwoeifjapoeifjapwoeifj";
            Assignment assignment2 = new Assignment("Valid Title", "Valid description");
            assignment2.setTitle(title2);
        } catch (Exception t) {
            System.out.println(t.toString());
            System.out.println("The method returned an exception when the title was longer than 100 characters, as expected.");
        }

        // test if description is within length limit
        try {
            String description = "a".repeat(502);
            Assignment assignment3 = new Assignment("Valid title", description);
        } catch (Exception g) {
            System.out.println(g.toString());
            System.out.println("The method returned an exception when the method was longer than 500 characters.");
        }

        // test if description contains profanity
        try {
            String description1 = "shit";
            Assignment assignment4 = new Assignment("Valid Title", description1);
        } catch (Exception h) {
            System.out.println(h.toString());
            System.out.println("The method returned an exception when the description contained profanity.");
        }

        // test if description contains sql injection attempts
        try {
            String description3 = "'); DROP TABLE assignments; --";
            Assignment assignment4 = new Assignment("Valid title", description3);
        } catch (Exception j) {
            System.out.println(j.toString());
            System.out.println("The method returned an exception when the description contained SQL injection attempts.");
        }

        // test if title contains SQL injection attempts
        try {
            String title3 = "'); DROP TABLE assignments; --";
            Assignment assignment3 = new Assignment("Valid Title", "Valid description");
            assignment3.setTitle(title3);
        } catch (Exception y) {
            System.out.println(y.toString());
            System.out.println("The method returned an exception when there's an SQL injection attempt.");
        }

        Hub hub = new Hub();
        
        // test if student exists
        try {
            String studentName = "apwoeifjapwoeifjapwoefj";
            String password = "";
            hub.loginStudent(studentName, password);
        } catch (Exception u) {
            System.out.println(u.toString());
            System.out.println("The method returned an exception when the student doesn't exist.");
        }

        hub.registerStudent("Justin", "12345", "jyu1@hwemail.com");
        // test if password is correct for existing student
        try {
            String studentName2 = "Justin";
            String password = "23838389";
            hub.loginStudent(studentName2, password);
        } catch (Exception i) {
            System.out.println(i.toString());
            System.out.println("The method returned an exception when the password was incorrect, as intended");
        }

        // test if name will be rejected when it includes "@"
        try {
            String studentName5 = "@jfj";
            hub.registerStudent(studentName5, "password", "test@email.com");
        } catch (Exception d) {
            System.out.println(d.toString());
            System.out.println("The method returned an exception when the username includes @.");
        }

        // test if exception is thrown when student already exists
        try {
            String studentName3 = "Justin";
            hub.registerStudent(studentName3, "password", "test@email.com");
        } catch (Exception o) {
            System.out.println(o.toString());
            System.out.println("The method returned an exception when a user tries to create a username that already exists.");
        }

        // test if email exception will be triggered
        try {
            String email = "a;seiofj";
            hub.registerStudent("NewUser", "password", email);
        } catch (Exception f) {
            System.out.println(f.toString());
            System.out.println("The method returned an exception when the email was invalid.");
        }

    }
}
