package Project;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TypingGame implements KeyListener {
	JFrame frame = new JFrame();
	JButton button1 = new JButton();
	JPanel panel1 = new JPanel();
	// JPanel panel2 = new JPanel();
	JLabel label2 = new JLabel();
	JLabel label1 = new JLabel();
	char currentLetterA = generateRandomLetter();
	String currentLetterB = String.valueOf(currentLetterA);

	public static void main(String[] args) {
		TypingGame Game = new TypingGame();
	}

	public TypingGame() {
		// System.out.println("hi");
		frame.add(panel1);
		panel1.add(label1);
		panel1.add(label2);
		frame.show();
		frame.setSize(500, 500);
		frame.addKeyListener(this);
		label1.setText("TYPE:" + currentLetterB);
		label1.setFont(label1.getFont().deriveFont(28.0f));
		label1.setHorizontalAlignment(JLabel.CENTER);

	}

	char generateRandomLetter() {
		Random r = new Random();
		return (char) (r.nextInt(26) + 'a');
	}

	@Override
	public void keyTyped(KeyEvent e) {

	}

	@Override
	public void keyPressed(KeyEvent e) {
		char keyTypedA = e.getKeyChar();
		String keyTypedB = String.valueOf(keyTypedA);
		label2.setText("   You typed:" + keyTypedB);
		label2.setFont(label2.getFont().deriveFont(28.0f));
		label2.setHorizontalAlignment(JLabel.CENTER);
	}

	@Override
	public void keyReleased(KeyEvent e) {
		char currentLetterA = generateRandomLetter();
		String currentLetterB = String.valueOf(currentLetterA);
		label1.setText(currentLetterB);
	}

}
