public class Plant
{
    // Instance variables decalred below.
    private String name;
    private int height; // it gives us current height.
    
    // is the plant edible or not.
    private boolean edible;
    
    //Default constructor that assigns name, height and edible to default values.
    public Plant()
    {
        name = "No Name Plant";
        height = 0;
        edible = false;
    }
    
    // Parameterized which only accepts and assigns the name.
    public Plant(String name)
    {
        this.name = name; // this.name is used to differentiate between local and instance variable.
        height = 0;
        edible = false;
    }
    
    // Parameterized which accepts and assigns all the instance variables.
    public Plant(String name, int height, boolean edible)
    {
        // again here this. is used to differentiate between local and instance variables.
        this.name = name;
        this.height = height;
        this.edible = edible;
    }
    
    // -+-+-+ Accessor Methods for each variable -+-+-+
    
    public String getName()
    {
        return name;
    } // returns name.
    
    public int getHeight()
    {
        return height;
    } // returns height in centimeter.
    
    public boolean getEdible()
    {
        return edible;
    } // returns true or false as in edible or not.
    
    // -+-+-+ Accessor Methods for each variable -+-+-+
    
    public void setName(String newName)
    {
        name = newName;
    } // sets the current name to newName.
    
    public void setHeight(int height)
    {
        this.height = height;
    } // sets the current height to the height passsed as a parameter.
    
    public void setEdible(boolean newEdible)
    {
        edible = newEdible;
    } // sets current boolean value of edible to newEdible.
}
