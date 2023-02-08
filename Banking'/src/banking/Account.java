
package banking;

import java.util.Scanner;


public abstract class Account 
{
    
    String acc_name;
    String acc_no;
    double balance;
    Scanner sc;
    
    public Account()
    {
        acc_name = "New Customer";
        acc_no ="NEW000000000123";
        balance = 0.0;
        sc = new Scanner(System.in);
    }
    
    abstract void acceptDetails();
}
