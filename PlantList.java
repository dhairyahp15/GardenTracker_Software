public class PlantList
{
    private int filledPlants = 0;
    private Plant[] totalPlants;
    public static final int MAX_SIZE = 100;
    public PlantList()
    {
        totalPlants = new Plant[MAX_SIZE];
        filledPlants = 0;
    }
    
    public PlantList(Plant[] arr)
    {
        totalPlants = new Plant[arr.length];
        filledPlants = arr.length;
        for(int i = 0; i < totalPlants.length; i++)
        {
            totalPlants[i] = arr[i];    
        }
    }
    
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
    
    public int size()
    {
        return filledPlants;
    }
    
    public Plant get(int index)
    {
        return totalPlants[index];
    }
    
    public void set(int index, Plant data)
    {
        totalPlants[index] = data;
    }
    
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
}