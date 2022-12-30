
package Sample;

import java.util.Scanner;

public class Calculator extends Data
{
    protected void add()
    {
        System.out.println("Result of Addition is : " + (firstNumber + secondNumber));
    }
    protected void sub()
    {
        System.out.println("Result of Substraction is : " + (firstNumber - secondNumber));
    }
    protected void mul()
    {
        System.out.println("Result of Multiplication is : " + (firstNumber * secondNumber));
    }
    protected void div()
    {
        while(secondNumber  < 1)
        {
            System.out.println("!!!Division not possible as second number is ZERO!!!");
            System.out.println("Enter a valid Data : ");
            secondNumber = sc.nextDouble();
        }
        System.out.println("Result of Division is : " + (firstNumber / secondNumber));
    }

    
}
