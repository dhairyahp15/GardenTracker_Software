public class TestClass
{
    // Creating several different objects of Plant with different construtors for testing purpose.
    private static Plant p1 = new Plant();
    private static Plant p2 = new Plant("Lily");
    private static Plant p3 = new Plant("Aloe Vera", 100, true);
    
    // The main method for the Test class.
    public static void main(String[] args)
    {
        phase1_tests();
        phase2_tests();
        phase3_tests();
    }
    
        /*------------------------------- 
        --------- PHASE 1 TESTS ---------
        -------------------------------*/
        
    public static void phase1_tests()
    {     
        System.out.println("\"----- PHASE 1 TESTS -----\"");
        System.out.println();
        
        // Testing all the accessor methods, to check the instance variables initialized by constructors.
        System.out.println("P1: " + p1.getName() + " " +p1.getHeight() + " " + p1.getEdible());
        System.out.println();
        System.out.println("P2: " + p2.getName() + " " +p2.getHeight() + " " + p2.getEdible());
        System.out.println();
        System.out.println("P3: " + p3.getName() + " " +p3.getHeight() + " " + p3.getEdible());
        System.out.println();
        
        // Testing all the mutator methods to change the value of the instance variables.
        p1.setName("Rose");
        p1.setHeight(92);
        p1.setEdible(true);
        System.out.println("P1: " + p1.getName() + " " +p1.getHeight() + " " + p1.getEdible());
        System.out.println();
    }
    
        /*------------------------------- 
        --------- PHASE 2 TESTS ---------
        -------------------------------*/
    
    public static void phase2_tests()
    {
        // Testing out all the static mehtods of GardenData.
        
        //GardenTracker.initializeGarden(4); // Initialized garden size or array size to 4;
       
        // Adding some initial Plant objects to the array indices by calling out constructors, and increasing counter simultaneously. 
        
        // Changing my tests because I changed Plant array to PlantList in the GardenTracker, however; every tests has been saved in Git. 
        
        GardenTracker.addPlant(new Plant("Coriander", 45, true));
        GardenTracker.addPlant(new Plant("Basil", 50, true));
        GardenTracker.addPlant(new Plant("Castor Bean", 450, false));
        
        System.out.println("\"----- PHASE 2 TESTS -----\"");
        System.out.println();
        
        // Testing verify data to check if there are any gaps in the array.
        System.out.println("Verify Data: " + GardenTracker.verifyData());
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
    }
    
        /*------------------------------- 
        --------- PHASE 3 TESTS ---------
        -------------------------------*/
    
    public static void phase3_tests()
    {
        System.out.println("\"----- PHASE 3 TESTS -----\"");
        System.out.println();
        
        // Testing first constructor.
        PlantList plants_1 = new PlantList();
        for(int i = 0; i < 103; i++)
        {
            if(plants_1.add(new Plant("Plant" + (i+1))));
            else
                System.out.println("Warning! Cannot be added, array is already full.");
        }
        System.out.println();
        
        // Testing second constructor.
        Plant[] plants = new Plant[5];
        for(int i = 0; i < plants.length; i++)
        {
            plants[i] = new Plant("newPlant" + (i + 1));
        }
        
        PlantList plants_2 = new PlantList(plants);
        System.out.println();
        
        System.out.println(plants_2.toString());
        System.out.println();
        
        //Testing out instance methods.
        PlantList plants_3 = new PlantList();
        
        System.out.println(plants_3.toString()); // When no Plant object is stored in the Plant array.
        System.out.println();
        
        plants_3.add(new Plant("Rose"));
        System.out.println(plants_3.toString()); // When one object is stored in the Plant array.
        System.out.println();
        
        for(int i = 0; i < 10; i++)
        {
            plants_3.add(new Plant("Plant" + (i + 1)));
        }
        
        System.out.println(plants_3.toString()); // After adding 10 more objects to the array.
        System.out.println();
        
        System.out.println("Plant object at index 3 will be " + plants_3.get(3).getName() + "."); // Using get method.
        System.out.println();
        
        plants_3.set(6, p3); // Using set method to change the plant object at the given index.
        System.out.println(plants_3.toString()); // Printing out list to see the changes.
        System.out.println();

        System.out.println("Current plant objects filled in the array: " + plants_3.size()); // Total number of plant objects stored in the array.
        
        Plant p1 = new Plant("rose");
        Plant p2 = new Plant("rose");
        
        //Completed all the tests successfully.
        System.out.println("\nCompleted all the tests succesfully.");
    }
}