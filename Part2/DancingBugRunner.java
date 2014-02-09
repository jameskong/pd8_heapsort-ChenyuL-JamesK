import info.gridworld.actor.ActorWorld;
import info.gridworld.grid.Location;

import java.awt.Color;
public class DancingBugRunner
{
    public static void main(String[] args)
    {
	int[]lengths = {1,2,3,4};
        ActorWorld world = new ActorWorld();
        DancingBug alice = new DancingBug(lengths);
        alice.setColor(Color.ORANGE);
        world.add(new Location(2, 2), alice);
        world.show();
    }
}
