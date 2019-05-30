import pkg.*;
public class Hangman implements GameState{
	private int counter;
	private EasyReader guess;
	private Player p;
	
	public Hangman(){
		//black knight here
		counter =0;
		p = new Player("Yeet");
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
}