//Andrew Y
import pkg.*;
import pkg.Button;
import java.util.ArrayList;

public class Guess extends Word {

	private ArrayList<Text> boxes = new ArrayList<Text>(); 
	private String word = Word.getRandomWord();
	private char letters[] = word.getCharArray();
	private String alphabet[] = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

	public Guess() {
		makeBoxes();
	}

	private void makeBoxes(){
		for (int i = 0; i < word.length(); i++) {
			if(!word.substring(i, i + 1).equals(" ")) {
				boxes.add(new Text(100 + i*10, 200, " "));
			} else if(!word.substring(i, i + 1).equals("-")) {
				word.substring(i, i + 1).equals("-");
			} else 
				boxes.add(new Text(100 + i*10, 200, "_"));
		}
	}

	public boolean doGuess(char g) {
		for (char x: letters) if (g.equals("x")) return true;
	}
}