import info.gridworld.actor.Bug;


public class ZBug extends Bug
{
    private int steps;
    private int sideLength;
    private boolean east;
    private boolean turned;
    private boolean complete;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public ZBug(int length)
    {
        steps = 0;
        sideLength = length;
	turn();
	turn();
	east = true;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act(){
	if (canMove() && !complete){
	    if (east && !turned){
		if(steps < sideLength){
		    move();
		    steps++;
		}
		else{
		    turn();
		    turn();
		    turn();
		    
		    steps = 0;
		    east = false;
		    
		}
	    }
	    else if(east){
		if(steps < sideLength){
		    move();
		    steps++;
		}
		else{
		    complete = true;
		}
	    }
	    else{
		if(steps < sideLength){
		    move();
		    steps++;
		}
		else{
		    turn();
		    turn();
		    turn();
		    turn();
		    turn();
		    steps = 0;
		    east = true;
		    turned = true;
		}
	    }
	}
    }
}
