
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
     * The jeroo will complete the maze.
     */
    public void clearMaze() 
    {
        // Jeroo will clear all nets and flowers within maze and return to
        // starting position
    }
    /**
     * The jeroo will pick all flowers and clear all nets in the maze.
     */
    public void clearAllObstacles() 
    {
        // Jeroo will travel through the whole maze and collect flowers and
        // remove all nets it sees
    }
    /**
     * The jeroo will go back to its starting position at (1, 1).
     */
    public void goBackToStart() 
    {
        // After clearing everything in the maze, jeroo will go back to its
        // initial position
    }
    /**
     * The jeroo will navigate through one line in the maze
     */
    public void clearOneLine() 
    {
        // Jeroo will keep hopping forward until it sees water ahead. Will
        // check if there's a flower at where its standing and pick it
        // and disable nets that it sees ahead
    }
    /**
     * The jeroo will turn either right or left depending on where water is
     * at its position
     */
    public void turnCorner() 
    {
        // If there is water to the left, the jeroo will turn right
        // If there is water to the right, the jeroo will turn left
    }
    /**
     * The jeroo will turn towards the main path of the maze if it reaches a 
     * dead end, where there is water surrounding it
     * 
     */
    public void escapeDeadEnd() 
    {
        // If there is water ahead, right, and left, the jeroo will turn 180
        // degrees and turn towards the main path of the maze
    }

}
