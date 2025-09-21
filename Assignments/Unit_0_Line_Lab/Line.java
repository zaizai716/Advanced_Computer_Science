public class Line {
    // instance variables
    private int a = 0;
    private int b = 0;
    private int c = 0;

    // constructor
    public Line(int numA, int numB, int numC) {
        a = numA;
        b = numB;
        c = numC;
    }

    // getters
    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    // setters
    public void setA(int numA) {
        a = numA;
    }

    public void setB(int numB) {
        b = numB;
    }

    public void setC(int numC) {
        c = numC;
    }

    // methods
    public double calculateSlope() {
        return ((double) (-a) / (double) (b));
    }

    public boolean isCoordinateOnLine(int x, int y) {
        if ((a * x) + (b * y) + (c) == 0) {
            return true;
        } else {
            return false;
        }
    }

    public String toString() {
        return ("Equation: " + a + "x + " + b + "y + " + c + " = 0");
    }

    public boolean equals(Line other) {
        if (a == other.a && b == other.b && c == other.c) {
            return true;
        } else {
            return false;
        }
    }
}
