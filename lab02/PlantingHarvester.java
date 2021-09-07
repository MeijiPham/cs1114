
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This is a child class of the `Harvester` class. It's designed to allow
 *  a different jeroo to harvest a row of flowers while planting new ones.
 *  `Hop2AndPick()` is changed to fit this action. To use it, call the 
 *  `harvestRow()` method in myProgram() with an object 
 *  of `PlantingHarvester`.
 *  
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.01
 */
public class PlantingHarvester
    extends Harvester
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created PlantingHarvester object.
     */
    public PlantingHarvester()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /** 
     * Hops, picks, hop, and then plant a flower 
     */
    public void hop2AndPick() 
    {
        this.hopAndPick();
        this.hop();
        this.plant();
    }
}
