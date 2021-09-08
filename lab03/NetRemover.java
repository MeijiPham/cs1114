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
        this.turn(RIGHT);
        this.pickFlowers();
        this.goToTop();
        this.turn(RIGHT);
        this.travelToNet();
        this.disableNets();
    }
    /** 
     * The jeroo will pick all flowers in the row and return to its starting
     * position
     */
    public void pickFlowers() 
    {       
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
        while (!this.seesNet(AHEAD)) 
        {
            this.hop();
        }
    }
    /**
     * The jeroo will disable all the nets within its row
     */
    public void disableNets() 
    {     
        while (this.seesNet(AHEAD)) 
        {
            this.toss();
            this.hop();
            if (this.seesNet(RIGHT)) {
                this.turn(RIGHT);
            }
        }
    }

}
