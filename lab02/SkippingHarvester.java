
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This is a child class of the `Harvester` class. It's designed to allow
 *  a different jeroo to harvest a row of flowers. However, this time,
 *  there are only 3 flowers, each in every other spaces. `Hop2AndPick()`
 *  is changed to fit this action. To use it, call the `harvestRow()` 
 *  method in myProgram() with an object of `SkippingHarvester`.
 *  
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.01
 */
public class SkippingHarvester
    extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SkippingHarvester object.
     */
    public SkippingHarvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    // Hop, pick a flower, then hop
    public void hop2AndPick() 
    {
        this.hopAndPick();
        this.hop();
    }
}
