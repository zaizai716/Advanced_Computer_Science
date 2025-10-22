/**
 * A utility class for performing various operations on names.
 * Provides methods to extract first names, last names, middle names,
 * and format names in different ways.
 */
public class NameOps {
    /**
     * Creates a formatted string for method call display.
     *
     * @param method the method name
     * @param name the name parameter
     * @return formatted string showing method call
     */
    public static String printMethodCall(String method, String name) {
        return method + "(\"" + name + "\"): ";
    }

    /**
     * Returns a string indicating that the given name is awesome.
     *
     * @param name the name to make awesome
     * @return formatted string with "is awesome!"
     */
    public static String whoIsAwesome(String name) {
        return name + " is awesome!";
    }

    /**
     * Finds the index of the first space in the given name.
     *
     * @param name the name to search
     * @return index of first space, or -1 if no space found
     */
    public static int indexOfFirstSpace(String name) {
        return name.indexOf(" ");
    }

    /**
     * Finds the index of the second space in the given name.
     *
     * @param name the name to search
     * @return index of second space, or -1 if no second space found
     */
    public static int indexOfSecondSpace(String name) {
        int firstSpace = name.indexOf(" ");
        return name.indexOf(" ", firstSpace + 1);
    }

    /**
     * Extracts the first name from a full name.
     *
     * @param name the full name
     * @return the first name, or the entire name if no space found
     */
    public static String findFirstName(String name) {
        int firstSpace = name.indexOf(" ");
        if (firstSpace == -1) {
            return name; // No space found, return the whole name
        }
        return name.substring(0, firstSpace);
    }

    /**
     * Extracts the last name from a full name.
     *
     * @param name the full name
     * @return the last name, or empty string if no space found
     */
    public static String findLastName(String name) {
        int lastSpace = name.lastIndexOf(" ");
        if (lastSpace == -1) {
            return ""; // No space found, return empty string
        }
        return name.substring(lastSpace + 1);
    }

    /**
     * Extracts the middle name from a full name.
     *
     * @param name the full name
     * @return the middle name, or empty string if no middle name found
     */
    public static String findMiddleName(String name) {
        int firstSpace = name.indexOf(" ");
        int lastSpace = name.lastIndexOf(" ");
        if (firstSpace == -1 || lastSpace == -1 || firstSpace == lastSpace) {
            return ""; // No middle name found
        }
        return name.substring(firstSpace + 1, lastSpace);
    }

    /**
     * Generates a formatted name string in "Last, First M." format.
     *
     * @param name the full name to format
     * @return formatted name string
     */
    public static String generateLastFirstMidInitial(String name) {
        String lastName = findLastName(name);
        String middleName = findMiddleName(name);
        String firstName = findFirstName(name);
        
        if (lastName.isEmpty()) {
            return firstName; // Only one name
        } else if (middleName.isEmpty()) {
            return lastName + ", " + firstName; // Two names
        } else {
            char firstChar = middleName.charAt(0);
            return lastName + ", " + firstName + " " + firstChar + "."; // Three names
        }
    }
}
