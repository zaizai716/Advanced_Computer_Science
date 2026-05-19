public class Rabbit extends Animal {
    private double teethLength;
    private String food;
    private boolean hasEaten;
    private boolean depressed;

    public Rabbit(double teethLength, String name, String food, boolean hasEaten, boolean depressed) {
        super(name);
        if (teethLength <= 0.0 || food == null) {
            throw new IllegalArgumentException("Invalid arguments.");
        }

        this.teethLength = teethLength;
        this.food = food;
        this.hasEaten = hasEaten;
        this.depressed = depressed;
    }

    // getters and setters
    public double getTeethLength() {
        return teethLength;
    }


    public void setTeethLength(double teethLength) {
        this.teethLength = teethLength;
    }


    public String getFood() {
        return food;
    }



    public void setFood(String food) {
        this.food = food;
    }


    public boolean isHasEaten() {
        return hasEaten;
    }



    public void setHasEaten(boolean hasEaten) {
        this.hasEaten = hasEaten;
    }



    public boolean isDepressed() {
        return depressed;
    }



    public void setDepressed(boolean depressed) {
        this.depressed = depressed;
    }


    // methods
    public void feed() {
        if (this.hasEaten == false) {
            this.hasEaten = true;
            this.hungry = false;
        } else {
            System.out.println(getName() + " is already fed.");
        }
    }
    
    public void feed(boolean hasEaten) {
        if (this.hasEaten == false) {
            this.hasEaten = hasEaten;
            this.hungry = !hasEaten;
        } else {
            System.out.println(getName() + " is already fed.");
        }
    }

    public String toString() {
        String string = "=====\n";
        string += getName() + "'s teeth length is " + getTeethLength() +
                ". Its food of choice is " + getFood() + "\n";
        string += "Depressed: " + isDepressed() + "\n";
        string += "Eaten: " + isHasEaten() + "\n";

        return string;
    }


}