package Project;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.io.IOException;

public class SimonSaysRecipe extends KeyAdapter {

	Dimension BIG = new Dimension(400, 400);
	Dimension SMALL = new Dimension(200, 200);
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	public int points = 0;
	private String keyString;
	public KeyListener keyListener1;
	Date timeAtStart;

	private void makeAlbum() {
		System.out.println(KeyEvent.VK_I);
		images.put(new Integer(KeyEvent.VK_A), "A.png");
		// *http://www.wpclipart.com/computer/keyboard_keys/letters/computer_key_A.png
		images.put(new Integer(KeyEvent.VK_C), "C.png");
		// *http://www.wpclipart.com/computer/keyboard_keys/letters/computer_key_C.png
		images.put(new Integer(KeyEvent.VK_P), "P.png");
		// *http://www.wpclipart.com/computer/keyboard_keys/letters/computer_key_P.png
		images.put(new Integer(KeyEvent.VK_I), "I.png");
		// *http://www.clipartpal.com/_thumbs/pd/computer/computer/computer_key_I.png
		JOptionPane.showConfirmDialog(null,
				"Press the matching keys when Simon says!");
		showImage();
		System.out.println("done");
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		/**
		 * 16. make a points variable to track the score. tell the user their //
		 * score at the end.
		 **/
		if (keyCode == imageIndex) {
			points += 1;
			speak("correct");
			// tries += 1;
		} else if (keyCode > imageIndex || keyCode < imageIndex) {
			// points += 1;
			speak("incorrect");
			// tries += 1;
		}
		if (tries > 9) {
			speak("Your total score was " + points + "out of 11");
			System.exit(1);
		} else if (tries <= 9) {
			tries += 1;
		}
		/**
		 * 18. if the keyCode doesn't match the imageIndex and //
		 * "Simon didn't say..." increase their score // 19. Use the speak
		 * method to tell the user if they were correct or not
		 **/
		frame.dispose();

		frame.removeKeyListener(this);
		System.out.println("Loaded Part 2");
		showImage();
	}

	private void showImage() {
		frame = new JFrame();
		frame.setVisible(true);
		frame.add(getNextRandomImage());
		frame.setSize(BIG);
		System.out.println("loaded part 1");
		frame.addKeyListener(this);
		frame.pack();
		speak("Simon Says" + keyString);
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		if (imageIndex == 37) {
			this.imageIndex = 65;
			keyString = "A";
		} else if (imageIndex == 38) {
			this.imageIndex = 67;
			keyString = "C";
		} else if (imageIndex == 39) {
			this.imageIndex = 80;
			keyString = "P";
		} else if (imageIndex == 40) {
			this.imageIndex = 73;
			keyString = "I";
		}
		System.out.println(imageIndex);
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
		System.out.println(fileName);
		return new JLabel(icon);
	}

	void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) throws Exception {
		new SimonSaysRecipe().makeAlbum();
	}
}

/*
 * 20. add a timer ~~~ where the code starts running ~~~ timeAtStart = new
 * Date();
 * 
 * ~~~ where the code ends ~~~ Date timeAtEnd = new Date();
 * System.out.println((timeAtEnd.getTime()-timeAtStart.getTime())/1000);
 * System.exit(0);
 */

