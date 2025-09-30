public class Bank {
    private int numberOfLoanOfficers;
    private int numberOfTellers;

    // constructor
    public Bank(int numberOfLoanOfficers, int numberOfTellers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
        this.numberOfTellers = numberOfTellers;
    }

    // getters
    public int getNumberOfLoanOfficers() {
        return numberOfLoanOfficers;
    }

    public int getNumberOfTellers() {
        return numberOfTellers;
    }

    // setters
    public void setNumberOfLoanOfficers(int numberOfLoanOfficers) {
        this.numberOfLoanOfficers = numberOfLoanOfficers;
    }

    public void setNumberOfTellers(int numberOfTellers) {
        this.numberOfTellers = numberOfTellers;
    }

    // methods
    public int computeTotalEmployees() {
        return (this.numberOfLoanOfficers + this.numberOfTellers);
    }

    public String toString() {
        return "This bank has " + numberOfLoanOfficers 
            + " loan officers and " 
            + numberOfTellers + " tellers.";
    }

    public boolean equals(Bank other) {
        boolean areLoanOfficersEqual = this.numberOfLoanOfficers == other.numberOfLoanOfficers;
        boolean areTellersEqual = this.numberOfTellers == other.numberOfTellers;
        if (areLoanOfficersEqual && areTellersEqual) {
            return true;
        } else {
            return false;
        }
    }

    public void hireMembers(int numberToHire, boolean isLoanOfficer) {
        if (isLoanOfficer) {
            this.numberOfLoanOfficers += numberToHire;
        } else {
            this.numberOfTellers += numberToHire;
        }
    }
}
