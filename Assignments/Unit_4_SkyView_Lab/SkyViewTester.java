public class SkyViewTester {
    public static void main(String[] args) {
        // Test 1: Constructor with example from lab (3 rows, 2 cols)
        System.out.println("=== Test 1: Constructor ===");
        double[] scanned1 = {0.3, 0.7, 0.8, 0.4, 1.2, 1.1};
        SkyView sky1 = new SkyView(3, 2, scanned1);
        System.out.println("SkyView(3, 2, scanned):");
        System.out.println(sky1);
        System.out.println();
        
        // Test 2: toString() method
        System.out.println("=== Test 2: toString() ===");
        double[] scanned2 = {0.0, 1.1, 2.2, 3.3, 4.4, 5.5, 6.6, 7.7, 8.8, 9.9, 1.0, 1.1};
        SkyView sky2 = new SkyView(3, 4, scanned2);
        System.out.println("Using println(mat):");
        System.out.println(sky2);
        System.out.println("Using println(mat.toString()):");
        System.out.println(sky2.toString());
        System.out.println();
        
        // Test 3: Different row lengths
        System.out.println("=== Test 3: Different dimensions ===");
        double[] scanned3 = {0.0, 1.1, 2.2, 4.4, 5.5, 6.6, 8.8, 9.9, 1.0};
        SkyView sky3 = new SkyView(3, 3, scanned3);
        System.out.println(sky3);
        System.out.println();
        
        // Test 4: equals() method
        System.out.println("=== Test 4: equals() ===");
        double[] scanned4 = {0.3, 0.7, 0.8, 0.4, 1.2, 1.1};
        SkyView sky4 = new SkyView(3, 2, scanned4);
        System.out.println("sky1.equals(sky4): " + sky1.equals(sky4));
        System.out.println("sky1.equals(sky2): " + sky1.equals(sky2));
        System.out.println("sky1.equals(null): " + sky1.equals(null));
        System.out.println();
        
        // Test 5: getAverage() method
        System.out.println("=== Test 5: getAverage() ===");
        // Example from lab: getAverage(1, 2, 0, 1) should return 0.8
        double[] scanned5 = {0.3, 0.7, 0.8, 0.4, 1.2, 1.1};
        SkyView sky5 = new SkyView(3, 2, scanned5);
        System.out.println("Matrix:");
        System.out.println(sky5);
        System.out.println("getAverage(1, 2, 0, 1): " + sky5.getAverage(1, 2, 0, 1));
        System.out.println("Expected: 0.8");
        System.out.println();
        
        // Test 6: getAverage() with different ranges
        System.out.println("=== Test 6: getAverage() with different ranges ===");
        double[] scanned6 = {1.0, 2.0, 3.0, 4.0, 5.0, 6.0, 7.0, 8.0, 9.0};
        SkyView sky6 = new SkyView(3, 3, scanned6);
        System.out.println("Matrix:");
        System.out.println(sky6);
        System.out.println("getAverage(0, 0, 0, 0): " + sky6.getAverage(0, 0, 0, 0));
        System.out.println("getAverage(0, 2, 0, 2): " + sky6.getAverage(0, 2, 0, 2));
        System.out.println("getAverage(1, 1, 1, 1): " + sky6.getAverage(1, 1, 1, 1));
        System.out.println();
        
        // Test 7: Edge cases and exception handling
        System.out.println("=== Test 7: Exception handling ===");
        try {
            new SkyView(0, 2, scanned1);
            System.out.println("ERROR: Should have thrown exception for 0 rows");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Correctly caught exception for 0 rows: " + e.getMessage());
        }
        
        try {
            new SkyView(3, 2, new double[]{1.0, 2.0}); // Wrong length
            System.out.println("ERROR: Should have thrown exception for wrong array length");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Correctly caught exception for wrong array length: "
                + e.getMessage());
        }
        
        try {
            sky1.getAverage(-1, 2, 0, 1);
            System.out.println("ERROR: Should have thrown exception for invalid startRow");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Correctly caught exception for invalid startRow: "
                + e.getMessage());
        }
        
        try {
            sky1.getAverage(1, 5, 0, 1); // endRow out of bounds
            System.out.println("ERROR: Should have thrown exception for invalid endRow");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Correctly caught exception for invalid endRow: "
                + e.getMessage());
        }
        
        try {
            sky1.getAverage(1, 2, -1, 1);
            System.out.println("ERROR: Should have thrown exception for invalid startCol");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Correctly caught exception for invalid startCol: "
                + e.getMessage());
        }
        
        try {
            sky1.getAverage(1, 2, 0, 5); // endCol out of bounds
            System.out.println("ERROR: Should have thrown exception for invalid endCol");
        } catch (IllegalArgumentException e) {
            System.out.println("PASS: Correctly caught exception for invalid endCol: "
                + e.getMessage());
        }
        
        System.out.println("\n=== All tests completed ===");
    }
    
}
