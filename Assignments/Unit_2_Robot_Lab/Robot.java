public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    // constructor
    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        this.hallway = hallwayToClean;
        this.position = startingPosition;
        this.isFacingRight = true;
    }
    
    // getters and setters
    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        this.hallway = hallway;
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        this.position = position;
    }


    public boolean isFacingRight() {
        return isFacingRight;
    }


    public void setFacingRight(boolean isFacingRight) {
        this.isFacingRight = isFacingRight;
    }


    /*
     * Determines if the robot is blocked by a wall (the end of an array)
     * 
     * @return true if the robot is blocked by a wall, false otherwise
     */
    public boolean isRobotBlockedByWall() {
        // to-do: implement this method
        int[] hallway = getHallway();
        int position = getPosition();

        int hallwayLength = hallway.length;

        return position == (hallwayLength - 1);
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        int[] hallway = getHallway();
        int position = getPosition();

        int tile = hallway[position];

        if (tile > 0) {
            if (tile == 1 && !isRobotBlockedByWall()) {
                hallway[position] -= 1;
                position += 1;
            } else if (tile == 1 && isRobotBlockedByWall()) {
                hallway[position] -= 1;
                position -= 1;
            } else if (tile > 1) {
                hallway[position] -= 1;
            }
            
        }

    }

    /**
     * This method displays the current state of the robot and the hallway. It then
     * calls the move() method and counts the number of moves it takes to clear the
     * hallway. The method should display the current state of the robot after each
     * move.
     * 
     * @return the number of moves made
     */

    public int clearHall() {
        int count = 0;
        // to-do: implement this method
        displayState();
        while (!hallIsClear()) {
            move();
            count++;
            displayState();
        }
        return count;
    }

    /**
     * This method determines if the hallway contains any items.
     * 
     * @return a boolean value indicating if the hallway contains any items
     */
    public boolean hallIsClear() {
        // to-do: implement this method
        int[] hallway = getHallway();

        int count = 0;
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] == 0) {
                count++;
            }
        }

        if (count == hallway.length) {
            return true;
        } else {
            return false;
        }

    }

    /*
     * Displays the current state of the robot and the hallway.
     */
    public void displayState() {
        // to-do: implement this method
        int[] hallway = getHallway();
        int position = getPosition();
        boolean isFacingRight = isFacingRight();

        for (int i = 0; i < hallway.length; i++) {
            System.out.print(hallway[i] + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < hallway.length; i++) {
            if (i == position && isFacingRight) {
                System.out.println(">");
            } else if (i == position && !isFacingRight) {
                System.out.println("<");
            } else {
                System.out.print(" ");
            }
        }


    }
}
