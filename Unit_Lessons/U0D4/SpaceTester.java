public class SpaceTester {

    public static void main (String[] args) {
        // 1. Instantiate a spaceship object
        Spaceship ship = new Spaceship("red", 30, 90.0, true);
        // the new keyword creates a new instance of the class (aka an object)

        // 2. Invoke a method
        String shipDescription = ship.getDescription();
        int shipPassengerCount = ship.getPassengerCount();
        double shipFuelLevel = ship.getFuelLevel();

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);

        // 3. Manipulate the data
        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuelLevel);

        ship.setDescription("green");
        ship.setPassengerCount(50);
        ship.setFuelLevel(80.0);

        System.out.println(shipDescription);
        System.out.println(shipPassengerCount);
        System.out.println(shipFuelLevel);
        
    }

}