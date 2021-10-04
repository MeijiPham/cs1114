import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  A Jeroo used as an example to show how polymorphism and delegation work.
 *
 *  @author Stephen Edwards
 *  @version 2021.10.02
 */
public class JerooWithBuddy
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created JerooWithBuddy object.
     */
    public JerooWithBuddy()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................


    // ----------------------------------------------------------
    /**
     * Hop straight ahead until the Jeroo reaches the water.
     */
    public void hopToWater()
    {
        while (!this.seesWater(AHEAD))
        {
            this.hop();
        }
    }
}
