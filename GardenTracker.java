import java.util.Scanner; // Importing library for Phase 2b. User input.

public class GardenTracker
{
    public static PlantList currentGarden = new PlantList();

    public static void main(String[] args)
    {
        // Testing all the static methods after changing some operations that can be used by PlantList Object.
        addPlants(getUserInput()); // Getting Plant array from user and adding it to the PlantList Plant array.
        
        System.out.println("\nCurrently filled Plant objects: " + currentGarden.size()); // Current number of objects filled in the array
        System.out.println("\nUsing getPlantData():\n" + getPlantData()); // Using getPlantData() method to print plant data from PlantList.
        
        Plant[] p1 = new Plant[10]; // Creating simple plant array to add this method to PlantList plant array.
        for(int i = 0; i < p1.length; i++)
        {
            p1[i] = new Plant("newPlant" /*+ (i+1)*/);
        }
        
        addPlants(p1); // Adding above created array to the PlantList plant array. 
        
        // Printing data using getPlantData() after adding array to PlantList.
        System.out.println("\nUsing getPlantData() method after adding Plant Array:\n" + getPlantData());
        
        // Printing array using toString() method from the PlantList.
        System.out.println("\n" + currentGarden.toString());
        
        // Printing the total number of the plants objects filled in the plant array of PlantList.
        System.out.println("\nTotal plants in the Garden: " + currentGarden.size());
        
        PlantList newPlantList = new PlantList(getUserInput());
        PlantList p = newPlantList.getUniquePlants();
        
        System.out.println("\n" + p.toString());
        
    }
    
    /*public static void initializeGarden(int size)
    {
        //currentGarden = new Plant[size];
        //currentCount = 0;
    } // This will create an empty plant array of length size - passed as a parameter and set currentCounter to 0.
    */
    
    // This method will verify that the plant array from PlantList is properly filled.
    public static boolean verifyData()
    {
        for(int i = 0; i < currentGarden.size(); i++)
        {
            if(currentGarden.get(i) == null)
                return false;
            else
                return true;
        }
        return true;
    } 
    
    // This method will add the new plant to the last position in the array if array is not already full.
    public static boolean addPlant(Plant newPlant)
    {
        if(currentGarden.MAX_SIZE == currentGarden.size())
        {
            System.out.println("Warning! Array is already full.");
            return false;
        }
        else
        {
            currentGarden.add(newPlant);
            return true;
        }
    } 
    
    // This method returns string with the plant data stored in the PlantList.
    public static String getPlantData()
    {
         // This string will be concatenated with total plants, max size, and all valid plants.
        String result = "Garden Summary: Current count - " + currentGarden.size() + " Max size - " + currentGarden.MAX_SIZE + "\n";
        for(int i = 0; i < currentGarden.size(); i++)
        {
            if(verifyData())
            {
                result += "Plant: " + currentGarden.get(i).getName() + "  Height: " + currentGarden.get(i).getHeight() 
                + "  Is Edible: " + currentGarden.get(i).getEdible() + "\n";
            }
        }
        return result;
    } 
    
    /* The following method will ask the user to enter number of plants they want to enter and then
       ask the individual plant names to enter which is stored in the array of Plant. That array is 
       eventually returned.*/
    public static Plant[] getUserInput()
    {
        Scanner sc = new Scanner(System.in); // Creating scanner variable to get user Input.
        System.out.print("Please enter number of plants you have: ");
        int getUserInput  = sc.nextInt();
        sc.nextLine();    
        if(getUserInput <= 0)
        {
            System.out.println("Please enter a valid number, greater than 0.");
            getUserInput = sc.nextInt();
        }
        
        Plant[] userAddedPlants = new Plant[getUserInput]; // Created new plant array of the length given by the user.
        
        for(int i = 0; i < getUserInput; i++)
        {
            System.out.print("Please enter the name of the plant to add: ");
            userAddedPlants[i] = new Plant(sc.nextLine());
        }
        return userAddedPlants;
    } 
    
    /* This method will add the newPlants array to the existing array in the PlantList by 
       making sure it is not already full and also shows warning if array gets full while 
       adding new array to current garden with the help of addPlant() method. */ 
    public static void addPlants(Plant[] newPlants)
    {
        for(int i = 0; i < newPlants.length; i++)
        {
            for(int j = 0; j < currentGarden.MAX_SIZE; j++)
            {
                if(addPlant(newPlants[i]))
                    break;
            }
        }
    }
    
    // This method simply prints the plant data entered by the user in the console and PlantList data. 
    public static String printPlantList(Plant[] list)
    {
        String result = "Printing Plant List of Length: " + list.length + "\n";
        for(int i = 0; i < list.length; i++)
        {
            if(verifyData())
            {
                result += "Plant: " + list[i].getName() + "  Height: " + list[i].getHeight() 
                + "  Is Edible: " + list[i].getEdible() + "\n";
            }
        }
        return result + getPlantData();
    } 
}