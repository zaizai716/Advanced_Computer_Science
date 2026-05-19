import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;

public class MyPanel extends JPanel {

    public MyPanel() {
        this.setPreferredSize(new Dimension(500, 500));
        this.setSize(500, 500);
    }

    public void paint(Graphics g) {
        // to-do: draw the house!

        // Adds shapes to an ArrayList, converting them all to Polygons
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        // building
        shapes.add(new Rectangle(125, 125, 250, 250));
        shapes.get(0).setFillColor(Color.blue);

        // door
        shapes.add(new Rectangle(175, 250, 50, 125));
        shapes.get(1).setFillColor(Color.yellow);

        // chimney
        shapes.add(new Rectangle(175, 75, 50, 75));
        shapes.get(2).setFillColor(Color.blue);

        // window
        shapes.add(new Rectangle(275, 200, 75, 75));
        shapes.get(3).setFillColor(Color.lightGray);

        // sun (circle)
        Circle sun = new Circle(50, 75, 40);
        sun.setFillColor(Color.yellow);
        shapes.add(sun);

        // roof
        Triangle roof = new Triangle(new int[]{125, 250, 375}, new int[]{125, 75, 125});
        roof.setFillColor(Color.red);
        shapes.add(roof);


        // Draws all the shapes in the ArrayList using that shape's draw method
        for (Shape p : shapes) {
            p.draw(g);
        }


    }


}
