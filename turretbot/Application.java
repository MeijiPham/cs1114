import student.micro.GreenfootApplication;

//-------------------------------------------------------------------------
/**
 *  Application launcher for TurretBot's Castle world.
 *
 *  @author Stephen Edwards
 *  @version 2021.08.31
 */
public class Application
    extends GreenfootApplication
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes your Application.
     */
    public Application()
    {
        // Fill in with your project details
        setProjectName("turretbot");
        setInitialWorldClassName("Castle");
        setInitialSpeed(25);
    }
}
