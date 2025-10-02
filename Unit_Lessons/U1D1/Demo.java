public class Demo {
    public static void main(String[] args) {
        // AND - ALL conditions have to be true

        private int hello;
        private int world;
        private String goodbye;



        public int getHello() {
            return hello;
        }
        public void setHello(int hello) {
            this.hello = hello;
        }
        public int getWorld() {
            return world;
        }
        public void setWorld(int world) {
            this.world = world;
        }
        public String getGoodbye() {
            return goodbye;
        }
        public void setGoodbye(String goodbye) {
            this.goodbye = goodbye;
        }
        int age = 20;

        boolean isFelon = false;

        if (age >= 18 && age >= 35 && !isFelon) {
            System.out.println("You can run for president and vote.");
        }

        // OR - at least one condition has to be true
        age = 15;

        if (age < 35 || isFelon) 
            System.out.println("This person is not eligible for presidency. ");

        // READABILITY IS IMPORTANT

        boolean isRegistered = true;
        age = 25;
        boolean isCitizen = true;

        if (isRegistered) }
            if (age >= 18) {
                if (isCitizen) {
                    if (country.equals("USA")) {
                        System.out.println("You can vote!");
                    }
                }
            }
        
        // DON'T DO THE ABOVE

        // GUARDING IF STATEMENTS
        if (!isRegistered) {
            return;
        }
        if (age < 10) {
            return;
        }

    }

}