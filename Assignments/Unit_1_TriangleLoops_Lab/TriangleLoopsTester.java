public class TriangleLoopsTester {
    public static void main(String[] args) {
        System.out.println("=== TriangleLoops Tester ===");
        System.out.println();
        
        // Test createLetterTriangleUp method
        testCreateLetterTriangleUp();
        
        // Test createLetterTriangleDown method  
        testCreateLetterTriangleDown();
        
        // Test createNumbersTriangle method
        testCreateNumbersTriangle();
        
        // Test createAlphabetTriangle method
        testCreateAlphabetTriangle();
    }
    
    /**
     * Tests the createLetterTriangleUp method with multiple parameters and edge cases
     */
    public static void testCreateLetterTriangleUp() {
        System.out.println("--- Testing createLetterTriangleUp ---");
        
        // Test case 1: Normal case
        System.out.println("Test 1: createLetterTriangleUp(3, 'A')");
        System.out.println("Expected: A triangle with 3 rows of A's");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleUp(3, 'A'));
        System.out.println();
        
        // Test case 2: Different letter and size
        System.out.println("Test 2: createLetterTriangleUp(5, 'B')");
        System.out.println("Expected: A triangle with 5 rows of B's");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleUp(5, 'B'));
        System.out.println();
        
        // Test case 3: Edge case - negative number
        System.out.println("Test 3: createLetterTriangleUp(-3, 'B')");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleUp(-3, 'B'));
        System.out.println();
        
        // Test case 4: Edge case - zero
        System.out.println("Test 4: createLetterTriangleUp(0, 'C')");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleUp(0, 'C'));
        System.out.println();
        
        // Test case 5: Large number
        System.out.println("Test 5: createLetterTriangleUp(4, 'X')");
        System.out.println("Expected: A triangle with 4 rows of X's");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleUp(4, 'X'));
        System.out.println();
    }
    
    /**
     * Tests the createLetterTriangleDown method with multiple parameters and edge cases
     */
    public static void testCreateLetterTriangleDown() {
        System.out.println("--- Testing createLetterTriangleDown ---");
        
        // Test case 1: Normal case
        System.out.println("Test 1: createLetterTriangleDown(3, 'A')");
        System.out.println("Expected: A downward triangle with 3 rows of A's");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleDown(3, 'A'));
        System.out.println();
        
        // Test case 2: Different letter and size
        System.out.println("Test 2: createLetterTriangleDown(4, 'Z')");
        System.out.println("Expected: A downward triangle with 4 rows of Z's");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleDown(4, 'Z'));
        System.out.println();
        
        // Test case 3: Edge case - negative number
        System.out.println("Test 3: createLetterTriangleDown(-2, 'B')");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleDown(-2, 'B'));
        System.out.println();
        
        // Test case 4: Edge case - zero
        System.out.println("Test 4: createLetterTriangleDown(0, 'C')");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleDown(0, 'C'));
        System.out.println();
        
        // Test case 5: Large number
        System.out.println("Test 5: createLetterTriangleDown(5, 'Y')");
        System.out.println("Expected: A downward triangle with 5 rows of Y's");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createLetterTriangleDown(5, 'Y'));
        System.out.println();
    }
    
    /**
     * Tests the createNumbersTriangle method with multiple parameters and edge cases
     */
    public static void testCreateNumbersTriangle() {
        System.out.println("--- Testing createNumbersTriangle ---");
        
        // Test case 1: Normal case
        System.out.println("Test 1: createNumbersTriangle(3)");
        System.out.println("Expected: A triangle with numbers");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createNumbersTriangle(3));
        System.out.println();
        
        // Test case 2: Different size
        System.out.println("Test 2: createNumbersTriangle(5)");
        System.out.println("Expected: A triangle with numbers");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createNumbersTriangle(5));
        System.out.println();
        
        // Test case 3: Edge case - negative number
        System.out.println("Test 3: createNumbersTriangle(-3)");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createNumbersTriangle(-3));
        System.out.println();
        
        // Test case 4: Edge case - zero
        System.out.println("Test 4: createNumbersTriangle(0)");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createNumbersTriangle(0));
        System.out.println();
        
        // Test case 5: Large number
        System.out.println("Test 5: createNumbersTriangle(4)");
        System.out.println("Expected: A triangle with numbers");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createNumbersTriangle(4));
        System.out.println();
    }
    
    /**
     * Tests the createAlphabetTriangle method with multiple parameters and edge cases
     */
    public static void testCreateAlphabetTriangle() {
        System.out.println("--- Testing createAlphabetTriangle ---");
        
        // Test case 1: Normal case
        System.out.println("Test 1: createAlphabetTriangle(3)");
        System.out.println("Expected: An alphabet pyramid with 3 rows");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createAlphabetTriangle(3));
        System.out.println();
        
        // Test case 2: Different size
        System.out.println("Test 2: createAlphabetTriangle(5)");
        System.out.println("Expected: An alphabet pyramid with 5 rows");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createAlphabetTriangle(5));
        System.out.println();
        
        // Test case 3: Edge case - negative number
        System.out.println("Test 3: createAlphabetTriangle(-2)");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createAlphabetTriangle(-2));
        System.out.println();
        
        // Test case 4: Edge case - zero
        System.out.println("Test 4: createAlphabetTriangle(0)");
        System.out.println("Expected: No triangle (should handle gracefully)");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createAlphabetTriangle(0));
        System.out.println();
        
        // Test case 5: Edge case - number greater than 26
        System.out.println("Test 5: createAlphabetTriangle(30)");
        System.out.println("Expected: Should be limited to 26 rows");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createAlphabetTriangle(30));
        System.out.println();
        
        // Test case 6: Large valid number
        System.out.println("Test 6: createAlphabetTriangle(4)");
        System.out.println("Expected: An alphabet pyramid with 4 rows");
        System.out.println("Actual:");
        System.out.println(TriangleLoops.createAlphabetTriangle(4));
        System.out.println();
    }
}
