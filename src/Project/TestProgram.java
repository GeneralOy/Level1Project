package Project;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestProgram {

public static void main(String[] args) {
	TestProgram test = new TestProgram();
}
public TestProgram(){
	JFrame mainFrame = new JFrame();
	JPanel p1 = new JPanel();
	JButton b1 = new JButton();
	JButton b2 = new JButton();
	JTextField field1 = new JTextField();
	JPanel p2 = new JPanel();
	JLabel label1 = new JLabel();
	mainFrame.add(p1);
	p1.add(label1);
	p2.add(b1);
	p2.add(b2);
	mainFrame.add(field1);
	mainFrame.add(p2);
	mainFrame.show();
	mainFrame.setSize(500, 500);
	field1.setSize(250,100);
}
}
