import student.micro.lightbot.*;

//-------------------------------------------------------------------------
/**
 *  Two castles, to demonstrate polymorphism through TurretBot.
 *
 *  @author Stephen Edwards
 *  @version 2021.08.31
 */
public class Castle
    extends Level
{
    //~ Constructor ...........................................................

    // ----------------------------------------------------------
    /**
     * Creates a new Castle object.
     */
    public Castle()
    {
        super(12, 8);

        this.addObject(new Block(), 1, 2);
        this.addObject(new Block(), 2, 2);
        this.addObject(new Block(), 3, 2);
        this.addObject(new Block(), 3, 3);
        this.addObject(new Block(), 3, 4);
        this.addObject(new Block(), 2, 4);
        this.addObject(new Block(), 1, 4);
        this.addObject(new Block(), 1, 3);

        this.addObject(new Block(), 6, 1);
        this.addObject(new Block(), 7, 2);
        this.addObject(new Block(), 8, 2);
        this.addObject(new Block(), 9, 2);
        this.addObject(new Block(), 10, 1);
        this.addObject(new Block(), 9, 3);
        this.addObject(new Block(), 9, 4);
        this.addObject(new Block(), 10, 5);
        this.addObject(new Block(), 8, 4);
        this.addObject(new Block(), 7, 4);
        this.addObject(new Block(), 7, 3);
        this.addObject(new Block(), 6, 5);

    }
    
    public void myProgram()
    {
        PatrolBot bot1 = new PatrolBot();
        this.addObject(bot1, 1, 1);

        TurretBot bot2 = new TurretBot();
        this.addObject(bot2, 7, 1);

        bot1.patrolCastle();
        bot2.patrolCastle();
    }
}
