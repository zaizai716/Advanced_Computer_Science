public class Tester {
    
    public static void main(String[] args) {
        // PEMDAS

        // 1. Parenthesis, Brackets, Member Access (Methods)
        String demo = "hello";
        System.out.println(5 * demo.length());

        // 2. Exponents
        Math.pow(2, 4);

        // 3. Multiplication and Division
        System.out.println(5 * 4 + 5 / 6 + 7 % 1);

        // 4. Addition and Subtraction
        System.out.println(5 + 6 - 9);
        
        // 5. Relational Operators
        System.out.println(6 < 7);

        // 6 Comparison Operators
        System.out.println(8 == 9);
        // ==, !=

        // 7. Boolean Operators
        // &&, ||

        System.out.println(3 + Integer.parseInt("123") * 9 / 8 + 7 >= 5);
        // Challenge: give me the 7 operations in order of operations
        // 1. Parse int
        // 2. 3 + 123 = 126
        // 3. 126 * 9
        // 4. 1134 / 8
        // 5. 141 + 7
        // 6. 148 >= 5
        // 7. True
    }

}


