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
    }


    // ----------------------------------------------------------
    /**
     * Tests clearMaze() method
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
     * Tests clearAllObstacles() method
     */
    public void testClearAllObstacles() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.clearAllObstacles();
        
        assertThat(this.island.countFlowers()).isEqualTo(0);
        assertThat(this.island.countNets()).isEqualTo(0);
        assertThat(this.runner.getFlowers()).isEqualTo(12);
        assertThat(this.island.hasFlowerAt(1, 2)).isFalse();
        assertThat(this.island.hasFlowerAt(1, 5)).isFalse();
        assertThat(this.island.hasFlowerAt(7, 1)).isFalse();
        assertThat(this.island.hasNetAt(1, 6)).isFalse();
    }
    /**
     * Tests goBackToStart() method
     */
    public void testGoBackToStart() 
    {
        this.island.addObject(this.runner, 9, 1);
        
        this.runner.goBackToStart();
        
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(1);
    }
    /**
     * Tests clearOneLine() method
     */
    public void testClearOneLine() 
    {
        this.island.addObject(this.runner, 1, 1);
        
        this.runner.turn(RIGHT);
        this.runner.clearOneLine();
        
        assertThat(this.runner.getX()).isEqualTo(1);
        assertThat(this.runner.getY()).isEqualTo(7);
        assertThat(this.runner.seesWater(AHEAD)).isTrue();
        assertThat(this.runner.getFlowers()).isEqualTo(11);
        assertThat(this.island.hasFlowerAt(7, 1)).isTrue();
        assertThat(this.runner.isFacing(SOUTH)).isTrue();
    }
    /**
     * Tests turnCorner() method for left corner
     */
    public void testTurnCorner() 
    {
        this.island.addObject(this.runner, 1, 7);
        
        this.runner.turn(RIGHT);
        this.runner.turnCorner();
        
        assertThat(this.runner.isFacing(EAST)).isTrue();
        assertThat(this.runner.seesWater(RIGHT)).isTrue();
        assertThat(this.runner.seesWater(AHEAD)).isFalse();
        assertThat(this.runner.seesWater(LEFT)).isFalse();
    }
    /**
     * Tests turnCorner() method for right corner
     */
    public void testTurnCorner2() 
    {
        this.island.addObject(this.runner, 5, 5);
        
        this.runner.turn(RIGHT);
        this.runner.turnCorner();
        
        assertThat(this.runner.isFacing(WEST)).isTrue();
        assertThat(this.runner.seesWater(RIGHT)).isFalse();
        assertThat(this.runner.seesWater(LEFT)).isTrue();
        assertThat(this.runner.seesWater(AHEAD)).isFalse();
    }
    /**
     * Tests escapeDeadEnd() method
     */
    public void testEscapeDeadEnd() 
    {
        this.island.addObject(this.runner, 10, 5);
        
        this.runner.turn(RIGHT);
        this.runner.escapeDeadEnd();
        
        assertThat(this.runner.isFacing(NORTH)).isTrue();
        assertThat(this.runner.seesWater(RIGHT)).isTrue();
        assertThat(this.runner.seesWater(LEFT)).isTrue();
    }
}
