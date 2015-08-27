package Project;

import javax.swing.JOptionPane;

public class Object_Stuff {
	public static void main(String[] args) throws InterruptedException {
		String mood = JOptionPane.showInputDialog(null, "Mood?");
		int mood2 = Integer.parseInt(mood);
		String name = JOptionPane.showInputDialog(null, "Name?");
		Elaphant toby = new Elaphant(mood2, "Toby");
		toby.stomp();
		Thread.sleep(1000);
		toby.trump();
	}
}