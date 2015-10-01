package Project;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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
	// Complete steps 1 - 7 before you test
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	HashMap<Integer, String> images = new HashMap<Integer, String>();
	private int imageIndex;
	private int tries = 0;
	private int simonSays = 0;
	Date timeAtStart;

	private void makeAlbum() {
		images.put(new Integer(KeyEvent.VK_A), "A.png");
		//*http://www.wpclipart.com/computer/keyboard_keys/letters/computer_key_A.png
		images.put(new Integer(KeyEvent.VK_C), "C.png");
		//*http://www.wpclipart.com/computer/keyboard_keys/letters/computer_key_C.png
		images.put(new Integer(KeyEvent.VK_P), "P.png");
		//*http://www.wpclipart.com/computer/keyboard_keys/letters/computer_key_P.png
		images.put(new Integer(KeyEvent.VK_I), "I.png");
		//*http://www.clipartpal.com/_thumbs/pd/computer/computer/computer_key_I.png
		JOptionPane.showConfirmDialog(null,"Press the matching keys when Simon says!");
		showImage();
		System.out.println("done");
	}

	public void keyPressed(KeyEvent e) {
		int keyCode = e.getKeyCode();
		// 16. make a points variable to track the score. tell the user their
		// score at the end.
		// 17. if the keyCode matches the imageIndex and "Simon says..."
		// increase their score
		// 18. if the keyCode doesn't match the imageIndex and
		// "Simon didn't say..." increase their score
		// 19. Use the speak method to tell the user if they were correct or not
		// 13. increment tries by 1

		// 14. if tries is greater than 9 (or however many you want)

		// 15. exit the program
		// 11. dispose of the frame

		// 12. call the method to show an image
	}

	private void showImage() {
		frame.setVisible(true);
		frame.add(getNextRandomImage());
		System.out.println("1");
		frame.setSize(BIG);
		System.out.println("2");
		frame.addKeyListener(this);
		frame.pack();
		System.out.println("3");
		// 9. add a key listener to the frame

		// 10. Use the speak method to either say "Simon says press this key" or
		// "Press this key"
		// Hint: use the simonSays int and a random number
	}

	private Component getNextRandomImage() {
		this.imageIndex = new Random().nextInt(4) + 37;
		return loadImage(images.get(imageIndex));
	}

	private JLabel loadImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		Icon icon = new ImageIcon(imageURL);
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

