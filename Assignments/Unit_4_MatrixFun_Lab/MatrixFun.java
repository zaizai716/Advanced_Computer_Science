public class MatrixFun {
    // instance variable(s)
    private int[][] matrix;

    // constructors
    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Rows and columns must be positive");
        }
        // create the matrix with the requested size
        matrix = new int[numberOfRows][numberOfCols];

        // fill with random numbers
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < numberOfCols; j++) {
                matrix[i][j] = generateRandomNumber();
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        if (starterMatrix == null) {
            throw new IllegalArgumentException("Starter matrix cannot be null");
        }
        matrix = starterMatrix;
    }

    public MatrixFun() {
        this(3, 3);
    }

    // getters and setters
    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    // methods
    public int generateRandomNumber() {
        // returns a random int from 0 to 8
        return (int) (Math.random() * 10);
    }

    public String toString() {
        String string = "";
        int[][] matrix = getMatrix();

        if (matrix.length == 0) {
            return "";
        }
        if (matrix[0].length == 0) {
            return "";
        }

        int numRows = matrix.length;
        int numColumns = matrix[0].length;

        string += "=".repeat((numColumns * 2) - 1);
        string += "\n";

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                string += matrix[i][j];
                string += " ";
            }
            string += "\n";
        }

        string += "=".repeat((numColumns * 2) - 1);
        string += "\n"; 

        return string;
    }

    public boolean equals(MatrixFun other) {
        // Compare the String representations of the two MatrixFun objects
        // as suggested by the assignment instructions.
        return this.toString().equals(other.toString());
    }

    public boolean equals(int[][] array) {
        if (array == null) {
            return false;
        }
        int[][] myMatrix = getMatrix();
        
        // Check if dimensions match
        if (myMatrix.length != array.length) {
            return false;
        }
        
        // Compare each value in the matrices
        for (int i = 0; i < myMatrix.length; i++) {
            if (myMatrix[i] == null || array[i] == null) {
                if (myMatrix[i] != array[i]) {
                    return false;
                }
                continue;
            }
            if (myMatrix[i].length != array[i].length) {
                return false;
            }
            for (int j = 0; j < myMatrix[i].length; j++) {
                if (myMatrix[i][j] != array[i][j]) {
                    return false;
                }
            }
        }
        
        return true;
    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA < 0 || rowA >= matrix.length || rowB < 0 || rowB >= matrix.length) {
            throw new IllegalArgumentException("Row indices must be valid");
        }
        
        // Swap the rows by swapping the array references
        int[] temp = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = temp;
    }

    


}
