public class Tarantula extends Animal {
    
    // instance variables specific to Tarantula
    private int legCount;
    private String habitat;
    private boolean venomous;
    private double legSpan; // in centimeters
    private String species;
    private boolean canRegenerateLegs;
    
    // no-argument constructor
    public Tarantula() {
        super("Unknown");
        this.legCount = 8;
        this.habitat = "Tropical forests";
        this.venomous = true;
        this.legSpan = 15.0;
        this.species = "Unknown";
        this.canRegenerateLegs = true;
        this.hungry = true;
    }
    
    // parameterized constructor
    public Tarantula(String name, int legCount, String habitat, boolean venomous, 
                     double legSpan, String species, boolean canRegenerateLegs) {
        super(name);
        if (legCount < 0 || legSpan <= 0 || habitat == null || species == null) {
            throw new IllegalArgumentException("Invalid arguments.");
        }
        this.legCount = legCount;
        this.habitat = habitat;
        this.venomous = venomous;
        this.legSpan = legSpan;
        this.species = species;
        this.canRegenerateLegs = canRegenerateLegs;
        this.hungry = true;
    }
    
    // getters and setters
    public int getLegCount() {
        return legCount;
    }
    
    public void setLegCount(int legCount) {
        if (legCount < 0) {
            throw new IllegalArgumentException("Leg count cannot be negative.");
        }
        this.legCount = legCount;
    }
    
    public String getHabitat() {
        return habitat;
    }
    
    public void setHabitat(String habitat) {
        if (habitat == null) {
            throw new IllegalArgumentException("Habitat cannot be null.");
        }
        this.habitat = habitat;
    }
    
    public boolean isVenomous() {
        return venomous;
    }
    
    public void setVenomous(boolean venomous) {
        this.venomous = venomous;
    }
    
    public double getLegSpan() {
        return legSpan;
    }
    
    public void setLegSpan(double legSpan) {
        if (legSpan <= 0) {
            throw new IllegalArgumentException("Leg span must be positive.");
        }
        this.legSpan = legSpan;
    }
    
    public String getSpecies() {
        return species;
    }
    
    public void setSpecies(String species) {
        if (species == null) {
            throw new IllegalArgumentException("Species cannot be null.");
        }
        this.species = species;
    }
    
    public boolean canRegenerateLegs() {
        return canRegenerateLegs;
    }
    
    public void setCanRegenerateLegs(boolean canRegenerateLegs) {
        this.canRegenerateLegs = canRegenerateLegs;
    }
    
    // methods
    public void feed() {
        this.hungry = false;
        System.out.println(getName() + " has been fed.");
    }
    
    // unique method specific to tarantula behavior
    public void molt() {
        System.out.println(getName() + " is molting and shedding its exoskeleton.");
        if (canRegenerateLegs && legCount < 8) {
            legCount++;
            System.out.println(getName() + " has regenerated a leg! Current leg count: " + legCount);
        }
    }
    
    public void spinWeb() {
        System.out.println(getName() + " is spinning a web in its " + habitat + " habitat.");
    }
    
    public String toString() {
        String string = "=====\n";
        string += getName() + " is a " + species + " Tarantula\n";
        string += "Habitat: " + habitat + "\n";
        string += "Leg Count: " + legCount + "\n";
        string += "Leg Span: " + legSpan + " cm\n";
        string += "Venomous: " + venomous + "\n";
        string += "Can Regenerate Legs: " + canRegenerateLegs + "\n";
        string += "Hungry: " + isHungry() + "\n";
        string += "Alive: " + isAlive() + "\n";
        return string;
    }
}
