import java.applet.AudioClip;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JApplet;
import javax.swing.JFrame;


public class sensitiveKeyboard implements KeyListener{
JFrame frame = new JFrame();

public static void main(String[] args) {
	sensitiveKeyboard keyboard=new sensitiveKeyboard();

}
	public sensitiveKeyboard() {
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.addKeyListener(this);
		// TODO Auto-generated constructor stub
	frame.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		playSound("323703__reitanna__funny-yay.wav");
	//	if(e.getKeyCode()==KeyEvent.VK_)
	}


	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	private void playSound(String fileName) {
	   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
	   	 sound.play();
	    }


}
