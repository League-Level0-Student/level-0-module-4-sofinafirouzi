package _99_extra;


import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to a double.
		
String number1 = JOptionPane.showInputDialog("Type in a number");
double numberA = Double.parseDouble(number1);
String number2 = JOptionPane.showInputDialog("Type in another number");
double numberB = Double.parseDouble(number2);
		
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "The question", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Button1", "Button2", "Button3", "Button3" },
				null);
		//NEED TO ADD IF STATEMENTS TO ADD BUTTONS ETC

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
add( numberA,  numberB);
subtract( numberA,  numberB);
multiply( numberA,  numberB);
divide( numberA,  numberB);
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations


	}//main method

	// 3. Create method for addition operation.
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }
	public static void add(double numberA, double numberB){
		JOptionPane.showMessageDialog(null, numberA + " + " + numberB + " = " + (numberA+numberB));
	}
	public static void subtract(double numberA, double numberB){
		JOptionPane.showMessageDialog(null, numberA + " - " + numberB + " = " + (numberA-numberB));
	}
	public static void multiply(double numberA, double numberB){
		JOptionPane.showMessageDialog(null, numberA + " x " + numberB + " = " + (numberA*numberB));
	}
	public static void divide(double numberA, double numberB){
		JOptionPane.showMessageDialog(null, numberA + " ÷ " + numberB + " = " + (numberA/numberB));
	}
	// 4. Create similar methods for subtraction, multiplication and division.
}//simple claculator class