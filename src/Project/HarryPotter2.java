package Project;

public class HarryPotter2 {

	private boolean cloakOn;
	
	HarryPotter2() {
		System.out.println("making Barry Potter...");
	}

	void castSpell(String spell){
System.out.println("casting spell: " + spell);
	}

	void makeInvisible(boolean invisible) {
		this.cloakOn = invisible;
		
		if (cloakOn)
			System.out.println("Barry is invisible");
		else
			System.out.println("Barry is visible");
	}

	void spyOnSnape() {
		System.out.println("Barry sees Professor Snape doing nefarious things.");
	}

	public static void main(String[] args) {
		/** 1. make harry potter*/
		HarryPotter2 BarryPotter = new HarryPotter2();
		/** 2. become invisible*/
		BarryPotter.makeInvisible(true);
		/** 3. spy on professor snape*/
		BarryPotter.spyOnSnape();
		/** 4. become visible again*/
		BarryPotter.makeInvisible(false);
		/** 5. cast a “stupefy” spell*/
		BarryPotter.castSpell("Stupefy!");
	}

}





