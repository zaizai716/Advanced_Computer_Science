public class Utils {
    public static void main(String[] args) {
        

        // wrappers are useful because you can use methods with primitive data types

        // A class that contains a list of characters to form words
        // it gives strings methods that we can use
        String x = "hello";
        String.valueOf("123");

        // integers are primitive and do not have any methods
        int y = 10;
        Integer yWrapper = 10; // the value 10 has methods now

        yWrapper.toString();
        Integer.parseInt("121");

        boolean isFalse = false;
        Boolean isTrue = true;

        isTrue.toString();
        System.out.println(Boolean.parseBoolean("hello"));

        // Double wrapper
        double variabe = 12.1;
        


    }
}