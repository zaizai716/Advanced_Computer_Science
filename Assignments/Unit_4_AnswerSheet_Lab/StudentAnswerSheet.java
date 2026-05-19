import java.util.ArrayList;

public class StudentAnswerSheet {
    // instance variables
    String name;
    double testScore;
    ArrayList<String> answers = new ArrayList<String>();

    // constructor
    public StudentAnswerSheet(String name, ArrayList<String> answers) {
        if (name == null || answers == null) {
            throw new IllegalArgumentException(
                    "Either the name or answers are null. They can't be null.");
        }
        this.name = name;
        this.answers = answers;
        this.testScore = 0.0;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTestScore() {
        return testScore;
    }

    public void setTestScore(double testScore) {
        this.testScore = testScore;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    // methods
    public double getGrade(ArrayList<String> key) {
        double grade = 0.0;

        if (key == null) {
            throw new IllegalArgumentException("Key needs to have stuff in it.");
        }
        if (key.size() != answers.size()) {
            throw new IllegalArgumentException(
                    "Key ArrayList needs to be same length as the Answers ArrayList.");
        }

        for (int i = 0; i < key.size(); i++) {
            if (key.get(i).equals(answers.get(i))) {
                grade += 1.0;
            } else if (!answers.get(i).equals("?")) {
                grade -= 0.25;
            }
        }

        return grade;

    }


}
