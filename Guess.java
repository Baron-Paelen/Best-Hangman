import pkg.*;
import java.util.ArrayList;

public class Guess extends Word {

	ArrayList<Text> boxes = new ArrayList<Text>(); 
	String word = Word.getRandomWord();

	public Guess() {
		for (int i = 0; i < word.length(); i++) {
			if(word.substring(i, i + 1)) {

			}
			boxes.add();
			
		}
	}
}