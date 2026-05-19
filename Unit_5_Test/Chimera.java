public class Chimera extends Monster {

    public Chimera() {
        super("Chimney the Chimera",
              ElementType.FIRE,
              50,
              50,
              10,
              140,
              "Pepper Breath",
              "Deathly Scream",
              ElementType.FIRE,
              ElementType.AIR);
    }

    @Override
    public String victoryNoise() {
        return getName() + " lets out a triumphant roar!";
    }
}

