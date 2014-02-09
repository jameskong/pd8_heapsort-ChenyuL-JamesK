import info.gridworld.actor.Bug;


public class DancingBug extends Bug
{
    private int steps;
    private int[] sideLengths;

    /**
     * Constructs a box bug that traces a square of a given side length
     * @param length the side length
     */
    public DancingBug(int[] lengths)
    {
        steps = 0;
        sideLengths = lengths;
    }

    /**
     * Moves to the next location of the square.
     */
    public void act()
    {
        if (steps < sideLengths.length){
	    for(int i = 1; i <= sideLengths[steps]; i++){
		turn();
	    }
	    move();
            steps++;
        }
        else{
	    steps = 0;
	    act();
        }
    }

}
