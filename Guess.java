//Andrew Y
import pkg.*;
import java.util.ArrayList;

public class Guess extends Word {

	ArrayList<Text> boxes = new ArrayList<Text>(); 
	String word = Word.getRandomWord();

	public Guess() {
		makeBoxes();
		for (int i = 0; i < word.length(); i++) {

			
			
		}
	}
	private void makeBoxes(){
		for (int i = 0; i < word.length(); i++) {
			if(!word.substring(i, i + 1).equals(" ")) {
				boxes.add(new Text(100 + i*10, 200, " "));
			} else if(!word.substring(i, i + 1).equals("-")) {
				word.substring(i, i + 1).equals("-")
			} else 
				boxes.add(new Text(100 + i*10, 200, "_"));
		}
	}
}