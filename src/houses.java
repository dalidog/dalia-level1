import java.awt.Color;
import java.lang.reflect.Method;

import org.jointheleague.graphical.robot.Robot;

public class houses{
static Robot donald;
	public static void main(String[] args) {
		
		 donald = new Robot();
		 donald.setX(100);
			donald.setY(900);
		 drawhouse(100,Color.black);
		 drawhouseflat(87, Color.red);
		 drawhouse(4, Color.orange);
		 drawhouseflat(50, Color.yellow);
		 drawhouse(1000, Color.green);
		 drawhouseflat(52, Color.blue);
		 drawhouse(865, Color.cyan);
		 drawhouseflat(46,Color.DARK_GRAY);
		 drawhouse(8, Color.PINK);

	}
public static void drawhouse(int height,Color color){
	
	donald.setSpeed(100);
	donald.penDown();
	
	donald.move(height);
	donald.turn(45);
	donald.move(50);
	donald.turn(90);
	donald.move(50);
	donald.turn(45);
	donald.move(height);
	donald.turn(270);
	donald.setPenColor(Color.magenta);
	donald.move(50);
	donald.turn(270);
	donald.setPenColor(color);}

public static void drawhouseflat(int height,Color color){
	
	donald.setSpeed(100);
	donald.penDown();
	
	donald.move(height);
	donald.turn(90);
	donald.move(50);
	donald.turn(90);
	donald.move(height);
	donald.turn(270);
	donald.setPenColor(Color.magenta);
	donald.move(50);
	donald.turn(270);
	donald.setPenColor(color);}


}
