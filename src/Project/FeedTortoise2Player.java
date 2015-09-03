package Project;
//Copyright Wintriss Technical Schools 2013 
import java.awt.Component;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.Label;
import java.awt.event.KeyEvent;
import java.util.Random;
import org.jointheleague.graphical.robot.Robot;
public class FeedTortoise2Player implements KeyEventDispatcher
{
	Robot robot = new Robot();
	Robot robot2 = new Robot();
	int tortoiseLocationX = robot.getX();
	int tortoiseLocationY = robot.getY();
	int x2 = robot2.getY();
	int y2 = robot2.getY();
	int foodLocationX;
	int foodLocationY;

	// 2. Choose a character for your food or leave it as *
	Component food = new Label("*");

	private void goUp()
	{
		robot.moveTo(robot.getX(), robot.getY() - 20);
	}
	private void goDown()
	{
		robot.moveTo(robot.getX(), robot.getY() + 20);
	}
	private void goLeft()
	{
		robot.moveTo(robot.getX() - 20, robot.getY());
	}
	private void goRight()
	{
		robot.moveTo(robot.getX() + 20, robot.getY());
	}
	private void goUp2()
	{
		robot2.moveTo(robot2.getX(), robot2.getY() - 20);
	}
	private void goDown2()
	{
		robot2.moveTo(robot2.getX(), robot2.getY() + 20);
	}
	private void goLeft2()
	{
		robot2.moveTo(robot2.getX() + 20, robot2.getY());
	}
	private void goRight2()
	{
		robot2.moveTo(robot2.getX() - 20, robot2.getY());
	}
	private void checkIfFoodFound() throws Exception
	{
		this.tortoiseLocationX = robot.getX();
		this.tortoiseLocationY = robot.getY();
		this.x2 = robot2.getY();
		this.y2 = robot2.getY();
		
		// 7. if tortoise is near the food
			// say something. Hint: Runtime.getRuntime().exec("say yum")
	}

	public boolean dispatchKeyEvent(KeyEvent e)
	{
		if (e.getID() == KeyEvent.KEY_PRESSED)
		{
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

			/**Hint: "e.getKeyCode() == KeyEvent.VK_T" is TRUE when T is pressed
			 8. if the W key is pressed,
				 call the method moveFoodUp();
			
			11. Do the same for left, right, and down. You can choose your own keys if you like. You will need to make new methods for moving the food.
			
			12. If the secret key is pressed
				 Call the method moveFoodToARandomLocation

			 Awesome points(finish everything else first): The person controlling the food has a big disadvantage they have to keep pressing buttons. While the turtle player and hold the arrow keys. Can you think you think of a way to make this game more fair for the food? Hint: e.getID() == KeyEvent.KEY_PRESSED is true when a key is first pressed and e.getID() == KeyEvent.KEY_RELEASED is true when a key is released. **/

			
		}
		return processEvent();
	}
	

	private void moveFoodUp()
	{
		System.out.println("Move food up!");
		//9. decrement foodLocationY 

		//10. call the moveFood() method

	}
	
	private void moveFoodToARandomLocation()
	{
		//foodLocationX = new Random().nextInt(window.getSize().width);
		//foodLocationY = new Random().nextInt(window.getSize().height);
		moveFood();
	}

	private void moveFood()
	{
		food.setLocation(foodLocationX, foodLocationY);
		//window.add(food);
	}

	//TurtlePanel window = Tortoise.getBackgroundWindow();

	public static void main(String[] args)
	{
		FeedTortoise2Player feeder = new FeedTortoise2Player();
		feeder.controlTheTortoise();
		feeder.feedTheTortoise();
	}

	private void controlTheTortoise()
	{
		KeyboardFocusManager.getCurrentKeyboardFocusManager().addKeyEventDispatcher(this);
		//Tortoise.show();
		//Tortoise.setSpeed(10);
//Tortoise.getBackgroundWindow().setBackground(Colors.getRandomColor());

	}

	private void feedTheTortoise()
	{
		moveFood();
	}
	
	private boolean processEvent()
	{
		try
		{
			checkIfFoodFound();
		} catch (Exception e)
		{
			e.printStackTrace();
		}
		return false;
	}

}


