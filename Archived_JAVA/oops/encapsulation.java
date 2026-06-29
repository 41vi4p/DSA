import java.util.*;
class Bank
{
    private int bal=4000;
    public void deposit(int amt)
    {
        if(amt>0)
        {
            bal=bal+amt;
            System.out.println("deposited amount "+amt);
            System.out.println("total balance "+bal);
        }
    }
    public void withdraw(int amt)
    {
        if(amt>0 && amt<=bal)
        {
            bal=bal-amt;
            System.out.println("withdraw amount "+amt);
            System.out.println("total balance "+bal);
        }
        else
        {
            System.out.println("insufficient balance");
        }
    }
    // int getbal()
    // {
    //     return bal;
    // }
}
public class encapsulation {
    public static void main(String[] args) {
        Bank b1 =new Bank();
        b1.deposit(1000);
        // b1.getbal();
        b1.withdraw(1000);
    }
}
