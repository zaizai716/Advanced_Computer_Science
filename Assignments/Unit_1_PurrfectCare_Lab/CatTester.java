public class CatTester {
    public static void main(String[] args) {
        Cat cookie = new Cat("Cookie", "Lopez", 8, "1435");
        
        System.out.println("=== Initial Cat Creation ===");
        System.out.println("Name: " + cookie.getName());
        System.out.println("Owner: " + cookie.getOwnerName());
        System.out.println("Mood Level: " + cookie.getMoodLevel());
        System.out.println("Cat ID: " + cookie.getCatId());
        System.out.println("Cat Char: " + cookie.getCatChar());
        System.out.println("Tag: " + cookie.generateCatTag());
        System.out.println("Is Hungry: " + cookie.isHungry());
        System.out.println();
        
        System.out.println("=== Testing Setters ===");
        System.out.println("Before update - Tag: " + cookie.generateCatTag());
        cookie.setCatId("9999");
        System.out.println("After setCatId(9999) - Tag: " + cookie.generateCatTag());
        System.out.println("Cat Char updated to: " + cookie.getCatChar());
        System.out.println();
        
        cookie.setCatId("1435");
        cookie.setMoodLevel(8);
        System.out.println("Reset to original - Tag: " + cookie.generateCatTag());
        System.out.println();
        
        System.out.println("=== Testing equals() ===");
        Cat cookie2 = new Cat("Cookie", "Lopez", 8, "1435");
        System.out.println("cookie.equals(cookie2): " + cookie.equals(cookie2));
        System.out.println();
        
        System.out.println("=== Testing bootUp() ===");
        PurrfectUtils.bootUp(cookie);
        System.out.println();
        
        System.out.println("=== Testing pet() ===");
        PurrfectUtils.pet(cookie);
        System.out.println();
        
        System.out.println("=== Testing trimClaws() 4 times ===");
        for (int i = 0; i < 4; i++) {
            PurrfectUtils.trimClaws(cookie);
        }
        System.out.println();
        
        System.out.println("=== Testing cleanLitterBox() ===");
        PurrfectUtils.cleanLitterBox(cookie);
        System.out.println();
        
        System.out.println("=== Testing feed() ===");
        PurrfectUtils.feed(cookie);
        System.out.println();
    }
}