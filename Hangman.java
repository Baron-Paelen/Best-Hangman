import pkg.*;
import java.util.*;
public class Hangman implements GameState{
	private int counter;
	private EasyReader guess;
	private Player p;
	public ArrayList<Button> keyboard;
	//public ArrayList<ButtonRunnable<String>> buttonRunnables;
	public String QWERTY;
	//private volatile String yeet;
	private Guess g;
	
	public Hangman(){
		//Black Knight here
		counter =0;
		g = new Guess();
		//g.makeBoxes();
		p = new Player("Yeet");
		keyboard = new ArrayList<>();
		//buttonRunnables = new ArrayList<>();
		QWERTY = "QWERTYUIOPASDFGHJKLZXCVBNM";
		Color c1 = new Color(255,255,255);
		Color c2 = new Color(155,155,155);
		int a = 50;
		for(int i = 0; i < 10; i++){
			keyboard.add(i,new Button(100+(a*i)+4*i,500,a,a,c1,c2));
			final String yeet = QWERTY.substring(i,i+1);
			final int inter = i;
			keyboard.get(i).addMethod(new Runnable() {
				public void run() {
					g.doGuess(yeet.charAt(0));
					keyboard.get(inter).toggle();
				}
			});
			keyboard.get(i).addLabel(yeet);
			keyboard.get(i).draw();
		}
		for(int i = 10; i < 19; i++){
			keyboard.add(i,new Button(100+(a*(i-10))+6+4*(i-10)+a/2,500+a+4,a,a,c1,c2));
			final String yeet = QWERTY.substring(i,i+1);
			final int inter = i;
			keyboard.get(i).addMethod(new Runnable() {
				public void run() {
					g.doGuess(yeet.charAt(0));
					keyboard.get(inter).toggle();
				}
			});
			keyboard.get(i).addLabel(yeet);
			keyboard.get(i).draw();
		}
		for(int i = 19; i < 26; i++){
			keyboard.add(i, new Button(100+(a*(i-19))+4*(i-19)+10+a,500+2*a+8,a,a,c1,c2));
			final String yeet = QWERTY.substring(i,i+1);
			final int inter = i;
			keyboard.get(i).addMethod(new Runnable() {
				public void run() {
					g.doGuess(yeet.charAt(0));
					keyboard.get(inter).toggle();
				}
			});
			keyboard.get(i).addLabel(yeet);
			keyboard.get(i).draw();
		}
		
	}
	
	public void play(){
		while(!isGameOver()){
			isGameOver();
			System.out.println("Please enter a guess: ");
			guess = new EasyReader();
			round(guess.readWord());
		}
	}
	
	public void round(String s){
		// isGameOver();
		// if(guess(s)){
			//add letter to text
			//remove letter from list
			
		// }
		// else{
			// counter++;
			//put the black knight shit here ( cut off his limbs here )
		// }
	}

	//and other things probably
	public boolean isGameOver(){
		if(counter==5){
			return true;
		}
		return false;
	}
	
	public String getWinner(){
		return "You win!";
	}
	
	public Player getCurrentPlayer(){
		return p;
	}
	
	public boolean makeMove(){
		return true;
	}
	
	public String toString(){
		if(counter==5){
			return "you have lost";
		}
		return Integer.toString(counter);
	}
	
	public ArrayList<String> getCurrentMoves(){
		ArrayList<String> YEET = new ArrayList<String>();
		return YEET;
	}
	
	// public static void pressLetter(String... a)
	// {
		// if(a.length > 0) {
			// System.out.println(a[0]);
		// }
	// }
	
	public static void main(String[] args){
		//Hangman h = new Hangman();
		Guess g = new Guess();
		String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		char[] abc = alpha.toCharArray();
		for(char a : abc) {
			g.doGuess(a);
		}
	}
}