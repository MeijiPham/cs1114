import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  An example island to show how polymorphism and delegation work.
 *
 *  @author Stephen Edwards
 *  @version 2021.10.02
 */
public class BuddyIsland
    extends Island
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created BuddyIsland object.
     */
    public BuddyIsland()
    {
        super();
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the Jeroo(s) for this example.
     */
    public void myProgram()
    {
        JerooWithBuddy bobby = new JerooWithBuddy();
        this.addObject(bobby, 3, 5);

        bobby.hopToWater();
    }

}
