public class ForEachDemo {

    // for each loops do not work when modifying immutable data types like strings 
    // or primitive data types like ints and bools

    public static void main(String[] args) {
        int[] x = {1, 2, 3, 4, 5};

        for (int number : x) {
            number = number + 10; // creating a copy of a number, but doesn't ever change the original number
        }
    

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i]);
        }

        for (int number : x) {
            System.out.println(number);
        }

        String[] names = {"Beverly, Levi, Ava, Boyan"};

        for (String name : names) {
            name = "hello, " + name;
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}