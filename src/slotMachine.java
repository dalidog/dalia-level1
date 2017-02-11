

import java.util.Random;

import javax.swing.JOptionPane;

public class slotMachine {
public static void main(String[] args) {
	String useranswer = JOptionPane.showInputDialog("How much money do you want to put into this rigged thing?");
int amount= Integer.parseInt(useranswer);
	Random spinner = new Random();
	int thing =spinner.nextInt(3);
	int thing2 = spinner.nextInt(3);
	int thing3 = spinner.nextInt(3);
	if(thing+thing2+thing3 == 6){
		JOptionPane.showMessageDialog(null, "You get " + amount *2 + " dollars!");
	}
	else if (thing+thing2+thing3 == 3){
		JOptionPane.showMessageDialog(null, "You get " + amount  + " dollars!");
	}
	else if (thing+thing2+thing3 == 0){
		JOptionPane.showMessageDialog(null, "You get 0 dollars!");
	}
}
}
