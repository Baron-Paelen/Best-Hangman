public class GameDriver{
	private GameState state;
	
	public GameDriver(GameState initial)
	{ 
		state = initial; 
	}

	public void play()
	{ 
		System.out.println(state);
		while(!state.isGameOver()) {
			String temp = state.getCurrentPlayer().getNextMove(state);
			System.out.println(state.getCurrentPlayer().getName() + " made the move: " + temp);
			state.makeMove(temp);
		}
		if(state.getWinner() != null) {
			System.out.println(state.getWinner() + " wins!");
		}
		else {
			System.out.println("Game ends in a draw");
		}
	}
}
