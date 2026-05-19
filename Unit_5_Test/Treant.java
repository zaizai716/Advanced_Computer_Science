public class Treant extends Monster {

    public Treant() {
        super("Truant the Treant",
              ElementType.EARTH,
              100,
              40,
              50,
              60,
              "Vine Whip",
              "Air Slash",
              ElementType.EARTH,
              ElementType.AIR);
    }

    @Override
    public String victoryNoise() {
        return getName() + " creaks victoriously!";
    }
}

