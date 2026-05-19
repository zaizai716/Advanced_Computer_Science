public class Rectangle extends Polygon {
    private double length;
    private double width;

    public Rectangle(double width, double length) {
        super(4);
        this.length = width;
        this.width = length;
    }

    public Rectangle() {
        this(4, 3);  // one call initializes sides (via other constructor) and length, width
    }

    public double getArea() {
        return length * width;
    }

    public String toString() {
        return super.toString() + "\nIt is a rectangle with a length of " + length + " and width of " + width + ". Its area is " + getArea() + ".";
    }
}
