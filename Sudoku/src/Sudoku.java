
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
			if(number>=1 && number<=9 && i>=0 && i<=8 && j>=0 && j<=8){
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
		return helpSolve(i,j);
	}

	private boolean helpSolve(int i, int j) {
		if (board[i][j] == 0) {
			for(int n=1;n<=9;n++){
				if(isAllowed(n,i,j)==true){
					board[i][j]=n;
					if(solveNext(i,j)==true){
						return true;
					}
					
				}
			}
			board[i][j]=0;
			return false;
			
		}else if(isAllowed(board[i][j], i ,j)){
			if(solveNext(i,j)==true){
				return true;
			}
			return false;
		}
		
		return false;

		
	}

	private boolean solveNext(int i, int j) {
		if(i == 8 && j == 8)
			return true;
		if(j < 8)
			return helpSolve(i, j + 1);
		else
			return helpSolve(i + 1, 0);
	}
/**
 * Denna metod kontrollerar först att värdet inte finns i raden, sen kolumnen och sen rutan
 * @param number
 * @param row
 * @param col
 * @return
 */
	private boolean isAllowed(int number, int row, int col){
		//Kontrollera värdet med raden
		for(int n=0;n<9;n++){
			if(board[row][n]==number && n!=row){
				return false;
			}
			
		}
		
		//kontrollera värdet med kollumnen
		for(int n=0;n<9;n++){
			if(board[n][col]==number && n!=col){
				return false;
			}
			
		}
		
		//Kontrollera värdet med 3x3 rutan
		int rutaRow=(row/3)*3;
		int rutaCol=(col/3)*3;
		for(int n=0; n<9; n++){
			for(int r=rutaRow;r<rutaRow + 3;r++){
				for(int c=rutaCol;c<rutaCol+3;c++){
					if(board[r][c]== number && r!=row && c!=col){
						return false;
					}
				}
				
				
			}
		}
		
		return true;
		
	}
}
