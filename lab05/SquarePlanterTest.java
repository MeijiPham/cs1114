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
 *  This test class is designed to test the methods in the SquarePlanter
 *  class.
 *  
 *
 *  @author Meiji Pham meijipham0601
 *  @version 2021.09.24
 */
public class SquarePlanterTest
    extends TestCase
{
    //~ Fields ................................................................
    private Island island;
    private SquarePlanter jeroo;

    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new SquarePlanterTest test object.
     */
    public SquarePlanterTest()
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
        this.island = new Island();
        this.jeroo = new SquarePlanter(3);
        this.island.addObject(this.jeroo, 1, 1);
    }


    // ----------------------------------------------------------
    /**
     * This method tests the plantOneSide() method.
     */
    public void testPlantOneSide() 
    {
        this.jeroo.plantOneSide();
        
        assertThat(this.jeroo.getX()).isEqualTo(4);
        assertThat(this.jeroo.getY()).isEqualTo(1);
        assertThat(this.island.countFlowers()).isEqualTo(3);
    }
    /**
     * This method tests the plantSquare() method when the jeroo starts with
     * 12 flowers.
     */
    public void testPlantSquare() 
    {
        this.jeroo.plantSquare();
        
        assertThat(this.jeroo.getX()).isEqualTo(1);
        assertThat(this.jeroo.getY()).isEqualTo(1);
        assertThat(this.island.countFlowers()).isEqualTo(12);
        assertThat(this.jeroo.isFacing(EAST)).isTrue();
    }
    /**
     * This methods tests the plantSquare() method when the jeroo
     * starts with 32 flowers.
     */
    public void testPlantSquare2() 
    {
        this.jeroo.remove();
        
        this.jeroo = new SquarePlanter(8);
        this.island.addObject(this.jeroo, 1, 1);
        
        this.jeroo.plantSquare();
        
        assertThat(this.jeroo.getX()).isEqualTo(1);
        assertThat(this.jeroo.getY()).isEqualTo(1);
        assertThat(this.island.countFlowers()).isEqualTo(32);
        assertThat(this.jeroo.isFacing(EAST)).isTrue();
    }
}
