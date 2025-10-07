public class StringDemo {
    
    // in the AP only use these methods from this class
    public static void main(String[] args) {
        // Strings are objects
        // simply adds strings to String Pool, doesn't create an object
        String fullName = "Juan Lopez";
        String fullName2 = "Juan Lopez";
        fullName2 = "Juan Antonio Lopez";
        // actually creates a Juan Lopez because we used the new keyword
        String fullName3 = new String("Juan Lopez");

        // 
        fullName += ":)";

        // Strings are immutable (they can't change!)
        // Any change immediately creates a new string object

        System.out.println(fullName == fullName3); // false
        System.out.println(fullName.equals(fullName3)); // true

        // methods
        // charAt() -> returns the index of a char value
        // "Juan Lopez"
        System.out.println(fullName.charAt(3));

        // indexOf() -> returns index of a char value
        System.out.println(fullName.indexOf("n"));
        // returns 3

        // substring() returns a piece of a string given a starting and ending index

        // "Juan Antonio Lopez"
        int firstSpace = fullName2.indexOf(" ");

        String middleLastName = fullName2.substring(firstSpace); // create a substring starting at the first space to teh end

        // " Antonio Lopez"
        System.out.println(middleLastName.indexOf("n"));

        // "Antonio"
        String middleName = fullName2.substring(5, 13);
        // substring(inclusive, exclusive)

        System.out.println(middleName.indexOf("z")); // returns -1, this is useful

        // compareTo() -> returns a number depending on the order
        String string1 = "abc";
        String string2 = "hbd";

        System.out.println(string2.compareTo(string1));
        // returns negative if abc is "before" abd
        // returns positive if abc is "after" abd
        // returns 0 if strings are equal

        

    }
}