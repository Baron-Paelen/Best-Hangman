// stewart worked on this

import pkg.*;
import java.util.ArrayList;

public class Word {
	
	public static String getRandomWord()
	{
		ArrayList<String> words = new ArrayList<String>();
		EasyReader c = new EasyReader("Hangman.txt");
		while(!c.eof()) {
			words.add(c.readLine());
		}
		return words.get((int)(Math.random() * words.size()));
 	}
}