package Project;

public class Doge {
	String BarkWords;
	int barkVolume2;

	Doge(int EyeDirection, String ShoutWord, int barkVolume) {
		this.BarkWords = ShoutWord;
		this.barkVolume2 = barkVolume;
	}

	public void Bark() {
		if (barkVolume2 > 10) {
			System.out.println("" + BarkWords + "!");
		} else if (barkVolume2 < 10) {
			System.out.println("" + BarkWords);
		}
	}
}