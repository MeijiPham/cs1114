import student.micro.jeroo.*;

//-------------------------------------------------------------------------
/**
 *  This class will navigate the 3 jeroos to harvest and
 *  plant flowers on the island as detailed in the final layout.
 *  The first 2 harvest the a row of flowers
 *  and the third one harvests its row and plants new flowers.
 *  To run it, right click on the Lab02Solution file and click "new".
 *  
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.01
 */
public class Lab02Solution
    extends PlantationIsland
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Lab02Solution object.
     */
    public Lab02Solution()
    {
        super();
    }


    //~ Methods ...............................................................
    /** 
     * Adds 3 jeroos on the island and have them perform tasks as indicated
     * above 
     */
    public void myProgram() 
    {
        Harvester max = new Harvester();
        this.addObject(max, 2, 3);
        SkippingHarvester joey = new SkippingHarvester();
        this.addObject(joey, 2, 5);
        PlantingHarvester tony = new PlantingHarvester();
        this.addObject(tony, 2, 7);
        max.harvestRow();
        joey.harvestRow();
        tony.harvestRow();
    }
}
