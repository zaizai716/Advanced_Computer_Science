public class PurrfectUtils {

    public static String determineCatMood(Cat cat) {
        String catName = cat.getName();
        int moodLevel = cat.getMoodLevel();
        if (moodLevel > 7 && moodLevel <= 10) {
            return "Currently, " + catName + " is in a great mood." + "\n"
                + "Petting is appreciated.";
        } else if (moodLevel > 3 && moodLevel <= 7) {
            return "Currently, " + catName + " is reminiscing of a past life." + "\n"
                + "Petting is acceptable.";
        } else {
            return "Currently, " + catName + " is plotting revengeance." + "\n"
                + "Petting is extremely risky.";
        }
    }

    public static char generateCatChar(String catId) {
        int sum = 0;
        for (int i = 0; i < catId.length(); i++) {
            char digitChar = catId.charAt(i);
            int digit = Integer.parseInt(String.valueOf(digitChar));
            sum += digit;
        }

        sum %= 26;
        return (char) (sum + 'A');
    }

    public static int generateRandomNumber(int low, int high) {
        if (low > high) {
            int temp = low;
            low = high;
            high = temp;
        }

        return (int) (Math.random() * (high - low) + low);
    }

    public static String validateCatId(String catId) {
        int idValue = Integer.parseInt(catId);
        if (idValue < 1000 || idValue > 9999) {
            int value = generateRandomNumber(1000, 10000);
            return String.valueOf(value);
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
        int originalMoodLevel = moodLevel;

        if (moodLevel >= 2) {
            moodLevel += 1;
        } else if (moodLevel < 2 && isHungry) {
            moodLevel -= 1;
        } else if (moodLevel < 2 && !isHungry) {
            moodLevel += 1;
        }

        cat.setMoodLevel(moodLevel);

        if (moodLevel > originalMoodLevel) {
            System.out.println("Petting successful!");
        } else {
            System.out.println("Petting failed...");
        }
    }

    public static void trimClaws(Cat cat) {
        System.out.println("Attempting to trim claws...");
        int moodLevel = cat.getMoodLevel();
        int decrease = generateRandomNumber(1, 3);
        moodLevel -= decrease;
        cat.setMoodLevel(moodLevel);

        if (decrease == 1) {
            System.out.println(cat.getName() + " did not like that...");
        } else {
            System.out.println(cat.getName() + " really hated that!");
        }
    }

    public static void cleanLitterBox(Cat cat) {
        int moodLevel = cat.getMoodLevel();
        cat.setHungry(true);
        cat.setMoodLevel(moodLevel + 1);

        System.out.println("Cleaning the litter box..."
            + "\n" + "Done!" + "\n" + cat.getName() + " appreciated that.");
    }

    public static void feed(Cat cat) {
        int moodLevel = cat.getMoodLevel();
        cat.setHungry(false);
        cat.setMoodLevel(moodLevel + 2);

        System.out.println("Filling up " + cat.getName() + "'s bowl..."
            + "\n" + "Done!" + "\n" + cat.getName() + " is eating..."
            + "\n" + cat.getName() + " is full!");
    }

}