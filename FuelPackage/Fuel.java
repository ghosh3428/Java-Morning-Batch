
package FuelPackage;

import java.util.Scanner;


public class Fuel 
{
    protected String name , fuelType , state;
    protected double fuelCost , billAmount;
    protected int unitConsumed;
    protected Scanner sc = new Scanner(System.in);
    
    protected void accept()
    {
        System.out.println("Enter Customer Name : ");
        name = sc.nextLine();
        
        System.out.println("Enter Fuel Type(Petrol/Diesel/Kerosene/LPG) : ");
        fuelType = sc.nextLine().toUpperCase();
        
        System.out.println("Enter Unit Consumed : ");
        unitConsumed = sc.nextInt();
        
    }
    
    private void calculateBill()
    {
        billAmount = unitConsumed * fuelCost;
    }
    
    public void display()
    {
        calculateBill();
        System.out.println("---------------------FUEL BILL DETAILS-----------------");
        System.out.println("Customer Name           : " + name);
        System.out.println("State                   : " + state);
        System.out.println("Fuel Type               : " + fuelType);
        System.out.println("Cost Per Unit           : Rs " + fuelCost);
        System.out.println("Number of Unit Consumed : " + unitConsumed);
        System.out.println("Total Bill Amount       : Rs " + billAmount);
        System.out.println("-------------------------------------------------------");
    }   
}
