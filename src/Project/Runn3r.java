package Project;

public class Runn3r {
	public static void main(String[] args) {
		Smurfs Handy = new Smurfs("Handy");
		Handy.eat();
		System.out.println(Handy.getName());
		
		Smurfs Papa = new Smurfs("Papa");
		Papa.eat();
		System.out.println(Papa.getName());
		
		Smurfs Smurfette = new Smurfs("Smurfette");
		Smurfette.eat();
		System.out.println(Smurfette.getName());	}
}
