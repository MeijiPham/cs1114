
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
        // Collects all flowers on island
    }
    /** 
     * The jeroo will hop a specified amount of time and pick up a plant.
     * @param numOfHops The amount of times the jeroo will hop before picking
     */   
    public void hopAndPick(int numOfHops) 
    {
        // Have jeroo hop a certain num of times and pick a flower
    }
    /** 
     * The jeroo will move in a specified direction to navigate around
     * an obstacle
     * @param direction The direction the jeroo will turn when navigating
     *        an obstacle
     */    
    public void goAroundObstacle(RelativeDirection direction) 
    {
        // Allows jeroo to go around a nets or water based on
        // where the jeroo is positioned
    }
    /** 
     * The jeroo will collect all the flowers in the top row
     */    
    public void collectTopFlowers() 
    {
        // Have jeroo collect all flowers in the top row
    }
    /** 
     * The jeroo will navigate to the centered flower
     */    
    public void moveToMiddleFlower() 
    {
        // Have jeroo move to the flower in the center of the island
    }
    /** 
     * The jeroo will navigate to the bottom row 
     */    
    public void moveToBottomRow() 
    {
        // Have jeroo move to the bottom row
    }
    /** 
     * The jeroo will collect all the flowers in the bottom row
     */    
    public void collectBottomFlowers() 
    {
        // Have jeroo collect flowers in bottom row
    }
}
