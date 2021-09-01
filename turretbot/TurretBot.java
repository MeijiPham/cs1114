import student.micro.lightbot.*;

public class TurretBot
    extends PatrolBot
{
    public TurretBot()
    {
        super();
    }
    
    public void patrolCorner() 
    {    
        this.turnLeft();
        
        for (int i = 0; i < 3; i++) {
            super.patrolCorner();
        }
        
        this.turnLeft();
    }
}
