public class CastingDemo{
    public static void main(String[] args) {

        // implicit casting
        // storing smaller data types into larger ones
        // happens automatically

        int smallNumber = 100;
        long bigNumber = smallNumber; // int to to long
        float decimalNumber = bigNumber; // long to float
        double largeDecimal = decimalNumber; // float to double

        // Explicit Casting
        // we're manually converting a datatype, usually to a different data type that may incur data loss

        double pi = 3.14159;
        int engineerPi = (int) pi; // truncation
        System.out.println(engineerPi);
        pi = engineerPi;
        System.out.println(pi);

        long population = 800000000L;
        int limitedPopulation = (int) population;

        int letterA = 'a';
        System.out.println(letterA + 3);

    }
}