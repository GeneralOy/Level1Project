package Project;

import javax.swing.JOptionPane;

public class MemeCity {
	public static void main(String[] args) {
		String words = JOptionPane.showInputDialog("What would you like Dodge to say?");
		String words2 = JOptionPane.showInputDialog("What would you like Doge to say?");
		Doge Dodge = new Doge(270, "Woof! Doge says " + words + "!", 11);
		Doge Doge = new Doge(270, "Woof! Doge says " + words2 + "! Woof!", 11);
		Dodge.Bark();
		Doge.Bark();
		Elaphant Mouse = new Elaphant(21, "Foos");
		Mouse.stomp();
		Mouse.trump();
	}
}