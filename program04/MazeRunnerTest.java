import student.micro.*;
import static org.assertj.core.api.Assertions.*;
import student.micro.jeroo.*;
import static student.micro.jeroo.CompassDirection.*;
import static student.micro.jeroo.RelativeDirection.*;

// -------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Meiji Pham (meijipham0601)
/**
 *  Tests the methods in the MazeRunner class using the TestingIsland class.
 *
 *  @author Meiji Pham meijipham0601
 *  @version 2021.09.26
 */
public class MazeRunnerTest
    extends TestCase
{
    //~ Fields ................................................................
    private Island island;
    private MazeRunner runner;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new MazeRunnerTest test object.
     */
    public MazeRunnerTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Sets up the test fixture.
     * Called before every test case method.
     */
    public void setUp()
    {
        this.island = new TestingIsland();
        this.runner = new MazeRunner();
        this.island.addObject(new Flower(), 1, 5);
        this.island.addObject(new Flower(), 1, 2);
        this.island.addObject(new Flower(), 7, 1);
        this.island.addObject(new Net(), 1, 6);
        this.island.addObject(new Flower(), 2, 1);
        this.island.addObject(new Net(), 3, 1);
    }


    // ----------------------------------------------------------
    /**
     * Tests clearMaze() method. Jeroo should be at its initial position
     * and there should be no flowers or nets left on the island.
     */
    public void testClearMaze() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.clearMaze();
        
        assertThat(this.island.countFlowers()).isEqualTo(0);
        assertThat(this.island.countNets()).isEqualTo(0);
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.runner.getFlowers()).isEqualTo(12);
        assertThat(this.island.hasFlowerAt(1, 2)).isFalse();
        assertThat(this.island.hasFlowerAt(1, 5)).isFalse();
        assertThat(this.island.hasFlowerAt(7, 1)).isFalse();
        assertThat(this.island.hasNetAt(1, 6)).isFalse();
    }
    /**
     * Tests traverseEast() method for when there is an open path east.  
     * Every flowers and nets east of the jeroo should no longer exist and
     * the jeroo should be at its initial position.
     * 
     */
    public void testTraverseEastWhenClear() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.traverseEast();
        
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.island.hasFlowerAt(2, 1)).isFalse();
        assertThat(this.island.hasNetAt(3, 1)).isFalse();
        assertThat(this.island.countFlowers()).isEqualTo(3);
        assertThat(this.island.countNets()).isEqualTo(1);
    }
    /**
     * Tests traverseEast() method for when the path to the east is not clear
     * for the jeroo since there is water. Jeroo should remain where it is at
     * and the number of flowers and nets on the island should be the same.
     */
    public void testTraverseEastWhenNotClear() 
    {
        this.island.addObject(this.runner, 5, 1);
        
        this.runner.traverseEast();
        
        assertThat(this.runner.getX()).isEqualTo(5);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.island.hasFlowerAt(7, 1)).isTrue();
        assertThat(this.runner.getFlowers()).isEqualTo(10);
        assertThat(this.island.countFlowers()).isEqualTo(4);
        assertThat(this.island.countNets()).isEqualTo(2);
    }
    /**
     * Tests traverseSouth() method. Jeroo should clear all obstacles to the
     * southern part of the maze and end back at its initial position.
     */
    public void testTraverseSouth() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.turn(RIGHT);
        this.runner.traverseSouth();
        
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.island.countFlowers()).isEqualTo(1);
        assertThat(this.island.countNets()).isEqualTo(1);
        assertThat(this.island.hasFlowerAt(2, 1)).isTrue();
        assertThat(this.island.hasNetAt(3, 1)).isTrue();
    }
    /**
     * Tests checkAndHop() method for when there is no net ahead. 
     * Jeroo should be one space foward from its initial position and picked
     * up the flower in front of it.
     */
    public void testCheckAndHopNoNet() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.checkAndHop();
        
        assertThat(this.runner.getX()).isEqualTo(2);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.runner.getFlowers()).isEqualTo(11);
        assertThat(this.island.hasFlowerAt(2, 1)).isFalse();
        assertThat(this.island.hasNetAt(3, 1)).isTrue();
    }
    /**
     * Tests checkAndHop() method for when there is a net ahead. 
     * Jeroo should disable the net in front of it and end up being one space
     * forward from its initial position. 
     */
    public void testCheckAndHopNetAhead() 
    {
        this.island.addObject(this.runner, 2, 1);
        
        this.runner.checkAndHop();
        
        assertThat(this.runner.getX()).isEqualTo(3);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.runner.getFlowers()).isEqualTo(9);
        assertThat(this.island.hasFlowerAt(2, 1)).isTrue();
        assertThat(this.island.hasNetAt(3, 1)).isFalse();
    }
    /**
     * Tests checkAndHop() method for when there is no flower or net ahead. 
     * Jeroo should just jump foward from its initial position.
     */
    public void testCheckAndHopNoNetNoFlower() 
    {
        this.island.addObject(this.runner, 3, 3);
        
        this.runner.checkAndHop();
        
        assertThat(this.runner.getX()).isEqualTo(4);
        assertThat(this.runner.getY()).isEqualTo(3);
    }
    /**
     * Tests hugRightWall() method for when there is water ahead and to its
     * right. Jeroo should end up facing North and remaining in its initial
     * position.
     */
    public void testHugRightWallWaterRightAndAhead() 
    {
        this.island.addObject(this.runner, 10, 7);
        
        this.runner.hugRightWall();
        
        assertThat(this.runner.getX()).isEqualTo(10);
        assertThat(this.runner.getY()).isEqualTo(7);
        assertThat(this.runner.isFacing(NORTH)).isTrue();
    }
    /**
     * Tests hugRightWall() method for when there is water not ahead but to 
     * its right. Jeroo should end up facing East and one space forward to the
     * right.
     * 
     */
    public void testHugRightWallWaterRightNotAhead() 
    {
        this.island.addObject(this.runner, 3, 3);
        
        this.runner.hugRightWall();
        
        assertThat(this.runner.getX()).isEqualTo(4);
        assertThat(this.runner.getY()).isEqualTo(3);
        assertThat(this.runner.isFacing(EAST)).isTrue();
    }
    /**
     * Tests hugRightWall() method for when there is no water to the right
     * of the jeroo. Jeroo should end up facing South and one space below
     * its initial position.
     */
    public void testHugRightWallWaterNotRight() 
    {
        this.island.addObject(this.runner, 5, 3);
        
        this.runner.hugRightWall();
        
        assertThat(this.runner.getX()).isEqualTo(5);
        assertThat(this.runner.getY()).isEqualTo(4);
        assertThat(this.runner.isFacing(SOUTH)).isTrue();
    }
    /**
     * Tests traverseDirection() method. Jeroo should collect all flowers
     * and disable all nets in a certain direction of the maze. It should
     * then end up at its initial position.
     */
    public void testTraverseDirection() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.traverseDirection();
        
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.island.hasFlowerAt(2, 1)).isFalse();
        assertThat(this.island.hasNetAt(3, 1)).isFalse();
        assertThat(this.island.countFlowers()).isEqualTo(3);
        assertThat(this.island.countNets()).isEqualTo(1);
    }
    /**
     * Tests turnTowardsSouth() method. Jeroo should keep turning until
     * it faces South and remain in its inital position.
     */
    public void testTurnTowardsSouth() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.turnTowardsSouth();
        
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(1);
        assertThat(this.runner.isFacing(SOUTH)).isTrue();
    }
}
