
package banking;


public class Bank extends Account implements Transactional , Displayable
{
    double amt;
    
    public void withdraw()
    {
        System.out.println("Enter the amount you want to withdraw : ");
        amt = sc.nextDouble();
        
        if(amt > balance)
                System.out.println("Insufficient Balance");
        else
            balance -= amt;
    }
    
    public void viewBalance()
    {
        System.out.println("Current Balace : " + balance);
    }
    
    public void deposit()
    {
        System.out.println("Enter the amount you want to deposit : ");
        amt = sc.nextDouble();
        
        balance += amt;
    }
    
    public void displayDetails()
    {
        System.out.println("Customer Name  : " + acc_name);
        System.out.println("Account Number : " + acc_no);
        System.out.println("Balance        : " +  balance);
    }
    
    void acceptDetails()
    {
        System.out.println("Enter Customer Name");
        acc_name = sc.next();
        
        System.out.println("Enter Account Number : ");
        acc_no = sc.next();
        
        System.out.println("Enter Balance : ");
        balance = sc.nextDouble();
    }
}

