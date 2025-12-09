public class BobaShopMember {
    private String name;
    private boolean[] loyaltyCredits;

    public BobaShopMember(String name, boolean[] loyaltyCredits) {
        this.name = name;
        this.loyaltyCredits = loyaltyCredits;
    }

    public BobaShopMember(String name) {
        this.name = name;
        this.loyaltyCredits = new boolean[10]; // default size of 10
    }

    // getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean[] getLoyaltyCredits() {
        return loyaltyCredits;
    }

    public void setLoyaltyCredits(boolean[] loyaltyCredits) {
        this.loyaltyCredits = loyaltyCredits;
    }

    // methods
    public void grantLoyaltyCredit() {
        boolean[] credits = getLoyaltyCredits();

        for (int i = 0; i < credits.length; i++) {
            if (credits[i] == false) {
                credits[i] = true;
                break;
            }
        }
    }

    public int countLoyaltyCredits() {
        boolean[] credits = getLoyaltyCredits();
        int numCredits = 0;

        for (int i = 0; i < credits.length; i++) {
            if (credits[i] == true) {
                numCredits++;
            }
        }

        return numCredits;
    }

    public String determineMembershipStatus() {
        int numCredits = countLoyaltyCredits();

        if (numCredits >= 6) {
            return "Gold Member";
        } else if (numCredits >= 3 && numCredits <= 5) {
            return "Silver Member";
        } else {
            return "Plus Member";
        }

    }

    public String loyaltyHistory() {
        boolean[] credits = getLoyaltyCredits();
        String loyalty = "Loyalty History: [";

        for (int i = 0; i < credits.length; i++) {
            if (credits[i] == true) {
                loyalty += "X, ";
            } 
            if (i == (credits.length - 1)) {
                if (credits[i] == true) {
                    loyalty += "X]";
                } else {
                    loyalty += "-]";
                }
            }

        }

        return loyalty;

    }

    public String toString() {
        return getName() + "(" + determineMembershipStatus()
            + "), " + loyaltyHistory();
    }

    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        
        if (this.getClass() != other.getClass()) {
            return false;
        }
        
        BobaShopMember otherMember = (BobaShopMember) other;
        
        if (!this.getName().equals(otherMember.getName())) {
            return false;
        }
        
        boolean[] array1 = getLoyaltyCredits();
        boolean[] array2 = otherMember.getLoyaltyCredits();
        
        if (array1.length != array2.length) {
            return false;
        }
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        
        return true;
    }
}