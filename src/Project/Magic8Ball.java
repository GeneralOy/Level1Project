package Project;
//Copyright Wintriss Technical Schools 2013
import java.util.Random;
import javax.swing.JOptionPane;

public class Magic8Ball {
	public static void main(String[] args) {
		int number = new Random().nextInt(4);
		System.out.println("" + number);
		JOptionPane.showInputDialog("Ask a question!");
		if(number == 0){
			JOptionPane.showMessageDialog(null, "Yes!");
		}else if(number == 1){
			JOptionPane.showMessageDialog(null, "No!");
		}else if(number == 2){
			JOptionPane.showMessageDialog(null, "I don't know...ask Google!");
		}else if(number == 3){
			JOptionPane.showMessageDialog(null, "When seagulls chase fishing trawlers, it is because they want the sardines that are thrown overboard...thank you.");
		}
	}
}

