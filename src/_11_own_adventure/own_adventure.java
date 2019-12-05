package _11_own_adventure;

import javax.swing.JOptionPane;

public class own_adventure {
	static int money = 10000000; 
	
public static void main(String[] args) {
	
	JOptionPane.showMessageDialog(null, "One day you are walking around New York City, you see a couple different stores you can go into. You have 1,000,000 dollars to spend.");
	int task = JOptionPane.showOptionDialog(null, "Which store do you want to start shopping in?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "Supreme", "Gucci", "Prada", "Louis Vuitton"}, null);
if(task==0) {
		JOptionPane.showMessageDialog(null, "You turn all around the store, you notice a couple different sections that intrest you.");
			int task1 = JOptionPane.showOptionDialog(null, "Which Store do you want to shop in?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Dresses", "Shoes", "Purses"}, null);
	}//Supreme

if(task==1) {
	JOptionPane.showMessageDialog(null, "You turn all around the store, you notice a couple different sections that intrest you.");
		int task2 = JOptionPane.showOptionDialog(null, "Which area do you want to shop in?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dresses", "Shoes", "Purses"}, null);
	
	}//Gucci

if(task==2) {
	JOptionPane.showMessageDialog(null, "You turn all around the store, you notice a couple different sections that intrest you.");
		int task3 = JOptionPane.showOptionDialog(null, "Which area do you want to shop in?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dresses", "Shoes", "Purses"}, null);
	
	}//Prada

if(task==3) {
	JOptionPane.showMessageDialog(null, "You turn all around the store, you notice a couple different sections that intrest you.");
		int task4 = JOptionPane.showOptionDialog(null, "Which area do you want to shop in?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "Dresses", "Shoes", "Purses"}, null);
	
	}//LV	
}//main

public static void dresses() {
String colord =	JOptionPane.showInputDialog("what color dress do you want?");
	JOptionPane.showMessageDialog(null, "You are looking around the dress section when you see a beautiful " + colord + "dress, not to mention they hasve your size!");
	int taskd = JOptionPane.showOptionDialog(null, "Do you want to buy the dress for $8,000?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "yes", "no", }, null);
	if(taskd ==0) {
		money = money-8000;
		JOptionPane.showMessageDialog(null, "After deciding to buy the shoes, you decide to go get some food to eat");
	}
	if(taskd ==0) {
		JOptionPane.showMessageDialog(null, "After deciding not to buy the dress, you decide to go get some food to eat");
	}
}//dresses

public static void shoes() {
	String colors =	JOptionPane.showInputDialog("what color shoes do you want?");
	JOptionPane.showMessageDialog(null, "You are looking around the shoes section when you see a sick pair of  " + colors + "shoes, not to mention they hasve your size!");
	int tasks = JOptionPane.showOptionDialog(null, "Do you want to buy the shoes for $12,000?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "yes", "no", }, null);
	if(tasks ==0) {
		money = money-12000;
		JOptionPane.showMessageDialog(null, "After deciding to buy the shoes, you decide to go get some food to eat");
	}
	if(tasks ==0) {
		JOptionPane.showMessageDialog(null, "After deciding not to buy the shoes, you decide to go get some food to eat");
	}
}//shoes

public static void purses() {
	String colorp =	JOptionPane.showInputDialog("what color purse do you want?");
	JOptionPane.showMessageDialog(null, "You are looking around the purse section when you see a handmade  " + colorp + "purse, not to mention the size is perfect!");
	int taskp = JOptionPane.showOptionDialog(null, "Do you want to buy the purse for $50,000?", "Shoppping", 0, JOptionPane.INFORMATION_MESSAGE, null,
			new String[] { "yes", "no", }, null);
	if(taskp ==0) {
		money = money-50000;
		JOptionPane.showMessageDialog(null, "After deciding to buy the shoes, you decide to go get some food to eat");
	}
	if(taskp ==0) {
		JOptionPane.showMessageDialog(null, "After deciding not to buy the shoes, you decide to go get some food to eat");
	}
}//purses


}
