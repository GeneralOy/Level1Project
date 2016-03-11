package Project;

import javax.swing.JOptionPane;

public class Name {
	public void main(String[] args) {
		String Like = JOptionPane.showInputDialog("What do you like?");
		String MainHeight;
		JOptionPane.showMessageDialog(null, "I like" + Like);
		JOptionPane.showMessageDialog(null, "Geeks rule!");
		MainHeight = JOptionPane.showInputDialog("What height did the mouse jump?");
		Jump(MainHeight);
	}

	public void Jump(String height) {
		int Height = Integer.parseInt(height);
		if (Height > 0 && Height < 21) {
			JOptionPane.showMessageDialog(null, "The mouse jumped over the candlestick");
		} else if (Height > 20 && Height < 610) {
			JOptionPane.showMessageDialog(null, "The mouse jumped over the Trump");
		} else if (Height > 609) {
			JOptionPane.showMessageDialog(null, "The mouse jumped over the Moon");
		} else {
			JOptionPane.showMessageDialog(null, "But did the mouse really jump that?");
		}
	}
}
