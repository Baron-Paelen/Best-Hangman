import java.util.*;

public interface GameState{
	boolean isGameOver();
	
	String getWinner();
	
	Player getCurrentPlayer();
	
	ArrayList<Point> getCurrentMoves();
	
	boolean makeMove();
	
	String toString();
}
