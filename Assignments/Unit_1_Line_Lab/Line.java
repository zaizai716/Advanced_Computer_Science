public class Line {
    // instance variables
    private int a = 0;
    private int b = 0;
    private int c = 0;
    private Point p1;
    private Point p2;

    // constructors
    public Line(int numA, int numB, int numC) {
        a = numA;
        b = numB;
        c = numC;
    }

    public Line(Point p1, Point p2) {
        // points p1 and p2
        this.p1 = p1;
        this.p2 = p2;

        // instance variables a, b, and c
        // a = - (y2 - y1)
        this.a = -(p2.getY() - p1.getY()); 

        // b = x2 - x1
        this.b = p2.getX() - p1.getX(); 

        // c = - (a * x1 + b * y1)
        this.c = -(this.a * p1.getX() + p1.getY() * this.b); 
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

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
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

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    // methods
    public double calculateSlope() {
        return ((double) (-a) / (double) (b));
    }

    public boolean isCoordinateOnLine(Point p) {
        if ((a * p.getX()) + (b * p.getY()) + (c) == 0) {
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

    public double calculateSlopeFromPoints() {
        Point p1 = getP1();
        Point p2 = getP2();
        return ((double) (p2.getY() - p1.getY())) / ((double) (p2.getX() - p1.getX()));
    }

    public String generatePointSlopeFormula() {
        Point p1 = getP1();
        double m = calculateSlopeFromPoints();
        return "(y - " + p1.getY() + ") = " + m + "(x - " + p1.getX() + ")";
    }
}