import info.gridworld.actor.Bug;


public class DancingBug extends Bug
{
    private int steps;
    private int[] timetoturn;
    private int i = 0;
    private int j = 0;
    
    public DancingBug(int[] number)
    {
        timetoturn = number;
    }

    public void act(){
	if (j < timetoturn[i]){
	    turn();
	    j++;
	}
	else {
	    j = 0;
	    i++;
	    move();
	}
	if (i == timetoturn.length)
	    i = 0;
    }
}

