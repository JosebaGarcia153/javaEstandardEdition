package com.ipartek.formacion.ahorcado;

import java.util.Scanner;

public class HangedMan {
	
	static Scanner keyboard = new Scanner(System.in);
	
	static private String[] randWords = {"Vampire", "House", "Clouds", "Beach", "Bycicle", "Food"};
	
	static private String word = "";
	static private String display = "";
	static private char letter = ' ';
	
	static private int index = 0;
	static private int retries = 10;
	
	static boolean guess = false;
	static boolean finish = false;
	
	
	public static void main(String[] args) {
		
		index = (int)(Math.random() * randWords.length);
		
		word = randWords[index];
		
		//Creates a String of ------ characters to help the user in guessing the word
		for (int i = 0; i < word.length(); i++) {
			display = display + "-";
		}
		
		System.out.println("Try to guess the word one letter at a time: " + display);
		
		do {
			//Types character by console
			letter = keyboard.nextLine().toLowerCase().charAt(0);
			
			finish = true;
			guess = false;
			
			for (int i = 0; i < word.length(); i++) {
				//Searches for the character in the random word
				if (Character.toLowerCase(word.charAt(i)) == letter) {
					
					guess = true;
					
					if (i == 0) {
						//Replaces first '-' for the character if found in that position
						display = Character.toUpperCase(letter) + display.substring(1);
						
					} else {
						//Replaces any other '-' for the character if found in that position
						display = display.substring(0, i) + letter + display.substring(i+1);
					}	
				}
				//Checks if there are any characters left to discover
				if (display.charAt(i) == '-') {
					
					finish = false;
				}
			}
			
			System.out.println(display);
			//Display if all characters were found
			if (finish == true) {
				
				System.out.println("You win the game!");
			}
			//Retry counter
			if (guess == false) {
				
				retries = retries - 1;

				if (retries == 0) {
					
					finish = true;
					
					System.out.println("Out of retries, you lose!");
				} else {
					
					System.out.println("Number of retries left: " + retries);
				}
			}		
		} while(finish == false);
	}
}