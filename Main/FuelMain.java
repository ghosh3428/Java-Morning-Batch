
package Main;

import State.Karnataka;
import State.Kerala;
import State.TamilNadu;
import java.util.Scanner;


public class FuelMain 
{ 
    public static void main(String[] args) 
    {
       int ch = 1;
        System.out.println("---------------STATE MENU-------------");
        System.out.println("1. Karnataka");
        System.out.println("2. Tamil Nadu");
        System.out.println("3. Kerala");
        System.out.println("--------------------------------------");
        
        Scanner sc = new Scanner(System.in);
        ch = sc.nextInt();
        
        if(ch == 1)
        {
            Karnataka obj = new Karnataka();
            obj.acceptDetails();
            obj.display();
        }
        else if(ch == 2)
        {
            TamilNadu obj = new TamilNadu();
            obj.acceptDetails();
            obj.display();
        }
        else if(ch == 3)
        {
            Kerala obj = new Kerala();
            obj.acceptDetails();
            obj.display();
        }
        else
        {
            System.out.println("Invalid Input");
        }
        
        
    }
    
}
