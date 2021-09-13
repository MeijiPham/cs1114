
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 * Virginia Tech Honor Code Pledge:
 * As a Hokie, I will conduct myself with honor and integrity at all times.
 * I will not lie, cheat, or steal, nor will I accept the actions of those
 * who do.
 * -- Meiji Pham (meijipham0601)
 * 
 *  This class contains all the methods that will complete the objective in
 *  `Scavenger Hunt`. The "main" method here is `collectFlowers()` where
 *  it will allow the jeroo to collect all the flowers using many other
 *  methods that complete one certain task, such as having a jeroo collect
 *  a row of flowers. The purpose of this is to eliminate writing one giant
 *  method with bulky code.
 *
 *  @author Meiji Pham (meijipham0601)
 *  @version 2021.09.03
 */
public class Scavenger
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created Scavenger object.
     */
    public Scavenger()
    {
        super();
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /** 
     * The jeroo will collect all the flowers
     */
    public void collectFlowers() 
    {
        this.hop();
        this.turn(RIGHT);
        this.goAroundObstacle(LEFT);
        this.collectTopFlowers();
        this.collectBottomFlowers();
        this.moveAndCollectMiddleFlower();
    }
    /** 
     * The jeroo will hop a specified amount of time and pick up a plant.
     * @param numOfHops The amount of times the jeroo will hop before picking
     */   
    public void hopAndPick(int numOfHops) 
    {
        this.hop(numOfHops);
        this.pick();
    }
    /** 
     * The jeroo will move in a specified direction to navigate around
     * an obstacle
     * @param direction The direction the jeroo will turn when navigating
     *        an obstacle
     */    
    public void goAroundObstacle(RelativeDirection direction) 
    {
        while (this.isClear(AHEAD)) 
        {
            this.hop();
            if (this.isClear(direction)) 
            {
                this.turn(direction);
                this.hop();
            }
        }
    }
    /** 
     * The jeroo will collect all the flowers in the top row
     */    
    public void collectTopFlowers() 
    {
        this.hopAndPick(1);
        this.turn(RIGHT);
        this.hopAndPick(3);
        this.hopAndPick(4);
    }
    /** 
     * The jeroo will navigate to the centered flower and collect it
     */    
    public void moveAndCollectMiddleFlower() 
    {
        this.turn(RIGHT);
        this.turn(RIGHT);
        this.goAroundObstacle(RIGHT);
        this.turn(LEFT);
        this.hop();
        this.turn(LEFT);
        this.hopAndPick(4);
    }
    /** 
     * The jeroo will navigate to the bottom row 
     */    
    public void moveToBottomRow() 
    {
        this.turn(RIGHT);
        
        while (this.isClear(AHEAD)) 
        {   
            if (this.seesFlower(RIGHT)) 
            {
                break;
            }
            this.hop();
        }
    }
    /**
     * The jeroo will collect all the flowers in the bottom row
     */
    public void collectBottomFlowers() 
    {
        this.moveToBottomRow();
        this.collectBottomRightFlowers();
        this.collectBottomLeftFlowers();
    }
    /** 
     * The jeroo will collect all the flowers in the bottom left row
     */    
    public void collectBottomLeftFlowers() 
    {
        this.hopAndPick(3);
        this.turn(RIGHT);
        this.goAroundObstacle(LEFT);
        this.turn(LEFT);
        this.hopAndPick(1);
    }
    /**
     * The jeroo will collect all the flowers in the bottom right row
     */
    public void collectBottomRightFlowers() 
    {
        this.turn(LEFT);
        this.hopAndPick(1);
        this.turn(LEFT);
        this.turn(LEFT);
        this.hopAndPick(2);
    }
}
