public class CatTester {
    public static void main(String[] args) {
        Cat myCat = new Cat("Betsy", "Tabby"); // 13. need "new" keyword to create new object
        Cat otherCat = new Cat("Tiger Beast", "Tabby");
        System.out.println(myCat.toString());
        System.out.println("My Cat's Name: " + myCat.getName()); // 14. needs a print statement

        System.out.println("Are the cat's equal?" + myCat.equals(otherCat)); // 15. again, needs a print statement

        System.out.println("Is my cat hungry? " + myCat.getIsHungry()); // 16. wrong language

        String firstName = "Tiger";
        String lastName = "Beast"; // 17. wrong equals, should be =
        String name = firstName + " " + lastName;

        System.out.println("Changing the cat's name...");
        myCat.setName(name);
        System.out.println("The two cat's are the same now: " + myCat.equals(otherCat));

    }

}

