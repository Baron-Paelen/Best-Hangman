import pkg.*;
public class Hangman implements GameState{
	private String word;
	private Ellipse head;
	private Line torso;
	private Line l_arm;
	private Line r_arm;
	private Line l_leg;
	private Line r_leg;
	private counter;
	private EasyReader guess;
	private Player p;
	
	public Hangman(String s){
		word = s;
		//not the actual shit
		head = new Ellipse(250,250,50,50);
		torso = new Torso(250,250,250,50);
		l_arm = new Line(250,250,50,50);
		r_arm = new Line(250,300,50,50);
		l_leg = new Line(250,300,50,50);
		r_leg = new Line(250,300,50,50);
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

	//and other things
	public boolean guess(String s){
		if(s.equals(word)){
			return true;
		}
		return false;
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