import java.util.ArrayList;

public class Shelter {
    // instance variables
    private Dog[][] kennels;

    // constructors
    public Shelter(int rows, int cols) {
        if (rows <= 0 || cols <= 0) {
            throw new IllegalArgumentException("Parameters can't be less than or equal to zero.");
        }
        kennels = new Dog[rows][cols];
    }

    /* initializes kennels as a 3x3 2D array */
    public Shelter() {
        kennels = new Dog[3][3];
    }

    // getters and setters
    public Dog[][] getKennels() {
        return kennels;
    }

    public void setKennels(Dog[][] kennels) {
        this.kennels = kennels;
    }

    // methods

    /*
     * prints out the 2D array 'kennels', displaying the dog's info if the kennel is occupied, or
     * 'empty' if the kennel is empty
     */
    public void displayStatus() {
        for (Dog[] row : kennels) {
            for (Dog animal : row) {
                if (animal != null) {
                    System.out.print(animal);
                } else {
                    System.out.print("[Empty]");
                }
            }
            System.out.println();
        }
    }

    // method places dog into first available kennel,
    //  scanning from left to right and top to bottom, if no empty kennels
    // are available, it prints: "No empty kennels."
    public void add(Dog animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Parameter can't be null.");
        }
        for (int i = 0; i < kennels.length; i++) {
            for (int j = 0; j < kennels[i].length; j++) {
                if (kennels[i][j] == null) {
                    kennels[i][j] = animal;
                    return;
                }
            }
        }
        System.out.println("No empty kennels.");
    }


    // method places given dog at specified location in kennels, if a dog already
    // occupies the kennel, place the given dog in another available location.
    // Do not evict existing dog from kennel
    // method should not contain any loops
    public void add(Dog animal, int row, int col) {
        if (animal == null) {
            throw new IllegalArgumentException("Arguments can't be null.");
        }
        if (row < 0 || row >= kennels.length || col < 0 || col >= kennels[0].length) {
            throw new IllegalArgumentException("Indices need to be valid.");
        }

        if (kennels[row][col] != null) {
            add(animal);
        } else {
            kennels[row][col] = animal;
        }
    }

    // places each Dog from given arraylist into
    // available kennel, if kennel is occupied, dog is placed
    // in next available space
    // when no kennels available, message "No empty kennels." is printed
    // for each dog that can't be replaced
    // must not contain more than 6 lines of code, and must be readable
    public void add(ArrayList<Dog> animals) {
        if (animals == null) {
            throw new IllegalArgumentException("Parameter can't be null.");
        }
        for (Dog animal : animals) {
            add(animal);
        }
    }

    // method returns dog located at specific position in kennels
    // sets kennel space to null to indicate Dog has been adopted
    // into their new home
    // if no dog at specified location, throw exception
    // row and column must be valid indexes
    public Dog adopt(int row, int col) {
        if (row < 0 || row >= kennels.length || col < 0 || col >= kennels[0].length) {
            throw new IllegalArgumentException("Row and Column indices must be valid.");
        }
        if (kennels[row][col] == null) {
            throw new IllegalArgumentException("No dog to adopt at given index.");
        }
        Dog animal = kennels[row][col];
        kennels[row][col] = null;
        return animal;
    }

    // returns arraylist of dog objects from kennel that match given name
    // parameter can't be null
    public ArrayList<Dog> search(String name) {
        if (name == null) {
            throw new IllegalArgumentException("Parameter can't be null.");
        }
    
        ArrayList<Dog> newDogs = new ArrayList<Dog>();
        for (Dog[] x : kennels) {
            for (Dog dog : x) {
                if (dog != null && dog.getName().equals(name)) {
                    newDogs.add(dog);
                }
            }
        }
        return newDogs;
    }

    // method returns arraylist of dog objects
    // from kennel that match specified age
    // parameter can't be negative
    public ArrayList<Dog> search(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age can't be negative.");
        }

        ArrayList<Dog> dogs = new ArrayList<Dog>();

        for (Dog[] row : kennels) {
            for (Dog dog : row) {
                if (dog != null && dog.getAge() == age) {
                    dogs.add(dog);
                }
            }
        }
        return dogs;
    }
}