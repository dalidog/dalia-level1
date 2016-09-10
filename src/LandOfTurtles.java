
import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://s-media-cache-ak0.pinimg.com/736x/25/cb/e2/25cbe2a3036c8bc21e4746bf59978e65.jpg";

// 1. Create a frame & make it visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// 2. Add the panel to the frame
		//JPanel panel1 = new JPanel();
		frame.add(panel);
		frame.pack();
		// 3. Set the background image of the panel to the Galapagos Islands 
		panel.setBackgroundImage("https://s-media-cache-ak0.pinimg.com/736x/25/cb/e2/25cbe2a3036c8bc21e4746bf59978e65.jpg");
		
		// 4. Instantiate a Turtle 
// 5. Add the turtle to the panel
Random xposition = new Random();
xposition.nextInt(528);
Random yposition = new Random();
yposition.nextInt(736);

for (int i = 0; i < 51; i++) {
	Turtle turtle = new Turtle();

	int xpos = xposition.nextInt(528);
	int ypos = yposition.nextInt(736);
		panel.addTurtle(turtle);
		turtle.setX(xpos);
		turtle.setY(ypos);
}
		// 6. Put 50 Turtles on the beach

	}
}



