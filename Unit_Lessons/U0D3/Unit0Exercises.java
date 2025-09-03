// Solution: Unit 0 Exercises
public class Unit0Exercises {


    public static void main(String[] args) {
        Unit0Exercises obj = new Unit0Exercises();
        System.out.println();

        // testing sleepIn() method
        System.out.println(obj.sleepIn(false, false)); // output: true
        obj.sleepIn(true, false);
        obj.sleepIn(false, true);

        // testing diff21() method
        System.out.println(obj.diff21(19)); // output: 2
        obj.diff21(10);
        obj.diff21(21);

        // testing flooringCalculator() method
        System.out.println(obj.flooringCalculator(500, 2.5)); // output: 1250.0
        obj.flooringCalculator(0, 3.0); // -> 0.0
        obj.flooringCalculator(100, -1.5); // -> 0.0

    }

    public boolean sleepIn(boolean weekday, boolean vacation) {
        return !weekday || vacation;
    }

    public int diff21(int n) {
        if (n < 21) {
            return (21 - n);
        } else {
            return ((n - 21) * 2);
        }
    }

    public double flooringCalculator(int sqft, double pricePerSqft) {
        if (sqft <= 0 || pricePerSqft <= 0) {
            return 0.0;
        } else {
            return (sqft * pricePerSqft);
        }
    }

}
