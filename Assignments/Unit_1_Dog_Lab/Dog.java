public class Dog {
    
    private String name;
    private String ownerName;
    private int age;
    private int dogId;
    private char dogChar = generateDogChar();
    private String dogTag = generateDogTag();
    private boolean stillInFacility = true;

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
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getDogId() {
        return dogId;
    }
    public void setDogId(int dogId) {
        this.dogId = dogId;
    }
    public char getDogChar() {
        return dogChar;
    }
    public void setDogChar(char dogChar) {
        this.dogChar = dogChar;
    }
    public String getDogTag() {
        return dogTag;
    }
    public void setDogTag(String dogTag) {
        this.dogTag = dogTag;
    }
    public boolean isStillInFacility() {
        return stillInFacility;
    }
    public void setStillInFacility(boolean stillInFacility) {
        this.stillInFacility = stillInFacility;
    }

    // constructors
    public Dog(String name, String ownerName, int age, int dogId) {
        this.name = name;
        this.ownerName = ownerName;
        this.age = age;
        this.dogId = dogId;
    }

    public Dog() {
        this.name = "Benjamin Shapiro";
        this.ownerName = "Justin";
        this.age = 13;
        this.dogId = 103;
    }

    // methods
    public String toString() {
        if (this.stillInFacility) {
            return this.name + " is a good dog. They are " + this.age + " years old" 
            +  " and belongs to " + this.ownerName + ". They are currently in our facility." 
            + " For employee use only: DogTag is " + dogTag + ".";
        } else {
            return this.name + "is a good dog. They are " + this.age + "years old" 
            +  " and belongs to " + this.ownerName + ". They are currently not in our facility." 
            + " For employee use only: DogTag is" + dogTag + ".";
        }
        
    }

    public boolean equals(Dog other) {
        return this.name.equals(other.name) && this.ownerName.equals(other.ownerName)
            && this.age == other.age && this.dogId == other.dogId && this.dogChar == other.dogChar
            && this.stillInFacility == other.stillInFacility;
    }

    public String generateDogTag() {
        return " " + dogId + dogChar + "";
    }

    public char generateDogChar() {
        int dig3 = this.dogId % 10;
        int dig2 = (this.dogId / 10) % 10;
        int dig1 = ((this.dogId / 10) / 10) % 10;
        return (char) ('F' + ((dig3 + dig2 + dig1) % 10));
    }


}