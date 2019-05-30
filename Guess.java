//Andrew Y
import pkg.*;
import pkg.Button;
import java.util.ArrayList;

public class Guess extends Word {

	private ArrayList<Text> boxes = new ArrayList<Text>(); 
	public String word = Word.getRandomWord();
	private char letters[] = word.getCharArray();
	private String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private ArrayList<String> unchosenLetters =  ArrayList<String>(Arrays.asList(alphabet));
	private Button[] bootuns = new Button[26];

	public Guess() {
		makeBoxes();
	}

	private void makeBoxes(){
		for (int i = 0; i < word.length(); i++) {
			if(!letters.equals(" ")) {
				boxes.add(new Text(100 + i*10, 200, " "));
			} else if(!letters.equals("-")) {
				letters.equals("-");
			} else 
				boxes.add(new Text(100 + i*10, 200, "_"));
		}
	}

	public boolean doGuess(char g) {
		for (char x : letters) 
			if (g.equals("x")) { 
				//correct guess should invalidate the chosen button

				unchosenLetters.remove(x);
				return true;
			} else {
				//someone mark letter wrong

				unchosenLetters.remove(x);
				return false;
			};
	}
}