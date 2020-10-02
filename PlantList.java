public class PlantList
{
    private Plant[] totalPlants; // Plant array which holds plant objects and we can perfom various methods to manipulate this array.
    private int filledPlants = 0; // private integer variable to keep track of objects stored in totalPlants array.
    public static final int MAX_SIZE = 100; // Constant variable for the maximum size of the array.
    
    // Constructor that initializes the array object to the size of MAX_SIZE.
    public PlantList()
    {
        totalPlants = new Plant[MAX_SIZE];
        filledPlants = 0;
    }
    
    /* Constructor that accepts plant array and which initializes the PlantList to the same size which refers 
    different array object but same objects*/
    public PlantList(Plant[] arr)
    {
        totalPlants = new Plant[arr.length];
        filledPlants = arr.length;
        for(int i = 0; i < totalPlants.length; i++)
        {
            totalPlants[i] = arr[i];    
        }
    }
    
    // The method which used to add Plants to the plant array if It is not already full.
    public boolean add(Plant newPlant)
    {
        if(totalPlants[totalPlants.length - 1] != null)
            return false;
        else
        {
            totalPlants[filledPlants] = newPlant;
            filledPlants++;
            return true;
        }
    }
    
    // This method returns the number of filled plant objects in the array.
    public int size()
    {
        return filledPlants;
    }
    
    // This method will return the plant object from the array at given index.
    public Plant get(int index)
    {
        return totalPlants[index];
    }
    
    // This method is used to change the plant object(at given index) in the array using the given Plant object.
    public void set(int index, Plant data)
    {
        totalPlants[index] = data;
    }
    
    // The following method returns the concatenated string of the name of all the plants stored in the array. 
    public String toString()
    {
        String result = "The Plant List: [";
        if(filledPlants == 0)
        {
            result += "]";
        }
        else
        {
            for(int i = 0; i < filledPlants; i++)
            {
                if(filledPlants == 1 || i == filledPlants - 1)
                {
                    result += totalPlants[i].getName();
                }
                else if(i <= filledPlants - 2)
                {
                    result += totalPlants[i].getName() + ", ";
                }
            }
            result += "]";
        }
        return result;
    }
    
    /*This method uses the equals method from the Plant class and checks whether the example plant object already
       exists in the list or not, which will be used to get Unique plants.*/
    public boolean contains(Plant example)
    {
        boolean result = false;
        for(int i = 0; i < filledPlants; i++)
        {
            if(totalPlants[i].equals(example))
                result = true;
        }
        return result;
    }
    
    /* This method returns the new plant list which contains each one type of plant object, i.e. list without
       duplicate elements in it, which uses the contains method to verify if the objects already exists in the 
       list or not.*/
    public PlantList getUniquePlants()
    {
        PlantList result = new PlantList();
        for(int i = 0; i < filledPlants; i++)
        {
            if(!result.contains(totalPlants[i]))
            {
                result.add(totalPlants[i]);
            }
        }
        return result;
    }
}