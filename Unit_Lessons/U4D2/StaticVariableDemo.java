public class StaticVariableDemo {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Jigglypuff jiggly = new Jigglypuff();
            System.out.println(Jigglypuff.getType());

            Jigglypuff.setType("Fairy");

            for (int j = 0; j < 100; j++) {
                Jigglypuff jiggly = new Jigglypuff();
                System.out.println(Jigglypuff.getType());
            }
        }
    }
}