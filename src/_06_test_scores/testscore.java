package _06_test_scores;

import javax.swing.JOptionPane;

public class testscore {

	public static void main(String[] args) {
		
		String score = JOptionPane.showInputDialog("What did you get on your last test?");
		Integer.parseInt(score);
		int number1 = Integer.parseInt(score);	
		if (number1 > 85) {
			JOptionPane.showMessageDialog(null, "WOW great job! You must have studied pretty hard for that test!");
		}
		else {
			JOptionPane.showMessageDialog(null, "Better luck next time!");
			
			
			
			
			
			
			
			
		}
		}
		
	}

