import student.micro.lightbot.*;

public class PatrolBot
    extends LightBot
{
    public PatrolBot()
    {
        super();
    }


    public void patrolCastle()
    {
        this.patrolOneWall();
        this.patrolOneWall();
        this.patrolOneWall();
        this.patrolOneWall();
    }


    public void patrolOneWall()
    {
        this.patrolStraight();
        this.patrolCorner();
    }
    
    public void patrolStraight()
    {
        this.move();
        this.move();
    }
    
    public void patrolCorner() 
    {    
        this.move();
        this.turnRight();
        this.move();
    }
}
