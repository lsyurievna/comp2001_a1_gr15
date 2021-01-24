/**
 * A class that maintains information on a bicycle.
 * This might form part of a larger application such
 * as a bicycle shop, for instance.
 *
 * @author Liudmila Strelnikova
 * @author Kailwsh Sugumar
 * @author (Insert name of group member 3)
 * 
 * @version 19.01.2021
 */
public class Bicycle
{
    // The fields.
    private String owner;
    private String model;
    private int sprocketNumber;
    private int chainringNumber;
    private boolean hydraulicBrakes;
    private int mileage;
    
    /**
     * Set the owner and model fields when this object
     * is constructed.
     */
    public Bicycle(String bikeOwner, String bikeModel, boolean immutable)
    {
        owner = bikeOwner;
        model = bikeModel;
        sprocketNumber = 0;
        chainringNumber = 0;
        hydraulicBrakes = false;
        mileage = 0;
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
     *Accessor method to return the value
     */
    public boolean ishydraulicBrakes()
    {
        return hydraulicBrakes;
    }
     
    public void setdrive(int mileage)
    {
        mileage=mileage + drive;
     }
            
    /**
     * Gets the bike's milage.
     * @return String milage of the bike 
     */
    public int getMileage()
    {
        return mileage;
    }    
   
    
    
        
}
