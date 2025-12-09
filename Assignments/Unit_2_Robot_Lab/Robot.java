public class Robot {
    // to-do: change file name, class, and constructor to Robot

    private int[] hallway;
    private int position; // the robot's current position
    private boolean isFacingRight; // true if the robot is facing right

    // constructor
    public Robot(int[] hallwayToClean, int startingPosition) {
        // to-do: implement constructor
        // Create a new array and convert negative values to 0
        this.hallway = new int[hallwayToClean.length];
        for (int i = 0; i < hallwayToClean.length; i++) {
            if (hallwayToClean[i] < 0) {
                this.hallway[i] = 0;
            } else {
                this.hallway[i] = hallwayToClean[i];
            }
        }

        if (hallwayToClean.length > 0) {
            if (startingPosition >= hallwayToClean.length) {
                startingPosition = hallwayToClean.length - 1;
            } else if (startingPosition < 0) {
                startingPosition = 0;
            }
        } else {
            startingPosition = 0;
        }
        this.position = startingPosition;
        this.isFacingRight = true;
    }
    
    // getters and setters
    public int[] getHallway() {
        return hallway;
    }


    public void setHallway(int[] hallway) {
        // Convert negative values to 0
        this.hallway = new int[hallway.length];
        for (int i = 0; i < hallway.length; i++) {
            if (hallway[i] < 0) {
                this.hallway[i] = 0;
            } else {
                this.hallway[i] = hallway[i];
            }
        }
    }


    public int getPosition() {
        return position;
    }


    public void setPosition(int position) {
        int[] hallwayToClean = getHallway();
        if (hallwayToClean.length > 0) {
            if (position >= hallwayToClean.length) {
                position = hallwayToClean.length - 1;
            } else if (position < 0) {
                position = 0;
            }
        } else {
            position = 0;
        }
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
        boolean isFacingRight = isFacingRight();

        int hallwayLength = hallway.length;

        if (isFacingRight && position == hallwayLength - 1) {
            return true;
        } else if (!isFacingRight && position == 0) {
            return true;
        }
        return false;
    }

    /*
     * Commands the robot to pick up an item, move forward or turn around
     */
    public void move() {
        // to-do: implement this method
        int[] hallway = getHallway();
        int position = getPosition();
        boolean isFacingRight = isFacingRight();

        int tile = hallway[position];

        if (tile > 0) {
            // Pick up an item
            hallway[position] -= 1;
            setHallway(hallway);
            
            // If tile becomes 0 after picking up, move forward
            if (hallway[position] == 0) {
                if (isFacingRight) {
                    if (!isRobotBlockedByWall()) {
                        setPosition(position + 1);
                    } else {
                        // Turn around
                        setFacingRight(false);
                    }
                } else {
                    if (!isRobotBlockedByWall()) {
                        setPosition(position - 1);
                    } else {
                        // Turn around
                        setFacingRight(true);
                    }
                }
            }
        } else {
            // No item, just move forward
            if (isFacingRight) {
                if (!isRobotBlockedByWall()) {
                    setPosition(position + 1);
                } else {
                    // Turn around
                    setFacingRight(false);
                }
            } else {
                if (!isRobotBlockedByWall()) {
                    setPosition(position - 1);
                } else {
                    // Turn around
                    setFacingRight(true);
                }
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
        System.out.println();
        for (int i = 0; i < hallway.length; i++) {
            if (i == position && isFacingRight) {
                System.out.print("> ");
            } else if (i == position && !isFacingRight) {
                System.out.print("< ");
            } else {
                System.out.print("  ");
            }
        }
        System.out.println();
    }
}
