


public class Sudoku {
	
private int[][] board;
	
	
public Sudoku(){
	board = new int[9][9];
	
}

public void insertNumber(Object a, int i, int j){

	if(a instanceof Integer){
		int number= (int) a;
		if(number>=1 && number<=9){
			board[i][j]=number;
			
		}else{
			throw new IllegalArgumentException("You need to insert a number between 1-9");
		}
		
		
	}else{
		throw new IllegalArgumentException("You need to insert a number.");
		
		
		
	}
	
}

public int getNumber(int i, int j){
	return board[i][j];
}

public void clear(){
	
}

public boolean solve(int i, int j){
	return false;
}

}
