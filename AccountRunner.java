class Account {

    private double balance;


    public Account() {
        balance = 0;
    }

    public Account(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient balance.");
        } else {
            balance -= amount;
        }
    }
}

public class AccountRunner {
    public static void main(String[] args) {
        Account acc1 = new Account(5000);


        Account acc2 = new Account(acc1.getBalance());

        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());

        acc1.deposit(1500);
        acc2.withdraw(2000);

        System.out.println("After transactions:");
        System.out.println("Account 1 balance: " + acc1.getBalance());
        System.out.println("Account 2 balance: " + acc2.getBalance());
    }
}