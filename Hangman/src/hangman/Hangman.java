package hangman;

import processing.core.PApplet;
import processing.core.PFont;

public class Hangman extends PApplet {
	
	PFont font;
	int textYlocation;
	
	
	String typing = "";
	String name = "";
	
	
	public static void main(String[] args) {
		PApplet.main("hangman.Hangman");
	}
	
	enum GameState {
		BEGINNING,
		RUNNING
	}
	
	static GameState currentState;

	public void setup() {
		currentState = GameState.BEGINNING;
		font = createFont("Arial", 30, true);
	}

	public void settings() {
		size(900,800);
	}
	
	
	public void draw() {
		background(255,255,255);
		textYlocation = 1;
		/* textFont(font);
		  fill(0,0,0);
	        background(255,255,255);
		 text("Welcome to Hangman!", 200, 100);
		 fill(255,255,255);
		
         drawRunning();
        drawText("Please have one player input a random word in all lowercase.");
        drawText(typing);
        if (name != "") {
        	drawText("Your word is: " + name); 
        } */
         drawBeginning();
        switch(currentState) {
        case BEGINNING:
        	drawBeginning();
        	break;
        case RUNNING:
        	drawRunning();
        	break;
        }
     
	}
	
	public void drawText (String text) {
		textFont(font);
		fill(200,100,0);
		text(text, 15,500 + (textYlocation * 20));
		textYlocation += 2;
	}
	
	public void keyPressed() {
		if (key == '\n') {
			name = typing;
		} else {
			typing = typing + key;
		}
	
	}
	
	public void drawRunning() {
		clear();
		background(255,255,255);
		text("Welcome to Hangman!", 200, 100);
		fill(255,255,255);
		 rect(100, 400, 80, 30);
	        line(140,400,140,200);
	        line(140,200, 280,200);
	        line(280,200,280,250);
	}
	
	public void drawBeginning() {
		background(255,255,255);
		fill(0,0,0);
		rect(300,400,200,100);
		drawText("Have a player input a word (lowercase) and press the box above.");
        drawText(typing);
        	if (name != "") {
        	drawText("Your word is: " + name);
        }

	}
	
	public void mousePressed() {
		if( currentState == GameState.BEGINNING && mouseX > 300 && mouseX < 500 && mouseY > 400 && mouseY < 500) { 
			currentState = GameState.RUNNING;
		}
	}
	

}
