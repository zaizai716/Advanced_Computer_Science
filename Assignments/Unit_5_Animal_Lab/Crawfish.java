public class Crawfish extends Animal {
    private double clawSize;
    private String color;
    private boolean isMolting;

    public Crawfish(double clawSize, String name, String color, boolean isMolting) {
        super(name);
        if (clawSize <= 0.0 || color == null) {
            throw new IllegalArgumentException("Invalid arguments.");
        }

        this.clawSize = clawSize;
        this.color = color;
        this.isMolting = isMolting;
    }

    // getters and setters
    public double getClawSize() {
        return clawSize;
    }

    public void setClawSize(double clawSize) {
        this.clawSize = clawSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isMolting() {
        return isMolting;
    }

    public void setMolting(boolean isMolting) {
        this.isMolting = isMolting;
    }

    // methods
    public void feed() {
        this.hungry = false;
        System.out.println(getName() + " has been fed.");
    }
    
    public void molt() {
        if (this.isMolting == false) {
            this.isMolting = true;
            System.out.println(getName() + " is now molting.");
        } else {
            System.out.println(getName() + " is already molting.");
        }
    }

    public String toString() {
        String string = "=====\n";
        string += getName() + "'s claw size is " + getClawSize() +
                ". Its color is " + getColor() + "\n";
        string += "Molting: " + isMolting() + "\n";

        return string;
    }
}
