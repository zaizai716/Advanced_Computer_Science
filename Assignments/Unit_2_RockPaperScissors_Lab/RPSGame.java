import java.util.Scanner;

public class RPSGame {

    // instance variables
    private Player player;
    private NPC opponent;

    // getters and setters
    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public NPC getOpponent() {
        return opponent;
    }

    public void setOpponent(NPC opponent) {
        this.opponent = opponent;
    }

    // constructor
    public RPSGame(Player player, NPC opponent) {
        this.player = player;
        this.opponent = opponent;
    }

    // methods
    public void start() {

        Scanner object = new Scanner(System.in);
        System.out.println("Enter name");
        String name = object.nextLine();
        System.out.println("Enter choice");
        String choice = object.nextLine();

        int attempts = 3;
        while (attempts != 0) {

            if (validateChoice(choice) == false) {
                System.out.println("Try again. Choice is invalid.");
                attempts--;
                if (attempts > 0) {
                    choice = object.nextLine();
                }
            } else {
                break;
            }
        }

        if (attempts == 0) {
            choice = generateRandomChoice();
            System.out.println(choice + " has been chosen for you.");
        }

        setPlayerValues(name, choice);
    }

    public void setPlayerValues(String name, String choice) {
        this.player.setName(name);
        this.player.setChoice(choice);
    }

    public boolean didPlayerWin() {
        String player1 = player.getChoice();
        String npc = opponent.getChoice();

        if (player1.equals(npc)) {
            return false;
        }

        if (player1.equals("rock") && npc.equals("scissors")
            || player1.equals("paper") && npc.equals("rock")
            || player1.equals("scissors") && npc.equals("paper")) {
                return true;
        }
        return false;
    }

    public String toString() {

        if (didPlayerWin()) {
            return player.getName() 
                + " won!\n" + "Congratulations!";
        } else {
            return "Opponent won!\n" 
            + "Better luck next time!";
        }
    }

    public String displayResults() {
        return "== GAME RESULTS ==\n"
            + player.getName() + " chose " 
            + player.getChoice() + ".\n"
            + "Opponent chose " + opponent.getChoice()
            + ".\n" + toString();
    }

    // static methods
    public static String generateRandomChoice() {

        int choice = (int)(Math.random() * 3) + 1;
        if (choice == 1) {
            return "rock";
        } else if (choice == 2) {
            return "paper";
        } else {
            return "scissors";
        }

    }

    public static boolean validateChoice(String choice) {
        if (choice == null) {
            return false;
        }
        return (choice.equals("rock") || 
                choice.equals("paper") || choice.equals("scissors"));
    }

}