package _10_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line:
	static int happinessLevel = 0;
	static String pet;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
 pet = JOptionPane.showInputDialog("What kind of pet do you want to buy from the pet store?");
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
while (happinessLevel < 30) {
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to keep your " + pet + " happy?", "Pet Health", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "cuddle", "food", "water", "take a walk"}, null);

			if(task == 0) {
				cuddle();
			}
			if(task == 1) {
				food();
			}
			if(task == 2) {
				water();
			}
			if(task == 3) {
				walk();
			}
			
}//end while
			if(happinessLevel >= 30) {
				JOptionPane.showMessageDialog(null, "Your " + pet + " loves you a lot! go ahead and take a break");
			}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}//main method

public static void cuddle() {
	
		JOptionPane.showMessageDialog(null, "Your "+ pet +" loved cuddling with you!");
		 happinessLevel = happinessLevel + 5;
		
}//cuddle

public static void food() {
	
		JOptionPane.showMessageDialog(null, "Your "+ pet +" appreciates the meal!");
		 happinessLevel = happinessLevel + 10;

}//food

public static void water() {
	
		JOptionPane.showMessageDialog(null, "Your "+ pet +" says thanks for the water!");
		 happinessLevel = happinessLevel + 15;
	
}//water

public static void walk() {
	
		JOptionPane.showMessageDialog(null, "Your "+ pet +" enjoyed the walk!");
		 happinessLevel = happinessLevel + 10;
	
}//walk

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	
}