public class BobaShopTester {
    public static void main(String[] args) {
        System.out.println("=== Testing BobaShopMember ===");
        testBobaShopMember();
        
        System.out.println("\nAll tests complete!");
    }
    
    public static void testBobaShopMember() {

        boolean[] credits = new boolean[10];
        credits[0] = true;
        credits[1] = true;
        credits[2] = true;
        BobaShopMember member = new BobaShopMember("Alice", credits);
        
        System.out.println("getName(): " + member.getName());
        System.out.println("countLoyaltyCredits(): " + member.countLoyaltyCredits());
        System.out.println("determineMembershipStatus(): " + member.determineMembershipStatus());
        
        member.grantLoyaltyCredit();
        System.out.println("After grantLoyaltyCredit(): " + member.countLoyaltyCredits());
        
        boolean[] plusCredits = {true, true};
        boolean[] goldCredits = {true, true, true, true, true, true};
        System.out.println("Plus Member: " 
            + new BobaShopMember("Bob", plusCredits).determineMembershipStatus());
        System.out.println("Gold Member: " 
            + new BobaShopMember("Charlie", goldCredits).determineMembershipStatus());
        
        System.out.println("toString(): " + member.toString());
        
        boolean[] sameCredits = {true, true, true, true};
        BobaShopMember member2 = new BobaShopMember("Alice", sameCredits);
        System.out.println("equals() same: " + member.equals(member2));
        System.out.println("equals() null: " + member.equals(null));
    }
    
   
}
