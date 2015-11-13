package Project;

/** Copyright Wintriss Technical Schools 2013*/
import java.applet.AudioClip;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.net.URL;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * This recipe is to be used with the Jeopardy Handout: http://bit.ly/1bvnvd4
 */

public class Jeopardy implements ActionListener {
	private JButton firstButton;
	private JButton secondButton;
	private JButton thirdButton;
	private JButton fourthButton;
	private JButton fifthButton;
	private JButton sixthButton;
	private JButton seventhButton;
	public JPanel header;

	private JPanel quizPanel;
	private JPanel quizPanel2;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		quizPanel = new JPanel();
		quizPanel2 = new JPanel();
		frame.setLayout(new BorderLayout());

		/** 1. Make the frame show up */
		/** 2. Give your frame a title */
		/**
		 * 3. Create a JPanel variable to hold the header using the createHeader
		 * method
		 */
		/** 4. Add the header component to the quizPanel */
		/** 5. Add the quizPanel to the frame */
		/**
		 * 6. Use the firstButton variable to hold a button using the
		 * createButton method
		 */
		/** 7. Add the firstButton to the quizPanel */
		/**
		 * 8. Write the code inside the createButton() method below. Check that
		 * your game looks like Figure 1 in the Jeopardy Handout -
		 * http://bit.ly/1bvnvd4.
		 */
		/**
		 * 9. Use the secondButton variable to hold a button using the
		 * createButton method
		 */
		/** 10. Add the secondButton to the quizPanel */
		frame.setVisible(true);
		frame.setTitle("Jeopardy! 1 Player");
		header = createHeader("Halo Trivia");
		quizPanel.add(header);
		frame.add(quizPanel);
		firstButton = createButton("100");
		quizPanel.add(firstButton);
		secondButton = createButton("200");
		quizPanel.add(secondButton);
		thirdButton = createButton("300");
		quizPanel.add(thirdButton);
		fourthButton = createButton("400");
		quizPanel.add(fourthButton);
		fifthButton = createButton("500");
		quizPanel.add(fifthButton);
		//sixthButton = createButton("600");
		//seventhButton = createButton("700");
		/** 11. Add action listeners to the buttons (2 lines of code) */
		firstButton.addActionListener(this);
		secondButton.addActionListener(this);
		thirdButton.addActionListener(this);
		fourthButton.addActionListener(this);
		fifthButton.addActionListener(this);
		//sixthButton.addActionListener(this);
		//seventhButton.addActionListener(this);

		/** 12. Fill in the actionPerformed() method below*/

		frame.pack();
		quizPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		frame.add(makeScorePanel(), BorderLayout.NORTH);
		frame.setSize(Toolkit.getDefaultToolkit().getScreenSize().height,
				Toolkit.getDefaultToolkit().getScreenSize().width);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	/**
	 ** 13. Use the method provided to play the Jeopardy theme music
	 ** 
	 ** 14. Add buttons so that you have $200, $400, $600, $800 and $1000
	 ** questions
	 **
	 ** [optional] Use the showImage or playSound methods when the user answers a
	 ** question [optional] Add new topics for the quiz
	 **/

	private JButton createButton(String dollarAmount) {
		/** Create a new JButton */
		JButton button1 = new JButton();
		/** Set the text of the button to the dollarAmount */
		button1.setText(dollarAmount + "$");
		/** Increment the buttonCount (this should make the layout vertical) */
		buttonCount += 1;
		/** Return your new button instead of the temporary button */
		return button1;
	}

	public void actionPerformed(ActionEvent arg0) {
		/** Remove this temporary message: */
		JOptionPane.showMessageDialog(null, "Player has selected " + ((JButton) arg0.getSource()).getText() + "!");

		/** Use the method that plays the jeopardy theme music. */
		playJeopardyTheme();
		JButton buttonPressed = (JButton) arg0.getSource();
		/** If the buttonPressed was the firstButton */
		if ((JButton) arg0.getSource() == firstButton) {
			System.out.println("First Button = " + (JButton) arg0.getSource());
			askQuestion("How many Halo games are there?", "6", 100);
			firstButton.setText("Question Completed");
			firstButton.setBackground(Color.red);
			firstButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == secondButton) {
			System.out.println("Second Button = " + (JButton) arg0.getSource());
			askQuestion("What is the name of the first Halo game?", "Halo Combat Evloved", 200);
			secondButton.setText("Question Completed");
			secondButton.setBackground(Color.red);
			secondButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == thirdButton) {
			System.out.println("Third Button = " + (JButton) arg0.getSource());
			askQuestion("What is the name of the friendly Elite leader in Halo 3?", "The Arbiter", 300);
			thirdButton.setText("Question Completed");
			thirdButton.setBackground(Color.red);
			thirdButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == fourthButton) {
			System.out.println("Fourth Button = " + (JButton) arg0.getSource());
			askQuestion("What is the name of the ship Master Chief is stranded in in Halo 4?", "UNSC Forward Unto Dawn",
					400);
			fourthButton.setText("Question Completed");
			fourthButton.setBackground(Color.red);
			fourthButton.setForeground(Color.RED);
		}else if ((JButton) arg0.getSource() == fifthButton) {
			System.out.println("Fourth Button = " + (JButton) arg0.getSource());
			askQuestion("Special question! What is the designation of the assault rifle in Halo 4? List the FULL designation", "MA5D Individual Combat Weapon System",
					1000);
			fifthButton.setText("Question Completed");
			fifthButton.setBackground(Color.red);
			fifthButton.setForeground(Color.RED);
		}
		/** Call the askQuestion() method */

		/**
		 * Fill in the askQuestion() method. When you play the game, the score
		 * should change.
		 */

		/** Or if the buttonPressed was the secondButton */

		/** Call the askQuestionRecipe with a harder question */

		/** Clear the button text (set the button text to nothing) */

	}

	private void askQuestion(String question, String correctAnswer, int prizeMoney) {
		/** Remove this temporary message */
		/**
		 * JOptionPane.showMessageDialog(null, "Use correct capitalization; " +
		 * question);
		 */
		/** Use a pop up to ask the user the question */
		String Answer = JOptionPane.showInputDialog("Use correct capitalization; " + question);
		/** If the answer is correct */
		if (Answer.equals(correctAnswer)) {
			score += prizeMoney;
			updateScore(0);
			JOptionPane.showMessageDialog(null, "Correct! Your score is now " + score);
		} else {
			score -= prizeMoney;
			updateScore(0);
			JOptionPane.showMessageDialog(null, "Incorrect! Your score is now " + score);
		}
		/** Increase the score by the prizeMoney */

		/** Call the updateScore() method */

		/** Pop up a message to tell the user they were correct */

		/** Otherwise */

		/** Decrement the score by the prizeMoney */

		/** Pop up a message to tell the user the correct answer */

		/** Call the updateScore() method */

	}

	public void playJeopardyTheme() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/jeopardy.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private void playSound(String fileName) {
		AudioClip scream = JApplet.newAudioClip(getClass().getResource(fileName));
		scream.play();
	}

	private Component makeScorePanel() {
		JPanel panel = new JPanel();
		panel.add(new JLabel("score:"));
		panel.add(scoreBox);
		panel.setBackground(Color.GREEN);
		return panel;
	}

	private void updateScore(int scoreAdded) {
		scoreBox.setText(score + "$");
	}

	private JPanel createHeader(String topicName) {
		JPanel panelj = new JPanel();
		panelj.setLayout(new BoxLayout(panelj, BoxLayout.PAGE_AXIS));
		JLabel l1 = new JLabel(topicName);
		l1.setAlignmentX(Component.CENTER_ALIGNMENT);
		panelj.add(l1);
		return panelj;
	}

	void showCorrectImage() {
		showImage("correct.jpg");
	}

	void showIncorrectImage() {
		showImage("incorrect.jpg");
	}

	private void showImage(String fileName) {
		JFrame frame = new JFrame();
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		JLabel image = new JLabel(icon);
		frame.add(image);
		frame.setVisible(true);
		frame.pack();
	}
}
