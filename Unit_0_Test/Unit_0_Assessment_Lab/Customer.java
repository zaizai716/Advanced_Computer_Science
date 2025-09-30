public class Customer {
    private String name;
    private String address;
    private int rewardPoints;

    // constructor
    public Customer(String name, String address, int rewardPoints) {
        this.name = name;
        this.address = address;
        this.rewardPoints = rewardPoints;
    }

    // getters
    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getRewardPoints() {
        return rewardPoints;
    }

    // setters
    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRewardPoints(int rewardPoints) {
        this.rewardPoints = rewardPoints;
    }

    // methods
    public String toString() {
        return "Customer Name: " + name + ", Address: " + address + ", Reward Points: " + rewardPoints;
    }

    public boolean equals(Customer other) {
        return this.name.equals(other.name) && this.address.equals(other.address) & this.rewardPoints == other.rewardPoints;
    }

    public void boostPoints(double percentage) {
        this.rewardPoints += (int) (this.rewardPoints * (percentage / 100));
    }
}
