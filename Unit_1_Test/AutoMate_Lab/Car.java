public class Car {

    private String model;
    private String ownerName;
    private int cleanlinessLevel;
    private String username;
    private boolean needsOilChange;

    public Car(String model, String ownerName, int cleanlinessLevel) {
        String fixedName = AutoUtils.fixName(ownerName);

        this.model = model;
        this.ownerName = fixedName;
        this.username = AutoUtils.generateUsername(fixedName);
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.needsOilChange = false;

    }

    public Car() {
        this.model = "BMW";
        this.ownerName = "Justin Yu";
        this.cleanlinessLevel = 4;
        this.needsOilChange = true;
        this.username = AutoUtils.generateUsername(this.ownerName);
    }

    // getters and setters
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = AutoUtils.fixName(ownerName);
    }

    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = AutoUtils.validateCleanlinessLevel(cleanlinessLevel);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public boolean isNeedsOilChange() {
        return needsOilChange;
    }

    public void setNeedsOilChange(boolean needsOilChange) {
        this.needsOilChange = needsOilChange;
    }

    // methods
    public String toString() {

        String response;
        if (this.needsOilChange == true) {
            response = "Yes";
        } else {
            response = "No";
        }

        return "== ABOUT CAR ==" + "\n" 
            + "Model: " + this.model + "\n"
            + "Owner: " + this.ownerName + "\n" 
            + "Username: " + this.username + "\n"
            + "Cleanliness Level: " 
            + this.cleanlinessLevel + "\n" 
            + "Does car need oil change? " 
            + response + "\n";
    }

    public boolean equals(Car other) {

        if (this.model.equals(other.getModel()) 
            &&
            this.ownerName.equals(other.getOwnerName()) 
            && 
            this.username.equals(other.getUsername()) 
            &&
            this.cleanlinessLevel == other.getCleanlinessLevel()
            && 
            this.needsOilChange == other.isNeedsOilChange()) {
            return true;
        }
        return false;

    }
    

}
