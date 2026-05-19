public class SkyView {
    // instance variable
    private double[][] view;

    // constructor
    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        // Precondition check: dimensions should be able to hold all values
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Number of rows and columns must be positive");
        }
        if (scanned == null) {
            throw new IllegalArgumentException("Scanned array cannot be null");
        }
        if (scanned.length != numberOfRows * numberOfCols) {
            throw new IllegalArgumentException(
                "Scanned array length must equal numberOfRows * numberOfCols");
        }
        
        view = new double[numberOfRows][numberOfCols];
        int index = 0;
        for (int r = 0; r < numberOfRows; r++) {
            if (r % 2 == 0) {
                for (int c = 0; c < numberOfCols; c++) {
                    view[r][c] = scanned[index];
                    index++;
                }
            } else {
                for (int c = numberOfCols - 1; c >= 0; c--) {
                    view[r][c] = scanned[index];
                    index++;
                }
            }
        }
    }

    // getters and setters
    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    // methods
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int r = 0; r < view.length; r++) {
            for (int c = 0; c < view[r].length; c++) {
                result.append(view[r][c]);
                if (c < view[r].length - 1) {
                    result.append(" ");
                } else {
                    result.append(" ");
                }
            }
            if (r < view.length - 1) {
                result.append("\n");
            }
        }
        return result.toString();
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }
        if (this.view.length != other.view.length) {
            return false;
        }
        for (int r = 0; r < view.length; r++) {
            if (this.view[r].length != other.view[r].length) {
                return false;
            }
            for (int c = 0; c < view[r].length; c++) {
                if (this.view[r][c] != other.view[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        // Precondition checks
        if (startRow < 0 || endRow >= view.length || startRow > endRow) {
            throw new IllegalArgumentException(
                "Invalid row indices: 0 <= startRow <= endRow < view.length");
        }
        if (startCol < 0 || endCol >= view[0].length || startCol > endCol) {
            throw new IllegalArgumentException(
                "Invalid column indices: 0 <= startCol <= endCol < view[0].length");
        }
        
        double sum = 0.0;
        int count = 0;
        for (int r = startRow; r <= endRow; r++) {
            for (int c = startCol; c <= endCol; c++) {
                sum += view[r][c];
                count++;
            }
        }
        return sum / count;
    }
}
