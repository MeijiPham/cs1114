import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  This class contains the main method of the program. It creates a jeroo
 *  named `joey` and adds it into the island. The jeroo will then collect all
 *  the flowers and disable as many nets as it can with the amount of
 *  flowers it collected. To run the program, run the application file.
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.07
 */
public class NetIsland
    extends NetIslandBase
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created NetIsland object.
     */
    public NetIsland()
    {
        super();
    }
    
    /**
     * Runs the program
     */
    public void myProgram() 
    {
        NetRemover joey = new NetRemover();
        this.addObject(joey, 3, 1);
        joey.pickFlowersAndDisableNets();
    }
}
