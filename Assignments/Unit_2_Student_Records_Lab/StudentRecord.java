public class StudentRecord {
    private String name;
    private int[] scores;


    // constructor
    public StudentRecord(String name, int[] scores) {
        this.name = name;
        this.scores = scores;
    }

    // getters and setters
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int[] getScores() {
        return scores;
    }


    public void setScores(int[] scores) {
        this.scores = scores;
    }

    // methods
    public String toString() {
        String name = getName();
        int[] scores = getScores();
        String result = name + "'s scores: [";
        for (int i = 0; i < scores.length; i++) {
            if (i == scores.length - 1) {
                result += scores[i];
            } else {
                result += (scores[i] + ", ");
            }
        }
        result += "]";
        return result;
    }
    
    public boolean equals(StudentRecord other) {
        int[] firstArray = getScores();
        int[] secondArray = other.getScores();

        int similar = 0;

        if (firstArray.length != secondArray.length) {
            return false;
        } else {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] == secondArray[i]) {
                    similar++;
                }
            }
            if (similar == firstArray.length) {
                return true;
            }
        }
        return false;
    }

    public double getAverage(int first, int last) {
        int[] scores = getScores();
        int numScores = 0;
        int sumScores = 0;

        for (int i = first; i <= last; i++) {
            sumScores += scores[i];
            numScores++;
        }

        return (double) sumScores / numScores;
    }

    public int getTestScore(int testNumber) {
        int[] scores = getScores();

        if (testNumber < 0 || testNumber >= scores.length) {
            return -1;
        } else {
            return scores[testNumber];
        }
    }

    public boolean hasImproved() {
        int[] scores = getScores();
        
        // Check if first score is less than last score (overall improvement)
        if (scores[0] < scores[scores.length - 1]) {
            return true;
        }
        
        return false;
    } 

    public double getFinalAverage() {
        int[] scores = getScores();
        if (hasImproved()) {
            int sum = 0;
            int numScores = 0;

            int index = (scores.length) / 2;
            for (int i = index; i < scores.length; i++) {
                sum += scores[i];
                numScores++;
            }

            return (double) sum / numScores;
        } else {
            int sum = 0;
            int numScores = 0;

            for (int i = 0; i < scores.length; i++) {
                sum += scores[i];
                numScores++;
            }

            return (double) sum / numScores;
        }
    }
}
