import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class candyman implements ActionListener {
	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JPanel panel = new JPanel();
		frame.add(panel);
		JButton button = new JButton();
		frame.add(button);
		button.setText("Candyman");
		button.addActionListener(new candyman());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
	}

	int count = 0;

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		count = count + 1;
		if (count > 4) {
			try {
				URL url = new URL(
						"http://orig11.deviantart.net/3303/f/2013/246/b/9/b91bb7430a9dc16fbfb03babd06e397a-d6fr44b.png");
				Icon icon = new ImageIcon(url);
				JLabel imageLabel = new JLabel(icon);
				JFrame frame = new JFrame();
				frame.add(imageLabel);
				frame.setVisible(true);
				frame.pack();
				playSound();
			} catch (MalformedURLException e1) {
				e1.printStackTrace();
			}

			count = 0;
		}
	}

	static final int CREEPY = 0;
	static final int SCREAM = 1;

	public static void playSound() {
		File soundFile = null;
		int whichSound = new Random().nextInt(2);
		if (whichSound == CREEPY)
			soundFile = new File("../../Google Drive/league-sounds/creepy-noise.wav");
		else if (whichSound == SCREAM)
			soundFile = new File("../../Google Drive/league-sounds/scream.wav");
		
		System.out.println(soundFile.getAbsolutePath());
		try {
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(soundFile);
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
			Thread.sleep(3400);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}
