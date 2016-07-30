import org.jointheleague.graphical.robot.Robot;

public class houses{
	public static void main(String[] args) {
		Robot donald = new Robot();
		donald.setX(10);
		donald.setY(900);
		donald.penDown();
		donald.move(700);
		donald.turn(90);
		donald.move(300);
		donald.turn(90);
		donald.move(700);
		donald.turn(270);
		donald.setPenColor(0,255,0);
		donald.move(300);


	}
}

