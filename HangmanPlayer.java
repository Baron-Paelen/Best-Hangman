import pkg.*;

public class HangmanPlayer {
	private String name;
	
	public HangmanPlayer(String aName)
	{ 
		name = aName		
	}
	
	public String getName(){
		return name;
	}
	
	public String getNextMove(GameState state)
	{ 
		EasyReader c = new EasyReader();
		return c.readWord();
	}
	
	public String toString() {
		return name;
	}
}