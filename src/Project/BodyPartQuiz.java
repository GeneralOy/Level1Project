package Project;

import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class BodyPartQuiz {
	String firstImage = "/Users/Guest/Desktop/Level1Project/doubledogebagle.jpg";
	String secondImage = "/Users/Guest/Desktop/Level1Project/Shrekt.jpg";
	String thirdImage = "/Users/Guest/Desktop/Level1Project/photo-george-washington.jpg";

	Frame window = new Frame();

	private void startQuiz() {
		window.setSize(200, 200);
		int Score = 0;
		String Answer = JOptionPane.showInputDialog("<Who is this famous person/thing?>");
		if (Answer.equals("Doge") || Answer.equals("Doge Bagle")) {
			JOptionPane.showMessageDialog(null, "You got it right!");
			Score += 1;
		} else {
			JOptionPane.showMessageDialog(null,"You were wrong! That was the Doge Bagle!");
		}
		JOptionPane.showMessageDialog(null, "Your score is currently " + Score+ "!");
		showNextImage();
		window.setSize(200, 200);
		Answer = JOptionPane.showInputDialog("<Who is this famous person/thing?>");
		if (Answer.equals("Shrek") || Answer.equals("shrek")) {
			JOptionPane.showMessageDialog(null, "Yup! ( ‾ʖ̫‾)");
			Score += 1;
		} else {
			JOptionPane.showMessageDialog(null, "Get shrekt! That was Shrek");
		}
		JOptionPane.showMessageDialog(null, "Your score is currently " + Score+ "!");
		showNextImage();
		window.setSize(200, 200);
		Answer = JOptionPane.showInputDialog("<Who is this famous person/thing?>");
		if (Answer.equals("George Washington") || Answer.equals("washington")) {
			JOptionPane.showMessageDialog(null, "Hooray! { ͡• ͜ʖ ͡•}");
			Score += 1;
		} else {
			JOptionPane.showMessageDialog(null,"Nope :I Le Lenny will get u (ง ͠° ͟ل͜ ͡°)ง ");
		}
		JOptionPane.showMessageDialog(null, "Your final score is " + Score + "!");
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		BodyPartQuiz quiz = new BodyPartQuiz();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}
