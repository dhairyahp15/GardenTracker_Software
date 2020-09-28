public class TestClass
{
    // The main method for the Test class.
    public static void main(String[] args)
    {
        
        /*------------------------------- 
        --------- PHASE 1 TESTS ---------
        -------------------------------*/
        
        // Creating several different objects of Plant with different construtors for testing purpose.
        Plant p1 = new Plant();
        Plant p2 = new Plant("Lily");
        Plant p3 = new Plant("Aloe Vera", 100, true);
        
        // Testing all the accessor methods, to check the instance variables initialized by constructors.
        System.out.println(p1.getName());
        System.out.println(p1.getHeight());
        System.out.println(p1.getEdible());
        System.out.println();
        System.out.println(p2.getName());
        System.out.println(p2.getHeight());
        System.out.println(p2.getEdible());
        System.out.println();
        System.out.println(p3.getName());
        System.out.println(p3.getHeight());
        System.out.println(p3.getEdible());
        System.out.println();
        
        // Testing all the mutator methods to change the value of the instance variables.
        p1.setName("Rose");
        p1.setHeight(92);
        p1.setEdible(true);
        System.out.println(p1.getName());
        System.out.println(p1.getHeight());
        System.out.println(p1.getEdible());
        System.out.println();
        
        /*------------------------------- 
        --------- PHASE 2 TESTS ---------
        -------------------------------*/
        
        // Testing out all the static mehtods of GardenData.
        
        GardenTracker.initializeGarden(4); // Initialized garden size or array size to 4;
       
        // Adding some initial Plant objects to the array indices by calling out constructors, and increasing counter simultaneously. 
        GardenTracker.currentGarden[0] = new Plant("Coriander", 45, true);
        GardenTracker.currentCount++;
        GardenTracker.currentGarden[1] = new Plant("Basil", 50, true);
        GardenTracker.currentCount++;
        GardenTracker.currentGarden[2] = new Plant("Castor Bean", 450, false);
        GardenTracker.currentCount++;
        
        // Testing verify data to check if there are any gaps in the array.
        System.out.println(GardenTracker.verifyData());
        System.out.println();
        
        /* Adding plant to the last position of the array and making sure 
        that count should be increased only if plant is added.*/
        if(GardenTracker.addPlant(p3)) // Adding p3 object created while testing phase 1.
        {
            System.out.println("Successfully added.");
        }
        
        if(GardenTracker.addPlant(p2)) // Adding p2 object created while testing phase 1.
        {
            System.out.println("Successfully added.");
        }    
        System.out.println();
        
        // Printing the entire plant data stored in array until current count.
        System.out.println("Plant Data String:");
        System.out.println(GardenTracker.getPlantData());
        System.out.println();
        
        /*------------------------------- 
        --------- PHASE 3 TESTS ---------
        -------------------------------*/
        
        PlantList plants = new PlantList();
        for(int i = 0; i < 105; i++)
        {
            if(plants.add(new Plant("Plant" + i)));
            else
                System.out.println("Warning! Cannot be added, array is already full.");
        }
    }
}