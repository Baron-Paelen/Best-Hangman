import pkg.*;
public class HangmanLives
{
		int xloc, yloc;
		int counter = 0;
		Picture stages[];
        public HangmanLives(int x, int y){
        	xloc = x;
        	yloc = y;
			stages = new Picture[6];
			for(int num = 0; num < 6; num++){
				stages[num] = new Picture("hung/stage"+num+".gif");
				stages[num].translate(x,y);
        		stages[num].grow(-70,-100);
			}
				stages[0].draw();

        }
        public int removeLife(){
        	
        	if(counter+1 <6){
        		counter++;
        		stages[counter-1].undraw();
        		stages[counter].draw();
        		}
			return counter-6;

        }
        public void resetLives(){
        	stages[counter].undraw();
			counter = 0;
			stages[0].draw();
        }
}
