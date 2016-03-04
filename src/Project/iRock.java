package Project;

import javax.swing.JOptionPane;

public class iRock {
	// public static String name;

	public static void main(String[] args) {
		Irocks();
		rocks("Bob");
		truth1("0");
		repeat("21");
		String theBest = getBest();
		JOptionPane.showMessageDialog(null, theBest + " is the best!");
		add(1, 1);
		oddOrEven(21);
	}

	public static void Irocks() {
		// name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, "Owen rocks!");
	}

	public static void rocks(String Bob) {
		// name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null, Bob + " rocks!");
	}

	public static void truth1(String name) {
		name = JOptionPane.showInputDialog("Who is your favorite artist?");
		if (name.equals("Alan Walker")) {
			JOptionPane.showMessageDialog(null, name + " is awesome!");
		} else if (name.equals("Justin Bieber")) {
			JOptionPane.showMessageDialog(null, name + " SUCKS!");
		} else {
			JOptionPane.showMessageDialog(null, "I don't know who that is, sorry");
		}
	}

	public static void echo(String Echo) {
		Echo = JOptionPane.showInputDialog("Echo?");
		JOptionPane.showMessageDialog(null, Echo + "" + Echo);
	}

	public static void repeat(String repeatWhat) {
		repeatWhat = JOptionPane.showInputDialog("Repeat?");
		JOptionPane.showMessageDialog(null, repeatWhat + repeatWhat + repeatWhat);
	}

	public static String getBest() {
		String best = JOptionPane.showInputDialog("Who is the best?");
		return best;
	}

	public static void add(int number1, int number2) {
		int number3 = number1 + number2;
		JOptionPane.showMessageDialog(null, number2 + "+" + number1 + "=" +number3);
		
	}

	public static void oddOrEven(int number) {
		int number2 = number%2;
		String oddOrEvenThing;
		if(number2 == 1) {
			oddOrEvenThing = "odd";
		}else {
			oddOrEvenThing = "even";
		}
		JOptionPane.showMessageDialog(null, oddOrEvenThing);

	}
}
