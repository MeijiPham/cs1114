
import student.micro.jeroo.*;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Meiji Pham (meijipham0601)
/**
 *  This class includes all the methods that the MazeRunner jeroo will use
 *  to clear the maze and return to its starting position.
 *
 *  @author Meiji Pham meijipham0601
 *  @version 2021.09.26
 */
public class MazeRunner
    extends Jeroo
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created MazeRunner object.
     */
    public MazeRunner()
    {
        super(10);
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * The jeroo will complete the maze by traversing the East and South
     * direction
     */
    public void clearMaze() 
    {
        this.traverseEast();
        this.traverseSouth();
    }
    /**
     * The jeroo will clear all obstacles within the eastern path of the 
     * maze
     */
    public void traverseEast() 
    {
        if (!this.seesWater(AHEAD)) 
        {
            this.traverseDirection();
        }
    }
    /**
     * The jeroo will clear all obstacles within the southern path of the 
     * maze
     */
    public void traverseSouth() 
    {
        this.turnTowardsSouth();
        this.traverseDirection();
    }
    /**
     * The jeroo will check to see if there is a net ahead of it
     * and clear it if there is. It will then hop and pick up a flower
     * if there is one in its new square
     */
    public void checkAndHop() 
    {
        if (this.seesNet(AHEAD)) 
        {
            this.toss();
        }
        this.hop();
        if (this.seesFlower(HERE)) 
        {
            this.pick();
        }
    }
    /**
     * The jeroo will hug the right side of the maze when it is traversing
     * a certain direction. If it is at a dead end, then it will turn around
     * to a clear path. If it can't turn right because there is water to the
     * right, it will keep hopping forward
     */
    public void hugRightWall() 
    {
        if (this.seesWater(RIGHT)) 
        {
            if (this.seesWater(AHEAD)) 
            {
                this.turn(LEFT);
            }
            else 
            {
                this.checkAndHop();
            }
        }
        else 
        {
            this.turn(RIGHT);
            this.checkAndHop();
        }
    }
    /**
     * The jeroo will navigate through a certain direction, going to all
     * possible squares, and go back to its starting position at 1, 1
     * 
     */
    public void traverseDirection() 
    {
        this.checkAndHop();
        while (this.getX() != 1 || this.getY() != 1) 
        {
            this.hugRightWall();
        }
    }
    /**
     * The jeroo will keep turning right until it faces south.
     */
    public void turnTowardsSouth() 
    {
        while (!this.isFacing(SOUTH)) 
        {
            this.turn(RIGHT);
        }
    }
}
