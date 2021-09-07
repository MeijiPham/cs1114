import student.micro.jeroo.*;
//-------------------------------------------------------------------------
/**
 * 
 * // Virginia Tech Honor Code Pledge:
 * As a Hokie, I will conduct myself with honor and integrity at all times.
 * I will not lie, cheat, or steal, nor will I accept the actions of those
 * who do.
 * -- Meiji Pham (meijipham0601)
 * 
 *  This class will add a jeroo to the island and have it collect all the
 *  flowers. It uses a method from `Scavenger` to do so.
 *
 *  @author Meiji (meijipham0601)
 *  @version 2021.09.03
 */
public class ScavengerHunt
    extends LongIsland
{
    //~ Fields ................................................................



    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created ScavengerHunt object.
     */
    public ScavengerHunt()
    {
        // Specify your world size here
        super();
    }


    //~ Methods ...............................................................
    /** 
     * Adds jeroo to the specified coordinates and have it collect all
     * the flowers on the island
     */ 
    public void myProgram() 
    {
        Scavenger tom = new Scavenger();
        this.addObject(tom, 2, 1);
        tom.collectFlowers();
    }
}
