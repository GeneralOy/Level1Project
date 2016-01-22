package Project;


import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
	JFrame mainFrame = new JFrame();
	JPanel mainPanel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();
	public static void main(String[] args) {
		new ChuckleClicker().Buttons();
	}
	public void Buttons(/*String buttonName*/){
		//mainFrame.setLayout(null);
		mainFrame.add(mainPanel);
		mainPanel.add(button1);
		mainPanel.add(button2);
		mainFrame.show();
		mainFrame.pack();
		mainFrame.setSize(250, 100);
		button1.setText("Joke");
		button2.setText("Punchline");
		button1.addActionListener(this);
		button2.addActionListener(this);
		//button1.setName("" + buttonName);
		JOptionPane.showMessageDialog(null, "HI");
	}
	@Override
	public void actionPerformed(ActionEvent Action) {
		if(Action.getSource() == button1){
			System.out.println("What is the meaning of life?");
		}else if(Action.getSource() == button2){
			System.out.println("Click Here; https://www.youtube.com/watch?v=o-nrYTNjxpg");
		}
	}
	
}
