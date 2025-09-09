public class Squid {
    private int tentacleCount;
    private double inkMeter;
    private String funFact;

    // constructor
    public Squid() {
        tentacleCount = 10;
        inkMeter = 100.0;
        funFact = "You can use pieces of squid as fish bait.";
    }

    // getters
    public int getTentacleCount() {
        return tentacleCount;
    }

    public double getInkMeter() {
        return inkMeter;
    }

    // setters
    public void setTentacleCount(int value) {
        tentacleCount = value;
    }

    public void setInkMeter(double value) {
        inkMeter = value;
    }

    // a built in method that returns all of the values of an object in a nice sentence.
    public String toString() {
        return "This is a squid. It has " + tentacleCount + "tentacles, and it's current ink level is " + inkMeter + ". Also, did you know that " + funFact + "?";
    }

    public boolean equals(Squid other) {
        if (tentacleCount == other.tentacleCount && inkMeter == other.inkMeter && funFact.equals(funFact)) {
            return true;
        } else {
            return false;
        }
    }
}