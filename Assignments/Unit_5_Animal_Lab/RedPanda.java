public class RedPanda extends Animal {
    
    public RedPanda(String name) {
        super(name);
    }
    
    public void feed() {
        this.hungry = false;
        System.out.println(getName() + " has been fed.");
    }
    
    public String toString() {
        String string = "=====\n";
        string += getName() + " is a Red Panda\n";
        string += "Hungry: " + isHungry() + "\n";
        return string;
    }
    
    public void eat(){
        System.out.println("I am eating.");
    }
}
