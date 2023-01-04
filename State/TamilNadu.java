/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State;

import FuelPackage.Fuel;

public class TamilNadu extends Fuel{
    
    public void acceptDetails() 
    {
        accept();
        state = "TAMIL NADU";
        switch (fuelType) {
            case "PETROL":
                fuelCost = 97.46;
                break;
            case "DIESEL":
                fuelCost = 96.08;
                break;
            case "KEROSENE":
                fuelCost = 25.7;
                break;
            case "LPG":
                fuelCost = 70.33;
                break;
        }
    }
    
}
