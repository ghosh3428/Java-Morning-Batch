
package State;

import FuelPackage.Fuel;


public class Kerala extends Fuel 
{
     public void acceptDetails() 
    {
        accept();
        state = "KERALA";
        switch (fuelType) {
            case "PETROL":
                fuelCost = 98.35;
                break;
            case "DIESEL":
                fuelCost = 97.37;
                break;
            case "KEROSENE":
                fuelCost = 26.4;
                break;
            case "LPG":
                fuelCost = 71.27;
                break;
        }
    }
}
