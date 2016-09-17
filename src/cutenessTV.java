import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class cutenessTV implements ActionListener {
	public static void main(String[] args) {
		cutenessTV TV = new cutenessTV();
		TV.run();

	}
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	JButton button3 = new JButton();
	void run(){
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		
		button1.addActionListener(this);
		
		button2.addActionListener(this);
		
		button3.addActionListener(this);
		button1.setText("Ducks");
		button2.setText("Frog");
	button3.setText("Fluffy Unicorns");
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		frame.add(panel);
		frame.pack();
		frame.setSize(500, 500);
		frame.setVisible(true);
	}
	
	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}
	
	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
	URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(button1 == e.getSource()){
			showDucks();
		}
		if(button2 == e.getSource()){
			showFrog();
		}
		if(button3 == e.getSource()){
			showFluffyUnicorns();
		}
		
		// TODO Auto-generated method stub
		
	}
}
