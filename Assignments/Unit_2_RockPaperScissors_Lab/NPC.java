public class NPC {
    private String choice;

    // constructor
    public NPC() {

        this.choice = RPSGame.generateRandomChoice();
    }

    // getters and setters
    public String getChoice() {

        return choice;
    }

    public void setChoice(String choice) { // need static methods

        if (choice != null) {
            choice = choice.toLowerCase();
        }
        if (RPSGame.validateChoice(choice) == false) {
            choice = RPSGame.generateRandomChoice();
        } 
        this.choice = choice;
    }

    // methods
    public String toString() {
        
        return "Opponent chose " + this.choice + ".";
    }
}
