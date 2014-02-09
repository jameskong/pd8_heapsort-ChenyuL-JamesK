import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DancingBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();
	int[] numbers = new int[5];
	numbers[0] = 6;
	numbers[1] = 1;
	numbers[2] = 4;
	numbers[3] = 5;
	numbers[4] = 2;
        DancingBug alice = new DancingBug(numbers);
        alice.setColor(Color.ORANGE);
        DancingBug bob = new DancingBug(numbers);
        world.add(new Location(7, 8), alice);
        world.add(new Location(5, 5), bob);
        world.show();
    }
}
