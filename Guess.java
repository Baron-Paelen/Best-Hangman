//Andrew Y
import pkg.*;
import java.util.*;
import java.util.Arrays;

public class Guess extends Word {

	private ArrayList<Text> boxes = new ArrayList<Text>(); 
	public String word = Word.getRandomWord();
	private char letters[] = word.toCharArray();
	private String alphabet[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	//private ArrayList<String> unchosenLetters =  new ArrayList<String>(Arrays.asList(alphabet));

	public Guess() 
	{
		makeBoxes();
	}

	private void makeBoxes()
	{
		for (int i = 0; i < word.length(); i++) {
			if(letters.equals(" ")) {
				boxes.add(new Text(100 + i*10, 200, " "));
			} else if(letters.equals("-")) {
				letters.equals("-");
			} else 
				boxes.add(new Text(100 + i*10, 200, "_"));
			boxes.get(i).draw();
		}
	}

	/*
	public boolean doGuess(char g) 
	{
		for(char a : letters) {
			System.out.print(a + " ");
		}
		for (int i = 0; i < letters.length; i++) 
			if (g == letters[i]) { 
				//correct guess should invalidate the chosen button
				for (int j = 0; j < unchosenLetters.size(); j++) {
					boxes.get(i).setText(g + "");
				}
				System.out.println("Correct Letter: " + g);
				
				unchosenLetters.remove(Character.toString(letters[i]));
				return true;
			} else {
				//someone mark letter wrong

				System.out.println("Wrong Letter: " + g);
				unchosenLetters.remove(Character.toString(letters[i]));
				return false;
			};
		return false;
	}
	*/
	
	public boolean doGuess(char g)
	{
		int total = 0;
		for(int i = 0; i < letters.length; i++) {
			if(g == letters[i]) {
				boxes.get(i).setText(g + "");
				total++;
			} 
		}
		return total > 0 ? true : false;
	}
}