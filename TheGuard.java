import java.util.Scanner;
public class TheGuard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub		 
		  Scanner userInput = new Scanner(System.in);
		  System.out.println("Choose a class:\n1 - Warrior\n2 - Thief\n3 - Mage");
		  int playerClass = userInput.nextInt();
		  System.out.println("There is a guard here, what do you do?\n1 - Fight him\n2 - Steal his wallet\n3 - Throw a fireball\n4 - Talk the guard into leaving\n5 - Intimidate the guard\n6 - Bond with the guard over your shared disdain for magic");
		  int playerChoice = userInput.nextInt();
		         
		  if(playerClass == 1 && playerChoice == 1) {
			  System.out.println("You use the elegant manners and treasured teachings your mother taught you and punch the guard in the face. Nice!");
		  }else if (playerClass == 2 && playerChoice == 2) {
			  System.out.println("You channel your inner Aladdin and swipe his wallet silently, tip-toeing suspiciously onto your magical carpet to escape. \nAfter remembering that your carpet is in fact not magical, you run away.");
		  }else if (playerClass == 3 && playerChoice == 3) {
			  System.out.println("You decide to opt for a subtle approach and proceed to set the guard on fire. He screams. \nYou help him stop, drop, and roll, and watch as the guy tumbles down the hill painfully, still on fire after refusing your help. Rude.");
		  }else if ((playerClass == 2 || playerClass == 3) && playerChoice == 4) {
			  System.out.println("You use your charm and lean against the nearest object, which turns out to be a movable trash can. You ungracefully crash to the floor. \nSmooth. \nWhether the guard was charmed or disturbed, he left for a while. \nSuccess!");
		  }else if ((playerClass == 1 || playerClass == 3) && playerChoice == 5) {
			 System.out.println("You tell the guard that if he doesn't leave, you will bring out your Spork of War™. He scoffs. \nYou bring out your Spork of War™. \n... \nHe agrees to leave."); 
		  }else if (!(playerClass == 3) && playerChoice == 6) {
			  System.out.println("You go up to the guard, greeting him with the complex salutations of a surfer dude, and flat out tell him that mages are lame. \nStars appear in his eyes. \nYou never quite made it past him, but hey! New friend!");
		  }else {
			  System.out.println("Your attempt fails miserably and the guard punches you into outer space. During your ascent, you make a makeshift astronaut suit from the guard's armor. \nYou land on Mars. You start a colony on Mars with deserter aliens from Venus and discover the cure for cancer. Unfortunately, you have no way to return to Earth. \nYou spend the rest of your days living on Mars, lamenting the tragic tale of your life.");
		  }
		         
		        userInput.close();
		    }
		 
		}
	


