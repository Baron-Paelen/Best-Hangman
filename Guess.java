//Andrew Y
import pkg.*;
import java.util.*;
import java.util.Arrays;

public class Guess extends Word {

	private ArrayList<Text> boxes = new ArrayList<Text>(); 
	public String word = Word.getRandomWord();
	private char letters[] = word.toCharArray();
	private String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	private ArrayList<String> unchosenLetters =  new ArrayList<String>(Arrays.asList(alphabet));

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
			boxes.get(i).draw();
		}
	}

	public boolean doGuess(char g) {
		for (int i = 0; i < letters.length; i++) 
			if (g == letters[i]) { 
				//correct guess should invalidate the chosen button
				for (int j = 0; j < letters.length; j++) {
					boxes.get(i).setText(g + "");
				}
				unchosenLetters.remove(letters[i]);
				return true;
			} else {
				//someone mark letter wrong

				unchosenLetters.remove(letters[i]);
				return false;
			};
	}
}