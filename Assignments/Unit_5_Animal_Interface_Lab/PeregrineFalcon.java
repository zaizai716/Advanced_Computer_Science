import java.util.Random;

public class PeregrineFalcon extends Animal implements Flyable, Predator {

    private double flightSpeed;
    private double maxAltitude;
    private String primaryPrey;
    private double averagePreyMass;
    private String[] facts;
    private Random rand;

    public PeregrineFalcon() {
        super("Peregrine Falcon",
                "Falconiformes",
                "Falconidae",
                "Falco",
                "peregrinus",
                "Cliffs, cities, and open areas");

        flightSpeed = 240.0;
        maxAltitude = 3000.0;
        primaryPrey = "medium birds";
        averagePreyMass = 0.5;

        facts = new String[] {
                "Peregrine falcons are the fastest animals on Earth.",
                "They live on every continent except Antarctica.",
                "They were once endangered because of pesticides.",
                "They often nest on tall city buildings.",
                "They usually catch other birds in midair."
        };

        rand = new Random();
    }

    @Override
    public String getFact(int index) {
        return facts[index];
    }

    @Override
    public String getFact() {
        return facts[rand.nextInt(facts.length)];
    }

    @Override
    public void makeSound() {
        System.out.println("The falcon calls, 'kek-kek-kek!'");
    }

    @Override
    public void eat() {
        System.out.println("The falcon plucks feathers and eats small pieces of meat.");
    }

    @Override
    public void move() {
        System.out.println("The falcon soars, then dives straight down.");
    }

    @Override
    public String getSoundDescription() {
        return "A short, sharp call from high above.";
    }

    @Override
    public String getEatDescription() {
        return "It holds its prey in its talons and tears off bites.";
    }

    @Override
    public String getMoveDescription() {
        return "It glides in circles, then suddenly drops into a fast dive.";
    }

    @Override
    public double getFlightSpeed() {
        return flightSpeed;
    }

    @Override
    public double getMaxAltitude() {
        return maxAltitude;
    }

    @Override
    public void takeOff() {
        System.out.println("The falcon pushes off a ledge and starts flapping.");
    }

    @Override
    public void fly() {
        System.out.println("The falcon flies with quick, shallow wingbeats.");
    }

    @Override
    public void land() {
        System.out.println("The falcon slows down and grabs onto a perch.");
    }

    @Override
    public String getPrimaryPrey() {
        return primaryPrey;
    }

    @Override
    public double getAveragePreyMass() {
        return averagePreyMass;
    }

    @Override
    public void stalkPrey() {
        System.out.println("The falcon circles above a group of birds.");
    }

    @Override
    public void attackPrey() {
        System.out.println("The falcon folds its wings and dives at its target.");
    }

    @Override
    public void eatPrey() {
        System.out.println("The falcon eats its catch on a safe perch.");
    }
}

