package State;

import FuelPackage.Fuel;

public class Karnataka extends Fuel {

    public void acceptDetails() 
    {
        accept();
        state = "KARNATAKA";
        switch (fuelType) {
            case "PETROL":
                fuelCost = 99.61;
                break;
            case "DIESEL":
                fuelCost = 98.61;
                break;
            case "KEROSENE":
                fuelCost = 27.6;
                break;
            case "LPG":
                fuelCost = 72.08;
                break;
        }
    }

}
