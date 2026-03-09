

public class BankAccount {

    private String owner;
    private double balance;

    public BankAccount(String owner , double balance){
        this.owner = owner;
        this.balance = balance;
    }
    public void deposit(double amount){
        if(amount > 0){
            balance += amount;
            System.out.println("Deposited: " +amount);

        }
    }
    public void withdraw(double amount){
        if(amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        }else {
            System.out.println("Insufficient funds!");
        }
        }

        public void showBalance(){
            System.out.println("Current Balance: " + balance);
        }
    }




