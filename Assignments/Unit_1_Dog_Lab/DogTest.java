public class DogTest {
    public static void main(String[] args) {
        System.out.println("=== Testing generateDogChar() ===");
        testGenerateDogChar();
        
        System.out.println("\n=== Testing pickup() ===");
        testPickup();
        
        System.out.println("\n=== Testing checkIn() ===");
        testCheckIn();
    }
    
    // Test 1: generateDogChar()
    public static void testGenerateDogChar() {
        System.out.println(Dog.generateDogChar(123)); // Expected: 'L' (1+2+3=6, F+6=L)
        System.out.println(Dog.generateDogChar(456)); // Expected: 'K' (4+5+6=15, 15%10=5, F+5=K)
        System.out.println(Dog.generateDogChar(789)); // Expected: 'J' (7+8+9=24, 24%10=4, F+4=J)
        System.out.println(Dog.generateDogChar(103)); // Expected: 'J' (1+0+3=4, F+4=J)
    }
    
    // Test 2: pickup()
    public static void testPickup() {
        Dog myDog = new Dog("Buddy", "Maria", 5, 123);
        
        // Scenario 1: Correct owner
        System.out.println("Before pickup: stillInFacility = " + myDog.isStillInFacility());
        String result1 = Dog.pickup(myDog, "Maria");
        System.out.println(result1);
        System.out.println("After pickup: stillInFacility = " + myDog.isStillInFacility());
        
        // Scenario 2: Wrong person
        Dog myDog2 = new Dog("Max", "John", 3, 456);
        System.out.println("\nBefore pickup attempt: stillInFacility = " + myDog2.isStillInFacility());
        String result2 = Dog.pickup(myDog2, "Sarah");
        System.out.println(result2);
        System.out.println("After pickup attempt: stillInFacility = " + myDog2.isStillInFacility());
    }
    
    // Test 3: checkIn()
    public static void testCheckIn() {
        Dog myDog = new Dog("Charlie", "OldOwner", 7, 789);
        myDog.setStillInFacility(false); // Dog is currently not in facility
        
        System.out.println("Before checkIn: stillInFacility = " + myDog.isStillInFacility());
        System.out.println("Before checkIn: owner = " + myDog.getOwnerName());
        
        Dog.checkIn(myDog, "NewOwner");
        
        System.out.println("After checkIn: stillInFacility = " + myDog.isStillInFacility());
        System.out.println("After checkIn: owner = " + myDog.getOwnerName());
    }
}