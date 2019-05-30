import pkg.*;

public class Player implements GameState{
	private String name;
	
	public Player(String aName)
	{ 
		name = aName; 
	}
	
	isGameOver
	
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