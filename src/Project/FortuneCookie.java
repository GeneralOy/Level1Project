package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JFrame Frame1 = new JFrame();
	JButton Button1 = new JButton();

	public static void main(String[] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
	}

	public void showButton() {
		Button1.addActionListener(this);
		Frame1.setVisible(true);
		Frame1.add(Button1);
		Frame1.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int random = new Random().nextInt(6);
		if (random == 0) {
			JOptionPane.showMessageDialog(null, "You will be beaten by a hippo.");
		} else if (random == 1) {
			JOptionPane.showMessageDialog(null,
					"Life consists not in holding good cards, but in playing those you hold well.");
		} else if (random == 2) {
			JOptionPane.showMessageDialog(null, "If everyone is a worm you should be a glow worm.");
		} else if (random == 3) {
			JOptionPane.showMessageDialog(null, "Meet your opponent half way. You need the exercise.");
		} else if (random == 4) {
			JOptionPane.showMessageDialog(null,
					"Don't fight fire with fire, because when fire and water go to war, water always wins.");
		} else if (random == 4) {
			JOptionPane.showMessageDialog(null,
					"A journey of a thousand miles begins with a single step");
		}

	}
}
