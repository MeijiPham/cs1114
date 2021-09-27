import student.micro.jeroo.*;
//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Meiji Pham (meijipham0601)
/**
 *  This class is designed for the jeroo to plant a square of flowers using
 *  the initial value of flowers it was given.
 *
 *  @author Meiji Pham meijipham0601
 *  @version 2021.09.24
 */
public class SquarePlanter
    extends Jeroo
{
    //~ Fields ................................................................
    private int flowersPerSide;


    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created SquarePlanter object.
     * @param flowersPerSide Number of flowers to use on one side of square
     */
    public SquarePlanter(int flowersPerSide)
    {
        super(flowersPerSide * 4);
        this.flowersPerSide = flowersPerSide;
        /*# Do any work to initialize your class here. */
    }


    //~ Methods ...............................................................
    /**
     * This method allows the jeroo to plant a square of flowers.
     */
    public void plantSquare() 
    {
        this.plant();
        for (int i = 0; i < 4; i++) 
        {
            this.plantOneSide();
            this.turn(RIGHT);
        }
    }
    /**
     * This method tells the jeroo to plant one side of the square.
     */
    public void plantOneSide() 
    {
        for (int i = 0; i < this.flowersPerSide; i++)
        {
            this.hop();
            this.plant();
        }
    }
}
