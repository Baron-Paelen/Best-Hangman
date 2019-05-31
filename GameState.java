import java.util.*;

public interface GameState{
	boolean isGameOver();
	
	String getWinner();
	
	Player getCurrentPlayer();
	
	ArrayList<String> getCurrentMoves();
	
	boolean makeMove();
	
	String toString();
}
