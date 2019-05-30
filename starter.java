import pkg.*;
import java.util.ArrayList;

public class starter {
	
	public static void main(String... args)
	{
		GameState s = new Hangman(Word.getRandomWord());
		GameDriver d = new GameDriver(s);
		d.play();
		System.out.println(s.getWinner());
	}
}