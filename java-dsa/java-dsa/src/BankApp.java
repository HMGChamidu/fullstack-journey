public class BankApp {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Chamidu", 5000);
        account.deposit(500);
        account.withdraw(200);
        account.showBalance();
    }
}