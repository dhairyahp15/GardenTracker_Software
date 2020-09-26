public class TestClass
{
    // The main method for the Test class.
    public static void main(String[] args)
    {
        // Creating several different objects of Plant with different construtors for testing purpose.
        Plant p1 = new Plant();
        Plant p2 = new Plant("Lily");
        Plant p3 = new Plant("Aloe Vera", 100, true);
        
        // Testing all the constructors using accessor methods.
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
    }
}