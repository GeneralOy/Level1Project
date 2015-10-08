package Project;

//Copyright Wintriss Technical Schools 2013 
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class FeedTortoise2Player implements KeyEventDispatcher {
	public static int x = 0;
	public boolean foodFound;
	public static Robot robot = new Robot();
	public static Robot robot2 = new Robot();
	int tortoiseLocationX = robot.getX();
	int tortoiseLocationY = robot.getY();
	int x2 = robot2.getX();
	int y2 = robot2.getY();
	int randomTPX = new Random().nextInt(900);
	int randomTPY = new Random().nextInt(500);
	// 2. Choose a character for your food or leave it as *
	Component food = new Label("*");

	private void telePort() {
		robot2.setX(randomTPX);
		robot2.setY(randomTPY);
		randomTPX = new Random().nextInt(1500);
		randomTPY = new Random().nextInt(900);
	}

	private void goUp() {
		robot.moveTo(robot.getX(), robot.getY() - 20);
	}

	private void goDown() {
		robot.moveTo(robot.getX(), robot.getY() + 20);
	}

	private void goLeft() {
		robot.moveTo(robot.getX() - 20, robot.getY());
	}

	private void goRight() {
		robot.moveTo(robot.getX() + 20, robot.getY());
	}

	private void goUp2() {
		robot2.moveTo(robot2.getX(), robot2.getY() - 20);
	}

	private void goDown2() {
		robot2.moveTo(robot2.getX(), robot2.getY() + 20);
	}

	private void goLeft2() {
		robot2.moveTo(robot2.getX() + 20, robot2.getY());
	}

	private void goRight2() {
		robot2.moveTo(robot2.getX() - 20, robot2.getY());
	}

	private void checkIfFoodFound() {
		if(x == 0){
			x2 = robot2.getX();
			y2 = robot2.getY();
			int x1 = robot.getX();
			int y1 = robot.getY();
			if ((x2 + 20) > (x1 - 50) && (x2 - 20) < (x1 + 50)) {
				if ((y2 + 20) > (y1 - 50) && (y2 - 20) < (y1 + 50)) {
					System.out.println("you caught him!");
					foodFound = true;
					JOptionPane.showMessageDialog(null, "Blue Wins!");
				}
			} else {
				foodFound = false;
			}
		}
	}

	public boolean dispatchKeyEvent(KeyEvent e) {
		if (e.getID() == KeyEvent.KEY_PRESSED) {
			if(x > 2){
				checkIfFoodFound();
			}
			if (e.getKeyCode() == KeyEvent.VK_RIGHT)
				goRight();
			if (e.getKeyCode() == KeyEvent.VK_LEFT)
				goLeft();
			if (e.getKeyCode() == KeyEvent.VK_UP)
				goUp();
			if (e.getKeyCode() == KeyEvent.VK_DOWN)
				goDown();
			if (e.getKeyCode() == KeyEvent.VK_A)
				goRight2();
			if (e.getKeyCode() == KeyEvent.VK_D)
				goLeft2();
			if (e.getKeyCode() == KeyEvent.VK_W)
				goUp2();
			if (e.getKeyCode() == KeyEvent.VK_S)
				goDown2();
			if (e.getKeyCode() == KeyEvent.VK_SPACE)
				telePort();
			/**
			 * Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
			 * 8. if the W key is pressed, call the method moveFoodUp();
			 * 
			 * 11. Do the same for left, right, and down. You can choose your
			 * own keys if you like. You will need to make new methods for
			 * moving the food.
			 * 
			 * 12. If the secret key is pressed Call the method
			 * moveFoodToARandomLocation
			 * 
			 * Awesome points(finish everything else first): The person
			 * controlling the food has a big disadvantage they have to keep
			 * pressing buttons. While the turtle player and hold the arrow
			 * keys. Can you think you think of a way to make this game more
			 * fair for the food? Hint: e.getID() == KeyEvent.KEY_PRESSED is
			 * true when a key is first pressed and e.getID() ==
			 * KeyEvent.KEY_RELEASED is true when a key is released.
			 **/

		}
		return processEvent();
	}

	/**private void moveFoodUp() {
		System.out.println("Move food up!");
		// 9. decrement foodLocationY

		// 10. call the moveFood() method

	}

	private void moveFoodToARandomLocation() {
		// foodLocationX = new Random().nextInt(window.getSize().width);
		// foodLocationY = new Random().nextInt(window.getSize().height);
	}

	// TurtlePanel window = Tortoise.getBackgroundWindow();
	**/
	public static void main(String[] args) {
		FeedTortoise2Player feeder = new FeedTortoise2Player();
		feeder.controlTheTortoise();
		if(x < 2){
			x += 1;
			robot.setX(500);
			robot.setY(500);
			robot2.setX(0);
			robot2.setY(250);
		}
	}

	private void controlTheTortoise() {
		KeyboardFocusManager.getCurrentKeyboardFocusManager()
				.addKeyEventDispatcher(this);
		robot2.changeRobot("/Users/Guest/Desktop/Level1Project/Robot2.3");
	}

	private boolean processEvent() {
		try {
			checkIfFoodFound();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
