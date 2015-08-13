package Project;


// Copyright Wintriss Technical Schools 2013

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

    JLabel drumLabelWithImage;

    public static void main(String[] args) throws Exception {
   	 	new DrumKit().getGoing();
    }

    private void getGoing() throws MalformedURLException {
	   	 JFrame Frame1 = new JFrame();
	   	 Frame1.show();;
	   	 Frame1.setSize(500,500);
	   	 Frame1.setTitle("DrumKit 1.0");
	   	 JPanel JPanel1 = new JPanel();
	     Frame1.add(JPanel1);
	     String imageName = "drum1.png";
	   	 drumLabelWithImage = createLabelImage(imageName); 
	   	 JPanel1.add(drumLabelWithImage);
	     drumLabelWithImage.show();
	     JPanel1.setLayout(new GridLayout());
	   	 Frame1.pack();
	   	 drumLabelWithImage.addMouseListener(this);;
    }

    public void mouseClicked(MouseEvent e) {
    	System.out.println("mouse clicked");
   	 JLabel drumClicked = (JLabel) e.getSource();
   	 // 16. If they clicked on the drumImage...
   	 if(drumClicked == drumLabelWithImage){
   		 playSound("drumsound1.wav");
   	 }
   		 // 17. ...use the playSound method to play a drum sound.

   	 // 18. Add more images to make a drumkit. Remember to add a mouse listener to each one.
    }

    private JLabel createLabelImage(String fileName)
			throws MalformedURLException
	{
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null)
		{
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

    private void playSound(String fileName) {
   	 AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
   	 sound.play();
    }

}
