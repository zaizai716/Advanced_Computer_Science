public class Cat {
    // instance variables
    private String name;
    private String ownerName;
    private int moodLevel;
    private String catId;
    private char catChar;
    private boolean isHungry;

    // constructors 
    public Cat(String name, String ownerName, int moodLevel, String catId) {
        this.name = name;
        this.ownerName = ownerName;
        this.catId = PurrfectUtils.validateCatId(catId);
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
        this.catChar = PurrfectUtils.generateCatChar(catId);
        this.isHungry = true;
    }

    public Cat() { 
        this.name = "James";
        this.ownerName = "Owen";
        this.moodLevel = 5;
        this.catId = "3328";
        this.catChar = PurrfectUtils.generateCatChar();
        this.isHungry = true;
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public int getMoodLevel() {
        return moodLevel;
    }

    public void setMoodLevel(int moodLevel) {
        this.moodLevel = PurrfectUtils.validateMoodLevel(moodLevel);
    }

    public String getCatId() {
        return catId;
    }

    public void setCatId(String catId) {
        this.catId = PurrfectUtils.validateCatId(catId);
    }

    public char getCatChar() {
        return catChar;
    }

    public void setCatChar(char catChar) {
        this.catChar = catChar;
    }

    public boolean isHungry() {
        return isHungry;
    }

    public void setHungry(boolean isHungry) {
        this.isHungry = isHungry;
    }

    // methods
    public String generateCatTag() {
        return this.catId + this.catChar;
    }

    public String toString() {
        return "== ABOUT COOKIE == "
            + "Cookie is a cat." + "\n"
            + "Their tag is " + this.getCatId()
            + "." + "\n" + determineCatMood()

    }

    public boolean equals(Cat Other) {
        if (this.name.equals(Other.getName()) && this.ownerName.equals(Other.getOwnerName()) 
            && this.moodLevel == Other.moodLevel && this.generateCatTag() == 
            Other.generateCatTag() && this.isHungry == Other.isHungry()) {
                return true;
            } else {
                return false;
            }
    }


    

}
