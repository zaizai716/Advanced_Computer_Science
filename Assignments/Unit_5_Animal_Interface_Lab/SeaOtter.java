import java.util.Random;

public class SeaOtter extends Animal implements Swimmable, Pettable, Predator {

    private double swimSpeed;
    private double preferredDepth;
    private int friendlinessLevel;
    private int energyLevel;
    private String primaryPrey;
    private double averagePreyMass;
    private String[] facts;
    private Random rand;

    public SeaOtter() {
        super("Sea Otter",
                "Carnivora",
                "Mustelidae",
                "Enhydra",
                "lutris",
                "Kelp forests in cold coastal water");

        swimSpeed = 9.0;
        preferredDepth = 20.0;
        friendlinessLevel = 7;
        energyLevel = 9;
        primaryPrey = "shellfish";
        averagePreyMass = 0.2;

        facts = new String[] {
                "Sea otters often float on their backs while they eat.",
                "They use rocks to crack open hard shells.",
                "They have very thick fur that keeps them warm.",
                "They help kelp forests by eating sea urchins.",
                "They sometimes hold paws while they rest."
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
        System.out.println("The otter makes a quick chirping sound.");
    }

    @Override
    public void eat() {
        System.out.println("The otter cracks a shell on its chest and eats the inside.");
    }

    @Override
    public void move() {
        System.out.println("The otter paddles and rolls in the water.");
    }

    @Override
    public String getSoundDescription() {
        return "Soft chirps and squeaks near the waves.";
    }

    @Override
    public String getEatDescription() {
        return "It floats on its back and uses a stone like a tiny hammer.";
    }

    @Override
    public String getMoveDescription() {
        return "It twists and spins in the water using its tail to steer.";
    }

    @Override
    public double getSwimSpeed() {
        return swimSpeed;
    }

    @Override
    public double getPreferredDepth() {
        return preferredDepth;
    }

    @Override
    public void enterWater() {
        System.out.println("The otter slides off a rock into the water.");
    }

    @Override
    public void swim() {
        System.out.println("The otter swims on its back, kicking with its back feet.");
    }

    @Override
    public void exitWater() {
        System.out.println("The otter climbs onto a rock and shakes off.");
    }

    @Override
    public int getFriendlinessLevel() {
        return friendlinessLevel;
    }

    @Override
    public int getEnergyLevel() {
        return energyLevel;
    }

    @Override
    public void greetHuman() {
        System.out.println("The otter pops its head up and stares at the person.");
    }

    @Override
    public void bePetted() {
        System.out.println("The otter relaxes and seems to enjoy the attention.");
    }

    @Override
    public void playWithHuman() {
        System.out.println("The otter chases a floating toy in the water.");
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
        System.out.println("The otter searches under rocks for crabs and clams.");
    }

    @Override
    public void attackPrey() {
        System.out.println("The otter grabs a shellfish with its paws.");
    }

    @Override
    public void eatPrey() {
        System.out.println("The otter crunches the shell and eats the soft part.");
    }
}

