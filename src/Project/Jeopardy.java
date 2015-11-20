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
	private JButton firstButton2;
	private JButton secondButton2;
	private JButton thirdButton2;
	private JButton fourthButton2;
	private JButton fifthButton2;
	// private JButton sixthButton;
	// private JButton seventhButton;
	public JPanel header;
	public JPanel header2;

	private JPanel HaloPanel;
	private JPanel quizPanel2;
	private JPanel mainPanel;
	int score = 0;
	JLabel scoreBox = new JLabel("0");
	int buttonCount = 0;

	public static void main(String[] args) {
		new Jeopardy().start();
	}

	private void start() {
		JFrame frame = new JFrame();
		HaloPanel = new JPanel();
		quizPanel2 = new JPanel();
		mainPanel = new JPanel();
		frame.setLayout(new BorderLayout());
		frame.add(mainPanel);
		mainPanel.setLayout(new GridLayout(1, 2));
		mainPanel.add(HaloPanel, 0);
		mainPanel.add(quizPanel2, 1);
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
		frame.setTitle("Video Game Jeopardy!");
		header = createHeader("Halo Trivia");
		HaloPanel.add(header);
		firstButton = createButton("100");
		HaloPanel.add(firstButton);
		secondButton = createButton("200");
		HaloPanel.add(secondButton);
		thirdButton = createButton("300");
		HaloPanel.add(thirdButton);
		fourthButton = createButton("400");
		HaloPanel.add(fourthButton);
		fifthButton = createButton("500");
		HaloPanel.add(fifthButton);
		//HaloPanel.setBackground(Color.RED);
		header2 = createHeader("Minecraft Trivia");
		quizPanel2.add(header2);
		mainPanel.add(HaloPanel, 0);
		firstButton2 = createButton("100");
		quizPanel2.add(firstButton2);
		secondButton2 = createButton("200");
		quizPanel2.add(secondButton2);
		thirdButton2 = createButton("300");
		quizPanel2.add(thirdButton2);
		fourthButton2 = createButton("400");
		quizPanel2.add(fourthButton2);
		fifthButton2 = createButton("500");
		quizPanel2.add(fifthButton2);
		/** 11. Add action listeners to the buttons (2 lines of code) */
		//quizPanel2.setBackground(Color.BLUE);
		/** 12. Fill in the actionPerformed() method below */

		frame.pack();
		HaloPanel.setLayout(new GridLayout(buttonCount + 1, 3));
		quizPanel2.setLayout(new GridLayout(buttonCount + 1, 3));
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
		button1.addActionListener(this);
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
		} else if ((JButton) arg0.getSource() == fifthButton) {
			System.out.println("Fourth Button = " + (JButton) arg0.getSource());
			// askQuestion("Special question! What is the name of the assault
			// rifle in Halo 4?", "MA5D Assault Rifle",1000);
			askQuestion(
					"Special question! What is the name of the only other playable Spartan character before Halo 5?",
					"Noble 6", 1000);
			fifthButton.setText("Question Completed");
			fifthButton.setBackground(Color.red);
			fifthButton.setForeground(Color.RED);
		} else if ((JButton) arg0
				.getSource() == firstButton2) { /**
												 * Questions on second panel
												 * start here
												 **/
			System.out.println("First Button = " + (JButton) arg0.getSource());
			askQuestion("What is the most basic enemy in Minecraft?", "Zombie", 100);
			firstButton.setText("Question Completed");
			firstButton.setBackground(Color.red);
			firstButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == secondButton) {
			System.out.println("Second Button = " + (JButton) arg0.getSource());
			askQuestion("What are the two bosses in Minecraft? Name them alphabetically", "Ender Dragon, The Wither",
					200);
			secondButton.setText("Question Completed");
			secondButton.setBackground(Color.red);
			secondButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == thirdButton) {
			System.out.println("Third Button = " + (JButton) arg0.getSource());
			askQuestion(
					"What is the order of tool/armor progression in Minecraft? Start from lowest and go to highest; enchantments not included",
					"Wood, stone, iron, gold, diamond", 300);
			thirdButton.setText("Question Completed");
			thirdButton.setBackground(Color.red);
			thirdButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == fourthButton) {
			System.out.println("Fourth Button = " + (JButton) arg0.getSource());
			askQuestion("What is the name of the original Minecraft skin?", "Steve", 400);
			fourthButton.setText("Question Completed");
			fourthButton.setBackground(Color.red);
			fourthButton.setForeground(Color.RED);
		} else if ((JButton) arg0.getSource() == fifthButton) {
			System.out.println("Fourth Button = " + (JButton) arg0.getSource());
			// askQuestion("Special question! What is the name of the assault
			// rifle in Halo 4?", "MA5D Assault Rifle",1000);
			askQuestion("What update for Minecraft added ocean temples??", "1.8", 500);
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
			playCorrect();
		} else {
			score -= prizeMoney;
			updateScore(0);
			JOptionPane.showMessageDialog(null, "Incorrect! Your score is now " + score);
			playWrong();
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
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/batman.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void playCorrect() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/right.wav"));
			Clip clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
	public void playWrong() {
		try {
			AudioInputStream audioInputStream = AudioSystem
					.getAudioInputStream(new File("/Users/League/Google Drive/league-sounds/wrong.wav"));
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
