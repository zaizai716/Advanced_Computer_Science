
    public class Cat { // 1. Public should be lowercase (public), should be Cat, not Cats for the name as well
        private String name;
        private String breed;
        private boolean isHungry;
        private int livesRemaining;
        
        // 2-Parameter Constructor
        public Cat(String name, String breed) { // 2. should be uppercase
            this.name = name; // 3. need to use .this in order to reference class's attributes
            this.breed = breed; // 4. same thing as before, also breed is never passed in as an argument in this method anyways
            this.isHungry = true; // 5. should be true, not just yes
            livesRemaining = 9;
        }
    
        public String getName() { // 6. need to return String since name is a string, not just void
            return name; 
        }

        public String getBreed() {
            return breed;
        }

        public void setName(String name) {
            this.name = name;
        }
    
        public boolean getIsHungry(){ // 7. again, need to return boolean value, not void
            // 8. the naming convention is also wrong, should be getIsHungry
            return isHungry;
        }
    
        public void feed() { // 9. set it to void, since you're not returning anything, just changing a value
            this.isHungry = false;
        }
    
        public boolean equals(Cat other) {
            return this.name.equals(other.name) && this.breed.equals(other.breed) // 10. should be getters for every field, adding above
                && this.livesRemaining == other.livesRemaining; // 11. = is assignment, it should be ==
        }
    
        public String toString() {
            return name + " is of breed " + breed + " and has " + livesRemaining + " lives remaining.";
            // 12. needs a return statement, not a print statement
        }
    }


