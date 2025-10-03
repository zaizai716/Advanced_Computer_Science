public class StaticDemo {
    public static void main(String[] args) {
        // if you have no constructor, I'll make a default for you and
        // and assign all instance variables to their null state
        // StaticDemo object = new StaticDemo();

        // object.firstIfTest();

        // static methods / helper methods
        // classes that hold static methods only are called helper classes
        String demo = StaticDemo.secondIfTest();
        System.out.println(demo);

    }

    // this method belongs to the object of the class
    public void firstIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            System.out.println("X is less than y");
        } 
        if (x == z) {
            System.out.println("X is equal to Z.");
        }
    }

    // this method belongs to the class, no object required
    // static methods can run without calling on an object
    public static String secondIfTest() {
        int x = 4;
        int y = 3;
        int z = 4;

        if (x < y) {
            return "X is less than y.";
        } 
        if (x == z) {
            return "X is equal to Z.";
        }

        return "hello there";
    }

}