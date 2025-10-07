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
            dog.setStillInFacility(true); 
            personName = dog.getOwnerName();
        }

        public static String generateDogTag(int dogId, char dogChar) {
            return " " + dogId + dogChar + "";
        }
    
        public static int validateDogId(int dogId) {
            if (dogId >= 100 && dogId <= 999) {
                return dogId;
            } else {
                return (int) (Math.random() * 100);
            }
        }

        public static boolean validateDogTag(Dog dog) {
            int dogId = dog.getDogId();
            validateDogId(dogId);
            char dogChar = generateDogChar(dogId);
            String newDogTag = generateDogTag(dogId, dogChar);
            newDogTag.validateDogId()

        }
}
