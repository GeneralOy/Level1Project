package Project;

//Copyright Wintriss Technical Schools 2013
import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

	BufferedImage fortuneTellerImage;

	int frameWidth = 640;
	int frameHeight = 360;
	static int fortuneImage = 0;

	FortuneTeller() throws Exception {
		/**
		 * 1. Choose an image for your fortune teller and put it in your default
		 * package
		 */
		fortuneTellerImage = ImageIO.read(getClass().getResource("fortuneball.jpg"));
		/**
		 * 2. Adjust the framexeWidth and frameHeight variables to fit your
		 * image nicely (doesn’t need a new line of code)
		 */
		/** 4. add a mouse listener */
		this.addMouseListener(this);
	}

	static void begin() {
		/** 3. Welcome the user. Give them a hint for the secret location. */
		JOptionPane.showMessageDialog(null, "Welcome to the Fortune Teller! Choose locations to get your fortune!");
		JOptionPane.showMessageDialog(null,
				"Click certain locations on the screen, using provided clues, to get your fortune!");
		options();

	}

	@Override
	public void mousePressed(MouseEvent e) {
		int mouseX = e.getX();
		int mouseY = e.getY();
		/** 5. Print the mouseX variable */
		System.out.println("" + mouseX + ", " + mouseY);
		/**
		 * 6. Add the mouseY variable to the previous line so that it prints out
		 * too (no new line)
		 */
		/** 7. Adjust your secret location co-ordinates here:*/
		int secretLocationX = 397;
		int secretLocationY = 246;
		/**
		 * If the mouse co-ordinates and secret location are close, we'll let
		 * them ask a question.
		 */
		if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
			// 8. Get the user to enter a question for the fortune teller
			String question = JOptionPane.showInputDialog("You got it! Ask a question to help determine where it is!");
			 AudioClip sound = JApplet.newAudioClip(getClass().getResource("170160__timgormly__8-bit-spooky.aiff"));
			/** 9. Find a spooky sound and put it in your default package (freesound.org)*/
			/**AudioClip sound = JApplet.newAudioClip(getClass().getResource("spooky.aif"));*/
			/** 10. Play the sound*/
			 sound.play();
			/** 11. Use the pause() method below to wait until your music has finished*/
			 pause(2);
			/** 12. Insert your completed Magic 8 ball recipe (http://bit.ly/Zdrf6d) here*/
			 int number = new Random().nextInt(4);
				System.out.println("" + number);
				JOptionPane.showInputDialog("Ask a question!");
				if(number == 0){
					JOptionPane.showMessageDialog(null, "Yes!");
				}else if(number == 1){
					JOptionPane.showMessageDialog(null, "No!");
				}else if(number == 2){
					JOptionPane.showMessageDialog(null, "I don't know...ask Google!");
				}else if(number == 3){
					JOptionPane.showMessageDialog(null, "When seagulls chase fishing trawlers, it is because they want the sardines that are thrown overboard...thank you.");
				}
		}

	}

	static void options() {
		// String option = JOptionPane.showInputDialog(null,"Choose one of these
		// options for your fortune; Option 1, Charlie, Beta, Option 3, Option
		// 2, Alpha");
		if (fortuneImage == 1) {
			JOptionPane.showMessageDialog(null, "This fortune is located on the outside rim of the ball");
			// This is located on the outside rim of the fortune ball
		} else if (fortuneImage == 2) {
			//
		} else if (fortuneImage == 3) {
			//
		} else if (fortuneImage == 4) {
			//
		} else if (fortuneImage == 5) {
			//
		} else if (fortuneImage == 6) {
			//
		}
	}

	private boolean areClose(int mouseX, int secretLocationX) {
		return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
	}

	private void pause(int seconds) {
		try {
			Thread.sleep(1000 * seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	/****************
	 * don't worry about the stuff under here
	 *******************/

	public static void main(String[] args) throws Exception {
		SwingUtilities.invokeLater(new FortuneTeller());
		begin();
	}

	@Override
	public void run() {
		JFrame frame = new JFrame();
		frame.add(this);
		setPreferredSize(new Dimension(frameWidth, frameHeight));
		frame.pack();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setVisible(true);
	}

	private void showAnotherImage(String imageName) {
		try {
			fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
		} catch (Exception e) {
			System.err.println("Couldn't find this image: " + imageName);
		}
		repaint();
	}

	@Override
	public void paintComponent(Graphics g) {
		g.drawImage(fortuneTellerImage, 0, 0, null);
	}

	@Override
	public void mouseClicked(MouseEvent e) {
	}

	@Override
	public void mouseReleased(MouseEvent e) {
	}

	@Override
	public void mouseEntered(MouseEvent e) {
	}

	@Override
	public void mouseExited(MouseEvent e) {
	}

}
