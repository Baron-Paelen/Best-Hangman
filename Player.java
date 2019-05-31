import pkg.*;

public class Player{
	private String name;
	
	public Player(String aName)
	{ 
		name = aName; 
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