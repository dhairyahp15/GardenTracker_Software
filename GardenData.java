public class GardenData
{
    public static Plant[] currentGarden; // Plant array which stores differnt plant objects.
    public static int currentCount; // Counter variable to keep track of number of plants in the garden.
    
    public static void main(String[] args)
    {
    }
    
    public static void initializeGarden(int size)
    {
        currentGarden = new Plant[size];
        currentCount = 0;
    } // This will create an empty plant array of length size - passed as a parameter and set currentCounter to 0.
    
    public static boolean verifyData()
    {
        for(int i = 0; i < currentCount; i++)
        {
            if(currentGarden[i] == null)
                return false;
            else
                return true;
        }
        return true;
    } // This method will verify that every index from 0 to currentCounter of plant array is properly filled.
    
    public static boolean addPlant(Plant newPlant)
    {
        if(currentGarden.length == currentCount)
        {
            System.out.println("Warning! Array is already full");
            return false;
        }
        else
        {
            currentGarden[currentCount] = newPlant;
            return true;
        }
    } // This method will add the new plant to the last position in the array if array is not already full.
    
    public static String getPlantData()
    {
         // This string will be concatenated with total plants, max size, and all valid plants.
        String result = "Garden Summary: Current count - " + currentCount + " Max size - " + currentGarden.length + "\n";
        for(int i = 0; i < currentCount; i++)
        {
            if(verifyData())
                result += "Plant: " + currentGarden[i].getName() + "  Height: " + currentGarden[i].getHeight() 
                + "  Is Edible: " + currentGarden[i].getEdible() + "\n";
        }
        return result;
    }
}