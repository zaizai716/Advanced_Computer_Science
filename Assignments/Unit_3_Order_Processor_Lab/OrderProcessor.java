public class OrderProcessor {

    public static OrderSummary processCustomerOrder(Item[] items, double taxRate) {
        double subtotal = 0;
        String[] expensiveItemsTemp = new String[items.length];
        int premiumCount = 0;

        for (Item item : items) {
            String name = item.getName();
            double price = item.getPrice();
            int quantity = item.getQuantity();

            // Calculate item total
            subtotal += price * quantity;

            // Check if expensive
            if (isExpensive(price)) {
                expensiveItemsTemp[premiumCount] = name;
                premiumCount++;
                System.out.println(name + " is a premium item at $" + price);
            } else {
                System.out.println(name + " is a regular item at $" + price);
            } 
        }

        // Trim premium items to exact size
        String[] expensiveItems = trimPremiumItems(expensiveItemsTemp, premiumCount);

        // Calculate tax and total
        double tax = calculateTax(subtotal, taxRate);
        double total = subtotal + tax;

        System.out.println("Subtotal: $" + subtotal);
        System.out.println("Tax: $" + tax);
        System.out.println("Total: $" + total);
        System.out.println("Number of premium items: " + premiumCount);

        return new OrderSummary(total, subtotal, tax, expensiveItems);
    }

    // method to trim premium items automatically, decomposed
    public static String[] trimPremiumItems(String[] expensiveItemsTemp, int premiumCount) {
        String[] expensiveItems = new String[premiumCount];
        for (int i = 0; i < premiumCount; i++) {
            expensiveItems[i] = expensiveItemsTemp[i];
        }

        return expensiveItems;
    }

    // calculates if there is tax or on the customer's order
    public static double calculateTax(double subtotal, double taxRate) {
        return subtotal * taxRate;
    
    }

    // helper method to determine if an item is considered expensive or not
    public static boolean isExpensive(double price) {
        return price > 50.0;
    }


}