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
 *  This test class tests the methods in the FlowerPicker class. It will test
 *  if the jeroo is picking a row of flower, picking 2 rows of flowers,
 *  and turning right correctly.
 *
 *  @author Meiji Pham meijipham0601
 *  @version 2021.09.15
 */
public class FlowerPickerTest
    extends TestCase
{
    //~ Fields ................................................................


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new FlowerPickerTest test object.
     */
    public FlowerPickerTest()
    {
        // The constructor is usually empty in unit tests, since it runs
        // once for the whole class, not once for each test method.
        // Per-test initialization should be placed in setUp() instead.
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------

    // ----------------------------------------------------------
    /*# Insert your own test methods here */
    /**
     * Test the pickLine() method on flower patch A's northwest corner.
     */
    public void testPickLine()
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 2);
        // 2. Call the method(s) you are testing
        picker.pickLine();
        // 3. Make assertions capturing your expected outcomes
        // The jeroo should end at (6, 2), so check the x coordinate
        assertThat(picker.getX()).isEqualTo(6);
        assertThat(picker.getY()).isEqualTo(2);
        assertThat(picker.isFacing(EAST)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(5);
        assertThat(island.countFlowers()).isEqualTo(37);
    }
    /**
     * Test the pickLine() method on flower patch E
     */
    public void testPickLineE() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 10, 8);
        // 2. Call the method(s) you are testing
        picker.turn(RIGHT);
        picker.pickLine();
        // 3. Make assertions capturing your expected outcomes
        // The jeroo should end at (10, 10), so check the x coordinate
        assertThat(picker.getX()).isEqualTo(10);
        assertThat(picker.getY()).isEqualTo(10);
        assertThat(picker.isFacing(SOUTH)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(3);
        assertThat(island.countFlowers()).isEqualTo(39);
    }
    /**
     * Test the turnAroundRight() method starting at the position
     * (2, 2) facing east
     */
    public void testTurnAroundRight() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 2);
        // 2. Call the method(s) you are testing
        picker.turnAroundRight();
        // 3. Make assertions capturing your expected outcomes
        assertThat(picker.getX()).isEqualTo(2);
        assertThat(picker.getY()).isEqualTo(3);
        assertThat(picker.isFacing(WEST)).isTrue();
    }
    /**
     * Test pick2Lines() method for A
     */
    public void testPick2LinesA() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 2);
        // 2. Call the method(s) you are testing
        picker.pick2Lines();
        // 3. Make assertions capturing your expected outcomes
        assertThat(picker.getX()).isEqualTo(2);
        assertThat(picker.getY()).isEqualTo(3);
        assertThat(picker.isFacing(WEST)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(10);
        assertThat(island.countFlowers()).isEqualTo(32);
    }
    /**
     * Test pick2Lines() method for B
     */
    public void testPick2LinesB() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 2, 5);
        // 2. Call the method(s) you are testing
        picker.pick2Lines();
        // 3. Make assertions capturing your expected outcomes
        assertThat(picker.getX()).isEqualTo(2);
        assertThat(picker.getY()).isEqualTo(6);
        assertThat(picker.isFacing(WEST)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(8);
        assertThat(island.countFlowers()).isEqualTo(34);
    }
    /**
     * Test pick2Lines() method for C
     */
    public void testPick2LinesC() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 6, 9);
        // 2. Call the method(s) you are testing
        picker.pick2Lines();
        // 3. Make assertions capturing your expected outcomes
        assertThat(picker.getX()).isEqualTo(7);
        assertThat(picker.getY()).isEqualTo(10);
        assertThat(picker.isFacing(WEST)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(3);
        assertThat(island.countFlowers()).isEqualTo(39);
    }
    /**
     * Test pick2Lines() method for D
     */
    public void testPick2LinesD() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 9, 2);
        // 2. Call the method(s) you are testing
        picker.turn(RIGHT);
        picker.pick2Lines();
        // 3. Make assertions capturing your expected outcomes
        // The jeroo should end at (10, 10), so check the x coordinate
        assertThat(picker.getX()).isEqualTo(8);
        assertThat(picker.getY()).isEqualTo(3);
        assertThat(picker.isFacing(NORTH)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(7);
        assertThat(island.countFlowers()).isEqualTo(35);
    }
    /**
     * Test pick2Lines() method for E
     */
    public void testPick2LinesE() 
    {
        // 1. Set up initial conditions
        Island island = new Lab04Island();
        FlowerPicker picker = new FlowerPicker();
        island.addObject(picker, 10, 8);
        // 2. Call the method(s) you are testing
        picker.turn(RIGHT);
        picker.pick2Lines();
        // 3. Make assertions capturing your expected outcomes
        // The jeroo should end at (10, 10), so check the x coordinate
        assertThat(picker.getX()).isEqualTo(9);
        assertThat(picker.getY()).isEqualTo(8);
        assertThat(picker.isFacing(NORTH)).isTrue();
        assertThat(picker.getFlowers()).isEqualTo(6);
        assertThat(island.countFlowers()).isEqualTo(36);
    }
}
