
public class Sudoku {

	private int[][] board;

	public Sudoku() {
		board = new int[9][9];

	}

	public void insertNumber(Object a, int i, int j) {

		if (a instanceof Integer) {

		} else {

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
