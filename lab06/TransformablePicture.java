import student.media.*;

//-------------------------------------------------------------------------
// Virginia Tech Honor Code Pledge:
//
// As a Hokie, I will conduct myself with honor and integrity at all times.
// I will not lie, cheat, or steal, nor will I accept the actions of those
// who do.
// -- Meiji Pham meijipham0601
/**
 *  A picture that supports basic color transformations for Lab 06.
 *
 *  @author Meiji Pham meijipham0601
 *  @version 2021.09.30
 */
public class TransformablePicture
    extends Picture
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Initializes a newly created TransformablePicture object as a copy
     * of another image.
     * @param original The image that will be copied and modified
     */
    public TransformablePicture(Picture original)
    {
        super(original);
    }


    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Turns the red intensity of every pixel in this image up to
     * the maximum value.
     */
    public void maxRed()
    {
        for (Pixel pix : this.getPixels()) 
        {
            pix.setRed(255);
        }
    }
    /**
     * Turns the green intensity of every pixel in this image up to
     * the maximum value.
     */
    public void maxGreen() 
    {
        for (Pixel pix : this.getPixels()) 
        {
            pix.setGreen(255);
        }
    }
    /**
     * Turns the blue intensity of every pixel in this image up to
     * the maximum value.
     */
    public void maxBlue() 
    {
        for (Pixel pix : this.getPixels()) 
        {
            pix.setBlue(255);
        }
    }
    /**
     * Turns the intensity of every pixel in this image by a certain value
     * @param amount Amount that will be added to each pixel to either 
     *               increase or decrease the brightness
     */
    public void brighten(int amount) 
    {
        for (Pixel pix : this.getPixels()) 
        {
            pix.setBlue(pix.getBlue() + amount);
            pix.setGreen(pix.getGreen() + amount);
            pix.setRed(pix.getRed() + amount);
        }
    }
}
