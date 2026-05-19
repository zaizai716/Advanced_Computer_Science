import java.util.ArrayList;

public class TestResults {
    // instance variables
    ArrayList<String> answerKey = new ArrayList<String>();
    ArrayList<StudentAnswerSheet> submissions = new ArrayList<StudentAnswerSheet>();

    // constructors
    public TestResults(ArrayList<String> key, ArrayList<StudentAnswerSheet> submissions) {
        if (key == null || submissions == null) {
            throw new IllegalArgumentException("Array lists can't be null.");
        }

        answerKey = key;
        this.submissions = submissions;
    }

    // getters and setters
    public ArrayList<String> getAnswerKey() {
        return answerKey;
    }

    public void setAnswerKey(ArrayList<String> answerKey) {
        this.answerKey = answerKey;
    }

    public ArrayList<StudentAnswerSheet> getSubmissions() {
        return submissions;
    }

    public void setSubmissions(ArrayList<StudentAnswerSheet> submissions) {
        this.submissions = submissions;
    }

    // methods
    public void submit(StudentAnswerSheet student) {
        this.submissions.add(student);
    }

    public void gradeTests() {
        for (StudentAnswerSheet submission : submissions) {
            if (submission.getAnswers().size() != answerKey.size()) {
                throw new IllegalArgumentException("ArrayList lengths need to be the same.");
            }

            double score = submission.getGrade(answerKey);
            submission.setTestScore(score);
        }
    }

    public String highestScoringStudent() {
        if (submissions.isEmpty()) {
            return "";
        }
        
        double highest = -10000.0;
        String name = "";
        for (StudentAnswerSheet submission : submissions) {
            if (submission.getTestScore() > highest) {
                highest = submission.getTestScore();
                name = submission.getName();
            }
        }

        return name;
    }
}
