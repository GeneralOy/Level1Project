package Project;

import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise {
	JButton Trick = new JButton();
	JButton Treat = new JButton();
	JPanel MainPanel = new JPanel();
	JFrame MainFrame = new JFrame();
	public static void main(String[] args) {
		NastySurprise main = new NastySurprise();
	}
	public NastySurprise(){
		MainFrame.add(MainPanel);
		
	}
private void showPictureFromTheInternet(String imageUrl) {
	try {
		URL url = new URL(imageUrl);
		Icon icon = new ImageIcon(url);
		JLabel imageLabel = new JLabel(icon);
		JFrame frame = new JFrame();
		frame.add(imageLabel);
		frame.setVisible(true);
		frame.pack();
	} catch (MalformedURLException e) {
		e.printStackTrace();
	}
}}