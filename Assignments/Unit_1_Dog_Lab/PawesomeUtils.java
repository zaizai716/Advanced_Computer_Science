public class PawesomeUtils {

    // now relies on an object to run
    public static char generateDogChar(int dogId) {
        int dig3 = dogId % 10;
        int dig2 = (dogId / 10) % 10;
        int dig1 = ((dogId / 10) / 10) % 10;
        return (char) ('F' + ((dig3 + dig2 + dig1) % 10));
    }
    
    public static String pickup(Dog dog, String personName) {
        if (dog.getOwnerName().equals(personName)) {
            dog.setStillInFacility(false);
            return dog.getName() + " has been picked up by their owner "
                + dog.getOwnerName() + ".";
        } else {
            return dog.getName() + " can't leave! Safety first!";
        }
    }
    
    public static void checkIn(Dog dog, String personName) {
        if (validateDogTag(dog)) {
            dog.setStillInFacility(true); 
            System.out.println();
            dog.getOwnerName();
            System.out.println("Successful check in");
        } else {
            System.out.println("Unsuccessful check in");
        }
    }

    public static String generateDogTag(int dogId, char dogChar) {
        return dogId + "" + dogChar;
    }
    
    public static int validateDogId(int dogId) {
        if (dogId >= 100 && dogId <= 999) {
            return dogId;
        } else {
            return (int) ((Math.random() * 900) + 100);
        }
    }

    public static boolean validateDogTag(Dog dog) {
        int dogId = dog.getDogId();
        int validatedId = validateDogId(dogId);
        
        // Only update the dog's ID if it was invalid 
        if (validatedId != dogId) {
            dog.setDogId(validatedId);
            dog.setDogChar(generateDogChar(validatedId));
            dog.setDogTag(generateDogTag(validatedId, dog.getDogChar()));
        }
        
        // Check if the current dog tag matches what it should be
        char expectedChar = generateDogChar(dog.getDogId());
        String expectedTag = generateDogTag(dog.getDogId(), expectedChar);
        return expectedTag.equals(dog.getDogTag());
    }

    public static int convertAgeToHumanAge(Dog dog) {
        int age = dog.getAge();
        if (age == 1) {
            return 15;
        } else if (age == 2) {
            return 30;
        } else {
            return 5 * (age - 2);
        }
    }

    public static int convertAgeToDogYears(int humanYears) {
        if (humanYears <= 15) {
            return 1;
        } else if (humanYears >= 15 && humanYears <= 24) {
            return 2;
        } else {
            return 2 + ((humanYears - 24) / 5);
        }
    }

}
