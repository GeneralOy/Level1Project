package Project;

import java.net.URI;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CutenessTV {
	JFrame Mainframe = new JFrame();
	JPanel mainPanel = new JPanel();
	public static void main(String[] args) {
		
	}

	void showDucks() {
		playVideo("Drirjl5K9Yk");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}