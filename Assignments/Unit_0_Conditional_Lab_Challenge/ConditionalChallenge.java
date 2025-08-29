public class ConditionalChallenge {

    public static void main(String[] args) {

        // Your code will go here
        
        // Part 1: Temperature Converter
        System.out.println("--- Part 1: Temperature Converter ---");

        double temperature = 90.3;
        boolean isCold = false;
        if (isCold) {
            temperature -= 15;
        } else {
            temperature += 10;
        }
        System.out.println(temperature);
        
        // Part 2: Grade Calculator
        int score = 72;
        if (score >= 70) {
            System.out.println("Passed: " + score);
        } else {
            System.out.println("Failed: " + score);
        }
        
        // Part 3: Leap Year Checker
        int temperature2 = 22;
        if (temperature2 > 80) {
            System.out.println("Summer");
        } else if (temperature2 >= 60 && temperature2 <= 80) {
            System.out.println("Spring");
        } else if (temperature2 >= 40 && temperature2 <= 59) {
            System.out.println("Fall");
        } else {
            System.out.println("Winter");
        }
        
        // Part 4: Number Classifier
        int number = -101;
        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0 && number > -100) {
            System.out.println("Negative");
        } else if (number == 0) {
            System.out.println("Zero");
        } else if (number > 100) {
            System.out.println("Large");
        } else if (number < -100) {
            System.out.println("Very Negative");
        }
        
    }


}
