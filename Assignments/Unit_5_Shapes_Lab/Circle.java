import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

public class Circle extends Shape {
    private int radius;

    public Circle(int xCoord, int yCoord, int radius) {
        super(xCoord, yCoord);
        this.radius = radius;
    }

    public Circle(int radius) {
        this(0, 0, radius);
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public void draw(Graphics g) {
        Graphics2D g2D = (Graphics2D) g;
        g2D.setPaint(Color.cyan);
        g2D.fillOval(xCoord, yCoord, radius, radius);

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));
        g2D.drawOval(xCoord, yCoord, radius, radius);
    }

    public String toString() {
        return super.toString() + " It is a circle with a radius of " + radius + ". It's area is " + String.format("%.2f", getArea()) + ".";
    }
}
