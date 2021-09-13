import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 *  This class contains all the methods required for the jeroo to collect
 *  all the flowers and disable the nets. It includes all the behaviors
 *  the jeroo will perform to carry out the action previously mentioned.
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.07
 */
public class NetRemover
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created NetRemover object.
     */
    public NetRemover()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * The jeroo will pick all the flowers and use them to disable
     * all the nets
     */
    public void pickFlowersAndDisableNets() 
    {       
        this.pickFlowers();
        this.goToTop();
        this.travelToNet();
        this.disableNets();
    }
    /** 
     * The jeroo will pick all flowers in the row and return to its starting
     * position
     */
    public void pickFlowers() 
    {   
        this.turn(RIGHT);
        
        while (this.seesFlower(AHEAD)) 
        {
            this.hop();
            this.pick();
        }  
    }
    /**
     * The jeroo will travel to the top of the island; should be used after
     * the jeroo has picked all the flowers within a row
     * 
     */
    public void goToTop() 
    {
        this.turn(RIGHT);
        this.turn(RIGHT);

        while (!this.seesWater(AHEAD)) 
        {
            this.hop();
        }
    }
    /**
     * The jeroo will hop until it sees a net ahead of it
     */
    public void travelToNet() 
    {
        this.turn(RIGHT);
        
        while (this.isClear(AHEAD)) 
        {
            this.hop();
        }
    }
    /**
     * For every net within a row, the jeroo will disable one if it has
     * a flower for it; if it runs out of flowers, it will stop at where it
     * is
     * 
     */
    public void disableNets() 
    {   
        while (this.seesNet(AHEAD) && this.hasFlower()) 
        {     
            this.toss();
            this.hop();
            if (this.seesNet(RIGHT)) {
                this.turn(RIGHT);
            }
        }        
    }
}
