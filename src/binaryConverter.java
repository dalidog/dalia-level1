import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class binaryConverter implements ActionListener {
	JTextField question = new JTextField(20);
	 JTextField answer = new JTextField(20);
	public static void main(String[] args) {
		binaryConverter binary = new binaryConverter();
		binary.run();
	
	}
 String convert(String binary) {
	 
   	 int asciiValue = Integer.parseInt(binary, 2);
   	 char theLetter = (char) asciiValue;
   	 return "" + theLetter;
    }
 void run(){
	 JFrame frame = new JFrame();
		JPanel panel = new JPanel();
frame.add(panel);
frame.setVisible(true);
JButton button = new JButton();



button.addActionListener(this);

panel.add(question);
panel.add(button);

panel.add(answer);
frame.pack();
 }
@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
answer.setText(convert(question.getText()));
}

}

