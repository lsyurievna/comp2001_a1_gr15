/**
 * A class that maintains information on a bicycle.
 * This might form part of a larger application such
 * as a bicycle shop, for instance.
 *
 * @author Liudmila Strelnikova
 * @author Kailwsh Sugumar
 * @author (Insert name of group member 3)
 * 
 * @version 25.01.2021
 */
public class Bicycle
{
    // The fields.
    private String owner;
    private String model;
    private int sprocketNumber;
    private int chainringNumber;
    private int mileage;
    private boolean hydraulicBrakes;

    /**
     * Set the owner and model fields when this object
     * is constructed.
     */
    public Bicycle(String bikeOwner, String bikeModel, boolean hydraulicBrakesPresent)
    {
        owner = bikeOwner;
        model = bikeModel;
        sprocketNumber = 0;
        chainringNumber = 0;
        mileage = 0;
        hydraulicBrakes = hydraulicBrakesPresent;
    }

    /**
     * Gets the bike's model.
     * @return String model the a bike 
     */
    public String getModel()
    {
        return model;
    }
    
    /**
     * Gets the bike's owner.
     * @return String owner of the bike 
     */
    public String getOwner()
    {
        return owner;
    }
    
    /**
     * Gets the number of sprockets in the bike.
     * @return int number of sprockets in the bike 
     */
    public int getSprocketNumber()
    {
        return sprocketNumber;
    }
    
    /**
     * Gets the number of chainrings in the bike.
     * @return int number of chainrings in the bike 
     */
    public int getChainringNumber()
    {
        return chainringNumber;
    }
    
    /**
     * Gets presence of hydraulic brakes in the bike.
     * @return hydraulicBrakes presence of hydraulic brakes in the bike
     */
    public boolean getHydraulicBrakesPresence()
    {
        return  hydraulicBrakes;
    }
    
    /**
     * Gets the bike's mileage.
     * @return the bike's mileage
     */
    public int getMileage()
    {
        return  mileage;
    }
    
    /**
     * Sets the number of chainrings for the bike.
     * @param bikeChainringNumber number of chainrings in the bike 
     */
    public void setChainringNumber(int bikeChainringNumber)
    {   if (bikeChainringNumber >= 0) //I allow the number to be 0 in case it is a broken bike
        {
            chainringNumber = bikeChainringNumber;
        }
        else
        {
            System.out.println("Enter a positive integer.");
        }
    }
    
    /**
     * Sets the number of chainrings for the bike.
     * @param bikeSprocketNumber number of chainrings in the bike 
     */
    public void setSprocketNumber(int bikeSprocketNumber)
    {
        if (bikeSprocketNumber >= 0) //I allow the number to be 0 in case it is a broken bike
        {
            sprocketNumber = bikeSprocketNumber;
        }
        else
        {
            System.out.println("Enter a positive integer.");
        }
        
    }
    
    /**
     * Inceases the mileage of the bike by a specified number of miles.
     * @param milesDriven how much miles was driven on the bike
     */
    public void drive(int milesDriven)
    {
        if (milesDriven >= 0)
        {
            mileage += milesDriven;
        }
        else
        {
            System.out.println("Enter a positive integer.");
        }
    }
    
    /**
     * Prints all available information about the bike: owner, model,
     * number of sprockets, chainrings, presence of hydraulic brakes,
     * and mileage. Each characteristic is printed on a separate line.
     */
    public void printBikeInfo()
    {
        System.out.println("Owner:" + owner);
        System.out.println("Model:" + model);
        System.out.println("Number of sprockets:" + sprocketNumber);
        System.out.println("Number of chainrings:" + chainringNumber);
        System.out.println("Hydraulic brakes present" + hydraulicBrakes);
        System.out.println("Mileage:" + mileage);
    }
    
    /**
     * Prints information about the author of each implemented method.
     */
    public void authorInfo()
    {
        System.out.println("Mila did tasks 1,2,3,7,8 and fixed mistakes in tasks 4,5,6");
        System.out.println("Kailesh did tasks 4,5,6");
        System.out.println("Tousif might have dropped the course, didn't tell us");
    }
}
