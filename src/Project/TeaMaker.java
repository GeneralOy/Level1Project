package Project;

import javax.swing.JOptionPane;

//Copyright Wintriss Technical Schools 2013
public class TeaMaker {
	public static void main(String[] args) {
		String Flavor = JOptionPane.showInputDialog("What flavor of tea? Green, Mango, Chamomile or Passion Fruit?[cAsE SEnsItIVE]");
		TeaBag Teabag1 = new TeaBag(Flavor);
		Cup CoffeeCup = new Cup();
		Kettle MainKettle = new Kettle();
		String MainFlavor = Teabag1.getFlavor();
		MainKettle.getWater();
		MainKettle.boil();
		CoffeeCup.makeTea(Teabag1, MainKettle.water);

	}
	/* Figure out how to make a cup of tea using the classes below */
}

class TeaBag {

	public final static String GREEN = "Green";
	public final static String MANGO = "Mango";
	public final static String CHAMOMILE = "Chamomile";
	public final static String PASSION_FRUIT = "Passion Fruit";

	private String flavor;

	TeaBag(String flavor) {
		this.flavor = flavor;
	}

	String getFlavor() {
		return flavor;
	}

}

class Kettle {

	Water water = new Water();

	Water getWater() {
		return water;
	}

	void boil() {
		this.water.isHot = true;
	}

	class Water {

		private boolean isHot = false;

		public boolean isHot() {
			return this.isHot;
		}
	}

}

class Cup {

	private TeaBag teabag;

	void makeTea(TeaBag teabag, Kettle.Water hotWater) {
		this.teabag = teabag;
		if (hotWater.isHot())
			System.out.println("Making hot " + teabag.getFlavor() + " tea.");
		else
			System.out.println("Can't make tea with cold water! ");
	}

}
