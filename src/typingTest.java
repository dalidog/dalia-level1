import java.awt.List;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import javax.swing.JOptionPane;

public class typingTest {
	public static void main(String[] args) {
ArrayList<String>Words=new ArrayList<String>();
Words.add("hi");
Words.add("Otorhinolaryngologist");
Words.add("hippopotomonstrosesquipedaliophobia");
Words.add("circumlocution");
Words.add("commensurate");
Words.add("interlocutor");
Words.add("legerdemain");
Words.add("maelstrom");
Words.add("multifarious");
Words.add("pertinacious");
Words.add("pulchritude");
long startTime = System.nanoTime();
for (String string : Words) {
	String userAnswer = "";
while(!userAnswer.equals(string)){
	userAnswer = JOptionPane.showInputDialog(string +": Type the word!");
}
}
long endTime = System.nanoTime();
long CSeconds = TimeUnit.NANOSECONDS.toSeconds(endTime-startTime);
System.out.println("You took " + CSeconds + " seconds");
}}
