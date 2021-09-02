
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class is the blueprint for the other 2 jeroo subclasses. It will
 *  tell a jeroo to harvest a row of 6 flowers. To use it, call the
 *  `harvestRow()` method in myProgram() with an object of `Harvester`.
 *  
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.01
 */
public class Harvester
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Harvester object.
     */
    public Harvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Method ...............................................................
    // Hops forward and picks a flower
    public void hopAndPick() 
    {
        this.hop();
        this.pick();
    }
    // Hops and picks flower twice in a row
    public void hop2AndPick() 
    {
        this.hopAndPick();
        this.hopAndPick();
    }
    // Harvests an entire row of flowers
    public void harvestRow() 
    {
        this.hop2AndPick();
        this.hop2AndPick();
        this.hop2AndPick();
    }
}
