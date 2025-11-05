import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        
        // NAME
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What is your full government name?");

        // String governmentName = keyboard.next();  // grabs up to the first space
        String governmentName = keyboard.nextLine(); // grabs text up to the new line

        System.out.println("Hello, " + governmentName + "!");

        // AGE
        System.out.println("What is your current age?");

        int age = keyboard.nextInt();

        if (age >= 18) {
            System.out.println("Congratulations, you can vote!");
        } else {
            System.out.println("Come back again soon!");
        }


        // MANGOES
        System.out.println("Will you vote to make mangos mandatory for breakfast every day.");
        boolean lovesMangoes = keyboard.nextBoolean();

        // do while loop does action at least once and does action before checking condition
        // do {
        //     System.out.println();
        // }
        // while (lovesMangoes == false);

        while (lovesMangoes == false) {
            System.out.println("Again... will you VOTE to make mangos mandatory every day (True/False)");
            lovesMangoes = keyboard.nextBoolean();
        }

        System.out.println("Great! Thank you for supporting big mango!");

    }
}