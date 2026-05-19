public abstract class Animal {
    
    // instance variables
    private double age;
    protected String name;
    private boolean isAlive;
    protected boolean hungry;
    private double weight;
    private int speed;
    
    // constructors
    public Animal(String name) {
        this.name = name;
        this.isAlive = true;
    }
    
    // getters and setters
    public double getAge() {
        return age;
    }
    
    public void setAge(double age) {
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public boolean isAlive() {
        return isAlive;
    }
    
    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }
    
    public double getWeight() {
        return weight;
    }
    
    public void setWeight(double weight) {
        this.weight = weight;
    }
    
    public double getSpeed() {
        return speed;
    }
    
    public void setSpeed(int speed) {
        this.speed = speed;
    }
    
    public boolean isHungry() {
        return hungry;
    }
    
    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }
    
    // methods
    public void die() {
        this.isAlive = false;
        System.out.println(name + " died.");
    }
    
    // abstract methods
    public abstract void feed();
    
    public abstract String toString();
}
