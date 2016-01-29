package Project;

import java.applet.AudioClip;
import java.io.IOException;

import javax.management.timer.TimerMBean;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class CowTimer {

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
		CowTimer main1 = new CowTimer();
	}

	public CowTimer() throws InterruptedException {
		start();
	}

	private int minutes;
	private int minutesTimer;

	public void setTime(int minutes) {
		this.minutes = minutes;
		minutesTimer = minutes;
		System.out.println("Cow set to " + minutes + " seconds.");
	}

	public void start() throws InterruptedException {
		/**
		 * int Time = JOptionPane.showInputDialog(
		 * "Input the amount of seconds you would like to set");
		 */
		/**
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */
		setTime(25);
		for (int i = 0; i < minutesTimer; i += 1) {
			minutes = minutes - 1;
			System.out.println(minutes + " seconds left!");
			Thread.sleep(1000);
		}
		playSound("59245__zozzy__z-moo01.wav");
		/**
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to
		 * walk.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
