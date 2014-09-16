

/**
 * The Car class tracks the fuel remaining in the car as it is driven
 * based on the fuel efficieny.
 * 
 * @author yqiao
 * @version 12 September 2014
 */
public class Car
{
    /** the fuel efficieny of this car measured in miles per gallon */
    private double fuelEfficiency;
    
    /** the number of gallons of fuel left in this car's tank */
    private double fuelInTank;

    /**
     * Constructor for a car of the specified fuel efficieny
     */
    public Car(double efficiency)
    {
        this.fuelEfficiency = efficiency;
        this.fuelInTank = 0;
    }

    /**
     * Adds the specified number of gallons of fuel to this car's tank
     *
     * @pre        Specified number of gallons doesn't exceed this car's tank's capacity
     * @param    gallons    Number of gallons of fuel to add to this car's tank
     */
    public void addGas(double gallons)
    {
        this.fuelInTank = this.fuelInTank + gallons;
    }
    
    /**
     * Updates the fuel in this car's tank based on the speficied number of miles and the car's fuel efficiency
     *
     * @pre     The specified number of miles doesn't consume more than the fuel in this car's tank
     * @param   miles   Number of miles this car has driven
     */
    public void drive(double miles)
    {
        double gallonsBurned = miles / this.fuelEfficiency;
        this.fuelInTank = this.fuelInTank - gallonsBurned;
    }
    
    /**
     * Returns number of gallons of fuel left in this car's tank
     * 
     * @return  the number of gallons of fuel left in this car's tank
     */
    public double getGasInTank()
    {
        return this.fuelInTank;
    }


}
