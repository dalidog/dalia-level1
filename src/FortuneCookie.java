import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

public class FortuneCookie implements ActionListener {
	
	String FORTUNE ="";
	public static void main(String[] args) {
		
			FortuneCookie fortune = new FortuneCookie();
			fortune.showButton();


		}

	private void showButton() {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton();
		frame.add(button);
		button.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		int random = new Random().nextInt(5);
		if(random == 1){
			FORTUNE ="You will die a horrible death!";
		}
		else if(random == 2){
			FORTUNE ="You will live to be 2,000 years old!";
		}
		else if(random == 3){
			FORTUNE ="You will have 20 dogs!";
		}
		else if(random == 4){
			FORTUNE ="You will quit your job and work as a Mcdonalds drivethrough guy!";
		}
		else if(random == 5){
			FORTUNE ="You will eat 500 donuts!";
		}
		System.out.println("I am a fortune cookie");
		
		
		System.out.println(FORTUNE);
	}
		
		
	
}
