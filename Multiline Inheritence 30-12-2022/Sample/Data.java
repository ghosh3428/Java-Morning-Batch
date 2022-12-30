
package Sample;

import java.util.Scanner;


public class Data 
{
    protected double firstNumber;
    protected double secondNumber;
    protected Scanner sc = new Scanner(System.in);

    protected void acceptTwo()
    {
        System.out.println("Enter First Number : ");
        firstNumber = sc.nextDouble();

        System.out.println("Enter second Number : ");
        secondNumber = sc.nextDouble();
    }
    
     protected void acceptOne() {
        System.out.println("Enter a number : ");
        firstNumber = sc.nextDouble();
    }
    
    
}
