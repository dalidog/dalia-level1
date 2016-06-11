import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class celebrityBodyPartGuessingGame {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	String firstImage = "/users/league/desktop/prince.jpg";
	String secondImage = "/users/league/desktop/adele.jpg";
	String thirdImage = "user/league/desktop/justin.jpg";

	Frame window = new Frame();
	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
			window.setSize(124,94);
		// Make an int variable to hold the score.
int score=0;
JOptionPane.showMessageDialog(null, "Enter the first name of the celebrity that the question is about.");
		// Ask the user who this person is and store their answer
String prince=JOptionPane.showInputDialog("Who owns these stylish sunglasses?");
		// If they got the answer right:
if(prince.equals("prince")){
	JOptionPane.showMessageDialog(null, "YES!");
	score=score+1;
}

else{
	JOptionPane.showMessageDialog(null,"NO! The answer was prince");
}
JOptionPane.showMessageDialog(null, score);
showNextImage();
	String adele=JOptionPane.showInputDialog("Who's eye is this? (way too much eyeliner)");
	if(adele.equals("adele")){
		JOptionPane.showMessageDialog(null, "YES!");
		score=score+1;
	}
	else{
		JOptionPane.showMessageDialog(null, "NO! The answer was adele.");
	}
	JOptionPane.showMessageDialog(null,score);
	}
	
		// -- Tell them they are correct.
		// -- Increase the score by 1

		// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next image
		// Show the score
		// .... repeat for all your images.....
	

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		celebrityBodyPartGuessingGame quiz = new celebrityBodyPartGuessingGame();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}


