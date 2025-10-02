public class Demo {
    public static void main(String[] args) {
        // AND - ALL conditions have to be true
        int age = 20;
        boolean isFelon = false;

        if (age >= 18 && age >= 35 && !isFelon) {
            System.out.println("You can run for president and vote.");
        }

        age = 15;

        if (age < 35 || isFelon) 
            System.out.println("This person is not eligible for presidency. ");

    }

}