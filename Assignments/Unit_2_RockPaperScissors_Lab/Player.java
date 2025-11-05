public class Player {

    // instance variables
    private String name;
    private String choice;

    // getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getChoice() {
        return choice;
    }
    public void setChoice(String choice) {
        
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
        return this.name + " chose " + this.choice + ".";
    }

}
