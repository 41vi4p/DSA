class BankAccount {
    String owner;
    double balance;

    BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class BankAccountExercise {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount("Alice", 1000);
        myAcc.deposit(500);
        myAcc.withdraw(200);
        
        System.out.println("Final Balance: " + myAcc.balance);
    }
}
