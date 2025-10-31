public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {

        int moodLevel = cat.getMoodLevel();
        if (moodLevel > 7 && moodLevel <= 10) {
            return "Currently, Cookie is in a great mood." + "\n"
                + "Petting is appreciated.";
        } else if (moodLevel > 3 && moodLevel <= 7) {
            return "Currently, Cookie is reminiscing of a past life." + "\n" 
                + "Petting is acceptable.";
        } else {
            return "Currently, Cookie is plotting revengeance." + "\n"
                + "Petting is extremely risky.";
        }

    }

    public static char generateCatChar(String catId) {
        char letter = 0;
        for (int i = 0; i < catId.length(); i++) {
            int dig = (int) catId.charAt(0);
            letter += dig;
        }

        letter %= 26;
        return (char) (letter + 'A');
    }

    public static int generateRandomNumber(int low, int high) {

        if (low > high) {
            high = low;
        }

        return (int) (Math.random() * (high - low) + low);
    }

    public static String validateCatId(String catId) {
        if (Integer.parseInt(catId) < 1000 && Integer.parseInt(catId) > 9999) {
            int value = (int) (Math.random() * (8999) + 1000);
            return value + ""; // to convert int to string
        } else {
            return catId;
        }
    }

    public static int validateMoodLevel(int moodLevel) {
        if (moodLevel < 0) {
            return 0;
        } else if (moodLevel > 10) {
            return 10;
        } else {
            return moodLevel;
        }
    }

    public static void bootUp(Cat cat) {
        System.out.println(cat.toString());
    }

    public static void pet(Cat cat) {
        System.out.println("Attempting to pet...");

        int moodLevel = cat.getMoodLevel();
        boolean isHungry = cat.isHungry();

        if (moodLevel >= 2) {
            moodLevel += 1;
        } else if (moodLevel < 2 && isHungry) {
            moodLevel -= 1;
        } else if (moodLevel < 2 && isHungry == false) {
            moodLevel += 1;
        } 

        if (moodLevel > cat.getMoodLevel()) {
            System.out.println("Petting successful!");
        } else {
            System.out.println("Petting failed!");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int moodLevel = cat.getMoodLevel();
        int decrease = generateRandomNumber(1, 2);
        moodLevel -= decrease;

        if (cat.getMoodLevel() - moodLevel == 1) {
            System.out.println("Cookie did not like that...");
        } else {
            System.out.println("Cookie really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        // original mood level
        int moodLevel = cat.getMoodLevel();

        // set new boolean values and mood level values
        cat.setHungry(true);
        cat.setMoodLevel(moodLevel += 1);

        System.out.println("Cleaning the litter box..." +
            "\n" + "Done!" + "\n" + "Cookie appreciated that.");

    }

    public static void feed(Cat cat) {
        int moodLevel = cat.getMoodLevel();

        cat.setHungry(false);
        cat.setMoodLevel(moodLevel += 2);

        System.out.println("Filling up Cookie's bowl..." + 
        "\n" + "Done!" + "\n" + "Cookie is eating..." +
        "\n" + "Cookie is full!");
    }

}