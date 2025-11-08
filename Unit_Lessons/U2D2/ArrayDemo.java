public class ArrayDemo {
    public static void main(String[] args) {

        // Pokemon
        // you can have a taem of 6, index is max of 5

        // Pokemon[] team = new Pokemon[6];
        // {0, 1, 2, 3, 4, 5} ordered set

        // team[3] = new Pokemon("Charizard");
        // {0, 1, 2, "Charizard", 4, 5};

        // this code created a list of size 6, so the max index is 5 

        // Pokemon[] box = new Pokemon[30];

        // Pokemon[] box2 = new Pokemon[1000];

        int[] myFavoriteNumbers = new int[4];
        // my favorite numbers sub 0
        myFavoriteNumbers[0] = 7;
        myFavoriteNumbers[1] = 8;
        myFavoriteNumbers[2] = 13;
        myFavoriteNumbers[3] = 5;

        // {7, 8, 13, 5};

        myFavoriteNumbers[0] = 6;
        
        // {6, 8, 13, 5};

        System.out.println(myFavoriteNumbers[3]);

        /// print out the entire list
        for (int i = 0; i < myFavoriteNumbers.length; i++) {
            System.out.println(myFavoriteNumbers[i]);
        }

        // what if i actually have 5 favorite numbers?

        // list sizes are immutable <- can't change it without creating a new object
        // Strings are a list (array) of characters! They are also immutable!
        // {'h', 'e', 'l', 'l', 'o'}

        // String[] beatles = new String[4];
        // beatles[0] = "John Lennon";
        // beatles[1] = "Paul McCartney";

        String[] beatles = {"John Lennon", "Paul McCartney", "Ringo Starr", "George Harrison"};

        // System.out.println(args.length);
        String[] beatles2 = new String[5];
        for (int i = 0; i < beatles.length; i++) {
            beatles2[i] = beatles[i];
        }
        beatles2[4] = "Justin Yu";

        int[] number = new int[3];

        boolean[] trust = new boolean[3];

        String[] list = new String[3];

        

    }
}