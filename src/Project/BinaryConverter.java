package Project;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	// Text Fields
	JTextField answer = new JTextField(20);
	JTextField question = new JTextField(20);
	String questionString;
	// Frame
	JFrame mainFrame = new JFrame();
	// Button
	JButton convert = new JButton();
	// Panels 3 2 1
	// JPanel panel1 = new JPanel();
	// JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();

	public static void main(String[] args) {
		BinaryConverter main = new BinaryConverter();
		main.Start();
	}

	public void Start() {
		// Frame
		mainFrame.show();
		// Button
		convert.addActionListener(this);
		convert.setText("Convert");
		// Panels 3 2 1
		mainFrame.add(panel3);
		panel3.add(question);
		panel3.add(convert);
		panel3.add(answer);
		mainFrame.pack();
	}

	char convert(String binary) {
		if (binary.length() != 8) {
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return 0;
		}
		try {
			int asciiValue = Integer.parseInt(binary, 2);
			return (char) asciiValue;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			// question.setText("");
			return 0;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		questionString = question.getText();
		char Converted = convert(questionString);
		String fullConvert = Character.toString(Converted);
		answer.setText(fullConvert);

	}

}