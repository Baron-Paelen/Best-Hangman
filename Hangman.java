import pkg.*;
import button.*;
import java.util.*;
public class Hangman implements GameState{
	private int counter;
	private EasyReader guess;
	private Player p;
	public ArrayList<Button<String>> keyboard;
	public String QWERTY;
	
	public Hangman(){
		//Black Knight here
		counter =0;
		p = new Player("Yeet");
		keyboard = new ArrayList<>();
		QWERTY = "QWERTYUIOPASDFGHJKLZXCVBNM";
		Color c1 = new Color(255,255,255);
		Color c2 = new Color(155,155,155);
		String yeet = "";
		
		for(int i = 0; i <= 10; i++){
			keyboard.add(i,new Button<String>(100+(25*i),500,25,25,c1,c2));
			yeet = QWERTY.substring(i,i+1);
			keyboard.get(i).addLabel(yeet);
			keybaord.get(i).draw();
		}
		for(int i = 11; i <= 19; i++){
			keyboard.add(i,new Button<String>(100+(25*(i-11))+6,525,25,25,c1,c2));
			yeet = QWERTY.substring(i,i+1);
			keyboard.get(i).addLabel(yeet);
			keybaord.get(i).draw();
		}
		for(int i = 20; i <= 26; i++){
			keyboard.add(i, new Button<String>(100+(25*(i-11))+12,550,25,25,c1,c2));
			yeet = QWERTY.substring(i,i+1);
			keyboard.get(i).addLabel(yeet);
			keybaord.get(i).draw();
		}
		
	}
	public void play(){
		while(!isGameover()){
			isGameOver();
			System.out.println("Please enter a guess: ");
			guess = new EasyReader();
			round(guess.readWord());
		}
	}
	public void round(String s){
		isGameOver();
		if(guess(s)){
			//add letter to text
			//remove letter from list
			
		}
		else{
			counter++;
			//put the black knight shit here ( cut off his limbs here )
		}
	}

	//and other things probably
	private boolean isGameOver(){
		if(counter==5){
			return true;
		}
		return false;
	}
	
	public String GetWinner(){
		return "You win!";
	}
	
	public Player getCurrentPlayer(){
		return p;
	}
	public boolean MakeMove(){
		return true;
	}
	public String toString(){
		if(counter==5){
			return "you have lost";
		}
		return Integer.toString(counter);
	}
	// public static void main(String[] args){
		
	// }
}