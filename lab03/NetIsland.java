import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  Write a one-sentence summary of your class here.
 *  Follow it with additional details about its purpose, what abstraction
 *  it represents, and how to use it.
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
    
    
    public void myProgram() 
    {
        NetRemover joey = new NetRemover();
        this.addObject(joey, 3, 1);
        joey.pickFlowersAndDisableNets();
    }
}
