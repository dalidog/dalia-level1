import java.awt.Color;

import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

public class gridWorld {
	public static void main(String[] args) {
		World world = new World();
		world.show();
		Bug bug = new Bug(Color.MAGENTA);

	world.add(new Location(1,8), bug);

		
	}

}
