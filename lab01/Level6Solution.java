import student.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Level 6, together with its solution using a single Light-Bot.
 *
 * @author Meiji Pham
 * @version 2021.08.26
 */
public class Level6Solution
  extends Level6
{
    //~ Methods ...............................................................

    // ----------------------------------------------------------
    /**
     * Adds a bot to the world and gives it actions to move to
     * all the blue tiles and light them up
     */
    public void myProgram()
    {
        LightBot cal = new LightBot();
        this.addObject(cal, 2, 6);
        // First tile
        cal.turnLeft();
        cal.move();
        cal.jump();
        cal.jump();
        cal.turnRight();
        cal.jump();
        cal.jump();
        cal.turnLightOn();
        // Second tile
        cal.jump();
        cal.turnRight();
        for (int i = 0; i < 3; i++) {
            cal.move();
        }
        cal.turnLightOn();
        // Third tile
        cal.turnRight();
        cal.turnRight();
        for (int i = 0; i < 6; i++) {
            cal.move();
        }
        cal.turnLightOn();
    }
}
