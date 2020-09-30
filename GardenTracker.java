import java.util.Scanner; // Importing library for Phase 2b. User input.

public class GardenTracker
{
    public static PlantList currentGarden;
    //public static Plant[] currentGarden; // Plant array which stores differnt plant objects.
    //public static int currentCount; // Counter variable to keep track of number of plants in the garden.
    
    public static void main(String[] args)
    {
        // Choosing currentGarden's length arbitrarily and assigning currentCount to 0.
        //currentGarden = new Plant[40];
        //currentCount = 0;
        //currentGarden[0] = new Plant("Basil", 50, true);
        //currentCount++;
        //currentGarden[1] = new Plant("Water Hemlocks", 250, false);
        //currentCount++;
        currentGarden = new PlantList();
        addPlants(getUserInput());
        System.out.println("\nCurrently filled Plant objects: " + currentGarden.size());
        System.out.println("\nUsing getPlantData():\n" + getPlantData());
        
        Plant[] p1 = new Plant[10];
        for(int i = 0; i < p1.length; i++)
        {
            p1[i] = new Plant("newPlant" + (i+1));
        }
        
        addPlants(p1);
        
        System.out.println("\nUsing getPlantData() method after adding Plant Array:\n" + getPlantData());
        
        System.out.println("\n" + currentGarden.toString());
        
        System.out.println("\nCurrently filled Plant objects: " + currentGarden.size());
        
        // getUserInput plant array variable, this object will reference same object created by getUserInput() method.
        //Plant[] userAddedPlants = getUserInput();
        
        // adding userAddedPlants to the currentGarden array.
        //addPlants(userAddedPlants);
        
        // Printing out the list of plants using printPlantList method.
        //System.out.println(printPlantList(userAddedPlants));
    }
    
    public static void initializeGarden(int size)
    {
        //currentGarden = new Plant[size];
        //currentCount = 0;
    } // This will create an empty plant array of length size - passed as a parameter and set currentCounter to 0.
    
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
    } // This method will verify that every index from 0 to currentCounter of plant array is properly filled.
    
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
    } // This method will add the new plant to the last position in the array if array is not already full.
    
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
    } // This method returns string with the plant data stored in the currentGarden array.
    
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
    
    /* This method will add the newPlant array to the existing current garden array by 
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
    } // This method simply prints the plant data entered by the user in the console and current garden data. 
}