import pkg.*;
import java.util.ArrayList;

public class Player extends Point implements GameState {
	public String name;
	public static int x2 = Point.x;
	public static int y2 = Point.y;
	public static int[][] sol = new int[8][8]; 

	public ArrayList<Point> movez = getCurrentMoves();
	public int[][] solshun = new int[8][8];

	public boolean isGameOver() {
		if (starter.playerLoc.getPosNum().equals("64")) {
			return true;
		} else {
			return false;
		}
	}
	
	//All possible moves relative to the Player
	public ArrayList<Point> getCurrentMoves() {
		int[] xCoords = {  2, 1, -1, -2, -2, -1,  1,  2 }; 
    	int yCoords[] = {  1, 2,  2,  1, -1, -2, -2, -1 }; 

    	ArrayList<Point> moves = new ArrayList<Point>();

    	for (int i = 0; i < 8; i++) {
    		moves.add(new Point(xCoords[i], yCoords[i], null));
    	}
    	return moves;
	}

	//Just the name :p
	public Player(String aName)
	{ 
		super(0, 0, aName);
		name = aName; 
	}

	public Player getCurrentPlayer(){
		return null;
	}
	
	public String getName(){
		return name;
	}

	public String getWinner() {
		if (isGameOver()) {
			return name;
		} else {
			return null;
		}
	}
	
	//Looks for a move or something idk
	public boolean getNextMove(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) { 
        int  x2, y2; 
        if (movei == 64) 
            return true; 
  
        // Trys all moves at (x,y)
        for (int k = 0; k < 8; k++) { 
            x2 = x + xMove[k]; 
            y2 = y + yMove[k]; 
            if (chkLimit(x2, y2, sol)) { 
                sol[x2][y2] = movei; 
                if (getNextMove(x2, y2, movei + 1, 
                                sol, xMove, yMove)) 
                    return true; 
                else
                    // backtracking that I'm kinda proud of
                    sol[x2][y2] = -1;
            } 
        } 
  
        return false; 
    }
	
	public boolean makeMove()
	{
        
  
       /* xMove and yMove are representations of the possible moves */
        int[] xMove = {2, 1, -1, -2, -2, -1, 1, 2}; 
        int[] yMove = {1, 2, 2, 1, -1, -2, -2, -1}; 
  
        /* Initialization of solution matrix */
        for (int x = 0; x < 8; x++) {
            for (int y = 0; y < 8; y++) 
                sol[x][y] = -1; 
        }
        // int rand1 = (int)(Math.random()*8);
        // int rand2 = (int)(Math.random()*8);
        Point bob = rand1();
        System.out.println(bob);
        sol[bob.getX()][bob.getY()] = 0; 
        if (!getNextMove(bob.getX(), bob.getY(), 1, sol, xMove, yMove)) { 
            System.out.println("No solution! :( "); 
            return false; 
        } /*else
            printSolution(sol);*/ 
  
        return true; 
	}
    public void printSolution(int sol[][]) { 
        for (int ex = 0; ex < 8; ex++) { 
            for (int why = 0; why < 8; why++) 
                System.out.print(sol[ex][why]+1 + " "); 
            System.out.println(); 
        } 
    }   

	//Makes sure bub is in chessboard
	public boolean chkLimit(int x, int y, int sol[][]) { 
        return (x >= 0 && x < 8 && y >= 0 && y < 8 && sol[x][y] == -1); 
    }

    public Point rand1() {
        return new Point((int)(Math.random() * 2)*7, (int)(Math.random() * 2)*7);
    }
	
	public String toString() {
		return name;
	}

    public void main(String args[]) { 
        makeMove(); 
    } 


}









