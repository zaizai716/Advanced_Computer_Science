public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        try {
            bank.withdraw(10000);
        }
        catch(Exception e) {
            System.out.println(e);
        }
        bank.withdraw(-100);

        try {
            bank.withdraw(-10);
        } catch (Exception e) {
            // TODO: handle exception
        }

    }

}
