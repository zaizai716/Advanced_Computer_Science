public class MatrixFunTester {
    public static void main(String[] args) {
        // test all three constructors
        MatrixFun matrix = new MatrixFun(3, 5);
        System.out.println(matrix);

        int[][] starterMatrix = new int[5][3];
        MatrixFun matrix2 = new MatrixFun(starterMatrix);
        System.out.println(matrix2);

        MatrixFun matrix3 = new MatrixFun();
        System.out.println(matrix3);

        // test equals(MatrixFun) method with two MatrixFun objects
        System.out.println(matrix.equals(matrix2));

        // test equals with an int array
        int[][] mat2 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(matrix.equals(mat2));

        // test replace all method, if all numbers will be replaced
        System.out.println(matrix);
        matrix.replaceAll(2, 0);
        System.out.println(matrix);

        // test swap row method
        matrix.swapRow(0, 2);
        System.out.println(matrix);
    }
   
}
