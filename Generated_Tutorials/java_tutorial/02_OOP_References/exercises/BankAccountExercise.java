// TODO: Create a BankAccount class

class BankAccount {
    String owner; // properties
    double balance;

    // constructor
    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
        System.out.println("Account created for " + owner + " \nBalance: " + balance);
    }

    // deposit method
    void deposit(double amount) {
        this.balance += amount;
        System.out.println("Deposited: " + amount);
    }

    // withdraw method (check for sufficient funds)
    void withdraw(double amount) {
        if (this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }
}

public class BankAccountExercise {
    public static void main(String[] args) {
        // TODO: Uncomment after implementing the class
        
        BankAccount myAcc = new BankAccount("Alice", 1000);
        myAcc.deposit(500);
        myAcc.withdraw(200);
        
        System.out.println(myAcc.balance); // Should be 1300
    }
}
