package Project;

import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter {
	public static void main(String[] args) {
		// Text Fields
		JTextField answer = new JTextField(20);
		JTextField question = new JTextField(20);
		// Frame
		JFrame mainFrame = new JFrame();
		mainFrame.show();
		// Button
		JButton convert = new JButton();
		convert.setText("Convert");
		// Panels 3 2 1
		// JPanel panel1 = new JPanel();
		// JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		mainFrame.add(panel3);
		panel3.add(question);
		panel3.add(convert);
		panel3.add(answer);
		mainFrame.pack();
	}

	int convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		if (!Pattern.matches("\2", binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

}
