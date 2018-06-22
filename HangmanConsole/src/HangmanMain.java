package nameName;

import java.util.Scanner;
public class HangmanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner userInput = new Scanner(System.in);
	
		String randomWord;
		//String amountGuessed = "";
		char [] amountGuessed;
		int incorrectGuesses = 6;
		String letterGuess = "";
		
		
		
		System.out.println("Welcome to Hangman!");
		System.out.println("Please have one player type their word into the console below. Thank you.");
		randomWord = userInput.nextLine();
		System.out.println("Your word is: " + randomWord);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
		amountGuessed = new char [randomWord.length()];
		
		for (int index = 0; index < randomWord.length(); index++) {
			amountGuessed [index] = '-';
			
		}
		
		while (amountGuessed.indexOf("___ ") != -1 || incorrectGuesses > 0) {
			
			System.out.println(amountGuessed);
			System.out.println("Please guess a letter.");
			letterGuess = userInput.nextLine();
			
			if (randomWord.indexOf(letterGuess) == -1) {
				System.out.println("You're wrong~! NERD.");
				incorrectGuesses--;
				
			} else {
				
				
				
			}
			
				
		}
		
		
		
		
		
	}

}
