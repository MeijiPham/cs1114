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
        for (int i = 0; i < 4; i++) 
        {
            this.patrolOneWall();
        }
    }
    
    public void patrolOneWall() 
    {
        for (int i = 0; i < 4; i++) {
            this.move();
        }
        this.turnRight();
    }
}
