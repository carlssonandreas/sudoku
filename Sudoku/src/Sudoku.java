
public class Sudoku {


	private int[][] board;

	
	
public Sudoku(){
	board = new int[9][9];
	
}
/**
 * Kontrollerar om a är en integer om inte=> throw exception
 * Om a integer kontrollera om mellan 1-9
 * Om det är det sätt in på plats i,j i sudokut
 * Om inte throw Exception
 */
public void insertNumber(Object a, int i, int j) {


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

	public int getNumber(int i, int j) {
		return board[i][j];
	}

	public void clear() {
		board = new int[9][9];

	}

	public boolean solve(int i, int j) {
		if (board[i][j] == 0) {

		}

		return false;
	}

	private boolean helpSolve(int i, int j) {
		if (i < 4 && j < 4) {

		}
		
		return false;

		
	}

}
