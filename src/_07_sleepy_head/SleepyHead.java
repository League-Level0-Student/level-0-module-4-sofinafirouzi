package _07_sleepy_head;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
   int answerone =  JOptionPane.showConfirmDialog(null, "Is it a weekday", "Sleepy Head?", JOptionPane.YES_NO_OPTION);
        /* You MUST use the above boolean variables in your code */
   System.out.println(answerone);

   int answertwo =  JOptionPane.showConfirmDialog(null, "Are you on Vacation", "Sleepy Head?", JOptionPane.YES_NO_OPTION);
   /* You MUST use the above boolean variables in your code */
System.out.println(answertwo);

   
        if( answerone == 0) {
        	isWeekday = true; 
        }
        else {
        	isWeekday = false;
        }
        	
        if( answertwo == 0) {
        	isVacation = true; 
        }
        else {
        	isVacation = false;
        }
        if(isWeekday) {
        	if(isVacation){
        		JOptionPane.showMessageDialog(null, "sleep in");
        	}
        	else {
        		JOptionPane.showMessageDialog(null, "get up lazybones!!");
        	}
        }
        if(!isWeekday) {
        	if(!isVacation) {
        		JOptionPane.showMessageDialog(null, "sleep in");
        	}
        }   
        }

     
        /*
         * Ask the user for these values using a confirm dialog like the one below
         * JOptionPane.showConfirmDialog(null, "Is it a weekday?", "Sleepy Head", JOptionPane.YES_NO_OPTION);
         */
    


        /*
         * Print “sleep in�? if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!�? If it is a weekday, and we are on vacation,
         * print “sleep in�?.
         */
    }


