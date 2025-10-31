public class AutoUtils {
    

    public static int validateCleanlinessLevel(int cleanlinessLevel) {
        if (cleanlinessLevel < 0) {
            cleanlinessLevel = 0;
        } else if (cleanlinessLevel > 10) {
            cleanlinessLevel = 10;
        } 
        return cleanlinessLevel;
    }

    public static String generateUsername(String name) {
        int spaceIndex = name.indexOf(" ");

        if (spaceIndex == -1) {
            int year = (int) (Math.random() * 100) + 1950;
            return "@" + name.toLowerCase() + "_" + year;
        }

        String firstName = name.substring(0, spaceIndex);
        String lastName = name.substring(spaceIndex + 1, name.length());
        int year = (int) (Math.random() * 100) + 1950;

        return "@" + firstName.toLowerCase() + "_" + lastName.toLowerCase() + "_" + year;
    }


    public static void cleanCar(Car car) {
        int cleanLevel = car.getCleanlinessLevel();
        car.setCleanlinessLevel(cleanLevel + 2);
    }

    public static String fixName(String name) {

        String trimmedName = name.trim();
        int spaceIndex1 = trimmedName.indexOf(" ");
        
        if (spaceIndex1 == -1) {
            return trimmedName;
        }
        
        String firstName = trimmedName.substring(0, spaceIndex1);

        int index = spaceIndex1;
        while (index < trimmedName.length() && trimmedName.charAt(index) == ' ') {
            index++;
        }

        String lastName = trimmedName.substring(index);
        return firstName + " " + lastName;
    }


}
