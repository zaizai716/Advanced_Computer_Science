public class DogTester {
    public static void main(String[] args) {
        // Step 2: Create 3 Dog objects
        Dog dog1 = new Dog("Max", "Alice Johnson", 5, 123);
        Dog dog2 = new Dog();
        Dog dog3 = new Dog("Luna", "Bob Smith", 3, 693);
        
        // Step 3: Test getters and setters
        System.out.println("Initial dog1: " + dog1.getName() + ", Age: " + dog1.getAge());
        dog1.setName("Maximus");
        dog1.setAge(6);
        System.out.println("Updated dog1: " + dog1.getName() + ", Age: " + dog1.getAge());
        System.out.println();
        
        // Step 4: Test specialized methods
        System.out.println("Dog ID 123 char: " + dog1.getDogChar()); // Should be 'L'
        System.out.println("Dog ID 693 char: " + dog3.getDogChar()); // Should be 'N'
        System.out.println("Dog1 tag: " + dog1.generateDogTag());
        System.out.println("Dog1 toString: " + dog1.toString());
        System.out.println();
        
        // Step 5: Test equals method
        System.out.println("dog1 equals dog2? " + dog1.equals(dog2)); // false
        Dog dog1Copy = new Dog("Maximus", "Alice Johnson", 6, 123);
        System.out.println("dog1 equals dog1Copy? " + dog1.equals(dog1Copy)); // true
        System.out.println();
        
        // Step 6: Test edge case - stillInFacility = false
        dog2.setStillInFacility(false);
        System.out.println("Dog2 after leaving: " + dog2.toString());
    }
}