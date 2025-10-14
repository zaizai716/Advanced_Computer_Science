public class DogTester {
    public static void main(String[] args) {
        System.out.println("=== Testing validateDogId() ===\n");
        
        // Test with valid IDs (100-999)
        System.out.println("Testing valid IDs:");
        System.out.println("ID 100: " + PawesomeUtils.validateDogId(100));
        System.out.println("ID 500: " + PawesomeUtils.validateDogId(500));
        System.out.println("ID 999: " + PawesomeUtils.validateDogId(999));
        
        // Test with invalid IDs
        System.out.println("\nTesting invalid IDs (should return random 100-999):");
        System.out.println("ID 50: " + PawesomeUtils.validateDogId(50));
        System.out.println("ID 1000: " + PawesomeUtils.validateDogId(1000));
        System.out.println("ID -10: " + PawesomeUtils.validateDogId(-10));
        System.out.println("ID 99: " + PawesomeUtils.validateDogId(99));
        
        System.out.println("\n=== Testing validateDogTag() ===\n");
        
        // Create three different Dog objects
        Dog dog1 = new Dog("Buddy", "Alice", 5, 250);
        Dog dog2 = new Dog("Max", "Bob", 3, 678);
        Dog dog3 = new Dog(); // uses default constructor
        
        // Test validateDogTag for each dog
        System.out.println("Dog 1: " + dog1.getName() + " | Tag: " + dog1.getDogTag());
        System.out.println("Valid? " + PawesomeUtils.validateDogTag(dog1));
        
        System.out.println("\nDog 2: " + dog2.getName() + " | Tag: " + dog2.getDogTag());
        System.out.println("Valid? " + PawesomeUtils.validateDogTag(dog2));
        
        System.out.println("\nDog 3: " + dog3.getName() + " | Tag: " + dog3.getDogTag());
        System.out.println("Valid? " + PawesomeUtils.validateDogTag(dog3));
        
        System.out.println("\n=== Testing Edge Cases ===\n");
        
        // Manually set dog1's tag to invalid value
        System.out.println("Setting dog1's tag to 'INVALID123'...");
        dog1.setDogTag("INVALID123");
        System.out.println("Dog 1 tag now: " + dog1.getDogTag());
        System.out.println("Valid? " + PawesomeUtils.validateDogTag(dog1));
        
        // Test modifying dogId to invalid value
        System.out.println("\nSetting dog2's ID to 50 (invalid)...");
        dog2.setDogId(50);
        System.out.println("Dog 2 ID now: " + dog2.getDogId());
        System.out.println("Valid? " + PawesomeUtils.validateDogTag(dog2));
        
        System.out.println("\n=== Testing convertAgeToHumanAge() ===\n");
        
        // Create three dogs with different ages (1, 2, and 5)
        Dog youngDog = new Dog("Puppy", "Sarah", 1, 111);
        Dog middleDog = new Dog("Rover", "Mike", 2, 222);
        Dog olderDog = new Dog("Buddy", "Emma", 5, 333);
        
        System.out.println(youngDog.getName() + " (Dog age: 1) = " 
            + PawesomeUtils.convertAgeToHumanAge(youngDog) + " human years");
        System.out.println(middleDog.getName() + " (Dog age: 2) = " 
            + PawesomeUtils.convertAgeToHumanAge(middleDog) + " human years");
        System.out.println(olderDog.getName() + " (Dog age: 5) = " 
            + PawesomeUtils.convertAgeToHumanAge(olderDog) + " human years");
        
        System.out.println("\n=== Testing convertAgeToDogYears() ===\n");
        
        // Test several sample human ages
        System.out.println("Human age 10 = " + PawesomeUtils.convertAgeToDogYears(10) + " dog years");
        System.out.println("Human age 15 = " + PawesomeUtils.convertAgeToDogYears(15) + " dog years");
        System.out.println("Human age 20 = " + PawesomeUtils.convertAgeToDogYears(20) + " dog years");
        System.out.println("Human age 24 = " + PawesomeUtils.convertAgeToDogYears(24) + " dog years");
        System.out.println("Human age 29 = " + PawesomeUtils.convertAgeToDogYears(29) + " dog years");
        System.out.println("Human age 50 = " + PawesomeUtils.convertAgeToDogYears(50) + " dog years");
        System.out.println("Human age 100 = " + PawesomeUtils.convertAgeToDogYears(100) + " dog years");
    }
}