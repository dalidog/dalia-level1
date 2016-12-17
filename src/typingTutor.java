import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class typingTutor implements KeyListener {
	 char currentLetter;
	JFrame frame=new JFrame("Typing Game!!!");;
	JPanel panel=new JPanel();
	JLabel label= new JLabel();
	static char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

public static void main(String[] args) {
	typingTutor typingTutor = new typingTutor();
	typingTutor.run();
	
}
	public typingTutor() {
		// TODO Auto-generated constructor stub
	}
public  void run(){
	frame.setSize(500, 500);
	currentLetter = generateRandomLetter();
	frame.addKeyListener(this);
	frame.add(panel);
	label.setText(currentLetter + "");
	panel.add(label);
	frame.setVisible(true);
	label.setFont(label.getFont().deriveFont(250.0f));
	label.setHorizontalAlignment(label.CENTER);	
}


	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char userAnswer = e.getKeyChar();
		System.out.println("You typed: " +userAnswer);
		if(userAnswer == currentLetter){
			System.out.println("correct!");
		}
		}
	

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		currentLetter = generateRandomLetter();
		label.setText(currentLetter + "");
	}

}
