package Project;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class Buttons implements ActionListener {
	private JFrame frame = new JFrame();
	Dimension LARGE = new Dimension(50, 100);
	Dimension SMALL = new Dimension(25, 50);
	public  String TapMe = "Tap me again!";
	public  String TapMeInstead = "Tap Me Instead!";
	public  String TapMeAgain = "Tap Me Again!";
	private JPanel mainPanel = new JPanel();
	private JButton nastyButton = new JButton();
	private JButton goodButton = new JButton();
	public static void main(String[] args) {
		Buttons button1 = new Buttons();
		button1.start();
	}
	public void start() {
		frame.add(mainPanel);
		frame.setVisible(true);
		mainPanel.setLayout(new GridLayout(1,2));
		mainPanel.add(nastyButton); 
		nastyButton.setText(TapMe);
		nastyButton.addActionListener(this);
		mainPanel.add(goodButton);
		goodButton.setText(TapMeInstead);
		goodButton.addActionListener(this);
		frame.pack();
		frame.setSize(500, 500);
	}
	public void actionPerformed(ActionEvent a) {
		if(a.getSource() == nastyButton){
			nastyButton.setText(TapMeAgain);
			nastyButton.setPreferredSize(LARGE);
			goodButton.setText(TapMeInstead);
			goodButton.setPreferredSize(SMALL);
			frame.pack();
		}else if(a.getSource() == goodButton){
			goodButton.setText(TapMeAgain);
			goodButton.setPreferredSize(LARGE);
			nastyButton.setText(TapMeInstead);
			nastyButton.setPreferredSize(SMALL);
			frame.pack();
		}
		
	}
	
}
