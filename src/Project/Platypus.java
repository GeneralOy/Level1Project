package Project;

import javax.swing.JOptionPane;

public class Platypus {
	private String name;
	void sayHi(){
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
		JOptionPane.showMessageDialog(null, "The platypus " + name + " is smarter than your average platypus.");
	}
	
	public static void main(String[] args) {
		String PlatypusName = JOptionPane.showInputDialog("What is the name of your platypus?");
		Platypus platypus1 = new Platypus("" + PlatypusName);
		/**1. Make an instance of your new pet platypus**/
		/**2. Call the sayHi method**/
		/**3. Create a constructor in the platypus class so that you can give your platypus a name.**/
	}
	public Platypus(String name){
		this.name = name;
		sayHi();
	}
}

