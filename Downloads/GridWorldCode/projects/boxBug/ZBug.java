import info.gridworld.actor.Bug;

public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private int totalsteps;

    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	totalsteps = sideLength * 3;
    }

    public void act()
    {
	if (!canMove()){}
	else{
	if (steps < sideLength){
	    move();
	    steps++;
	}
	else if (steps < (sideLength * 2)){
	    move();
	    steps++;
	}
	else if (steps < totalsteps){
	    move();
	    steps++;
	}
	if (steps == sideLength){
	    turn();
	    turn();
	    turn();
	}
	
	if (steps == sideLength * 2) {
	    turn();
	    turn();
	    turn();
	    turn();
	    turn();
	}
	}
    }
}
