public class PlantList
{
    private int filledPlants = 0;
    private Plant[] totalPlants;
    public PlantList()
    {
        totalPlants = new Plant[100];
    }
    
    public PlantList(Plant[] arr)
    {
        Plant[] totalPlants = new Plant[arr.length];
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
    
    public void set(int index, Plant data)
    {
        data = totalPlants[index];
    }
    
    public String toString()
    {
        String result = "The Plant List: [";
        for(int i = 0; i < filledPlants; i++)
        {
            if(filledPlants == 1)
            {
                result += totalPlants[i].getName() + "]";
            }
            else
            {
                if(i <= filledPlants - 2)
                {
                    result += totalPlants[i].getName() + ", ";
                }
                else
                {
                    result += totalPlants[i].getName() + "]";
                }
            }
        }
        return result;
    }
}