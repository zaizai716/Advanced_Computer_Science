// A class is a collection of related attributes and behaviors. 

public class HelloWorld {

    // Main -> method is the entry point of any Java application.
    public static void main(String[] args) {

        System.out.println("Hello World");
        System.out.println("My name is Justin.");

        System.out.println("My favorite pizza topping is sausage.");
        System.out.println("My favorite caffeinated drink is matcha.");
        
        // 8 primitive data types
        int number = 5; // integer
        char letter = 'A'; // character
        boolean isTrue = true; // boolean
        float decimal = 50.0f; // 32 bit decimal
        double bigdecimal = 0.6; // 64 bit decimal

        // INT ALTERNATIVES
        byte age = 25;
        short condition = 3000;
        long bigInteger = 10000; 

        String myName = "Justin"; // String is a class, not a datatype
        // String -> a collection of characters to describe an object 

        // print out number of characters in myName
        System.out.println(myName.length());

        // conditional statement
        // if this happens, then that happens
        // conditionals are always a boolean
        int value = 5;
        if (value == 5) {
            System.out.println(value);
        }

        boolean isCompSciFun = true;
        if (isCompSciFun){
            System.out.println("Comp Sci is fun!");
        } else {
            System.out.println("Comp Sci sucks!");
        }

        // Challenge -> Write a conditional statement if else statment where you do something if you ate 5 apples vs 10. 
        int appleCount = 1; 
        if (appleCount == 5){
            System.out.println("You ate 5 apples!");
        } else if (appleCount == 10){
            System.out.println("You ate 10 apples");
        } else {
            System.out.println("You ate apples!");
        }

    }

    
} 