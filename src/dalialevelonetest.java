import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class dalialevelonetest implements ActionListener {
private static final boolean  b= false;
String useranswer;
JTextField field;
JButton button1 ;
JButton button2;
public static void main(String[] args) {
	dalialevelonetest hi = new dalialevelonetest();
	hi.dalialevelonetest();

}
public void dalialevelonetest(){
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel("What is harder to catch the faster you run?");
	 button1 = new JButton("Submit");
	 button2 = new JButton("Hint");
	field = new JTextField(20);
	frame.setVisible(true);
	panel.add(label);
	panel.add(button1);
	panel.add(button2);
	panel.add(field);
	frame.add(panel);
	frame.pack();

	button1.addActionListener( this);
	button2.addActionListener(this);
	
}
	public void actionPerformed(ActionEvent e) {
		e.getSource();
		// TODO Auto-generated method stub
		useranswer=field.getText();
		if(e.getSource()==button1){
		if(useranswer.equals("your breath")){
			System.out.println("CORRECT");
		}
		else{
			System.out.println("WRONG");
		}

	}
		else if(e.getSource()==button2){
			System.out.println("Don't take this literally. This is a riddle.");
		}
	}
	}

