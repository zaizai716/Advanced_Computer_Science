public class Rectangle {
    // instantiate variables
    private int length;
    private int width;

    // constructors
    public Rectangle(int inputLength, int inputWidth) {
        length = inputLength;
        width = inputWidth;
    }

    public Rectangle() {
        length = 50;
        width = 25;
    }
    
    // methods
    public String toString() {
        return("This rectangle has a length of " + length + " and a width of " + width + ". Its area is " + (length * width) + ".");
    }

    public boolean equals(Rectangle other) {
        if (other.length == length && other.width == width) {
            return true;
        } else {
            return false;
        }
    }

    public int calculateArea() {
        return (length * width);
    }

    public int calculatePerimeter() {
        return ((2 * length) + (2 * width));
    }

    public double calculateDiagonal() {
        return Math.sqrt((length * length) + (width * width));
    }

    // getters
    public int getLength() {
        return length;
    }

    public int getWidth() {
        return width;
    }

    // setters
    public void setLength(int input) {
        length = input;
    }

    public void setWidth(int input) {
        width = input;
    }

}
