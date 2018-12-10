

import static org.junit.Assert.*;

import java.io.PrintStream;
import java.util.NoSuchElementException;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSukdoku {
	Sudoku s;

	@Before
	public void setUp() throws Exception {
		s = new Sudoku();
	}

	@After
	public void tearDown() throws Exception {
		s = null;
	}
	
	@Test
	public void testInsertNumber() {
		try {
			s.insertNumber("a",1,1);
			fail("Should raise NoSuchElementException");
		} catch (NoSuchElementException e) {
			// successful test
		}
	}
	
	@Test
	public void testGetNumber() {
		s.insertNumber(1, 1, 1);
		assertTrue("getNumber false", s.getNumber(1,1) == 1);
	}
	
	@Test
	public void testClear() {
		s.insertNumber(1, 1, 1);
		s.clear();
		assertTrue("clear false", s.getNumber(1,1) == 0);
	}
	
	@Test
	public void testsolveEmpty() {
		assertTrue("Could not find solution of empty sudoku", s.solve(0,0) );
	}
	
	@Test
	public void testsolvesolveble() {
		s.insertNumber(8, 1, 3);
		s.insertNumber(9, 1, 6);
		s.insertNumber(6, 1, 8);
		s.insertNumber(2, 1, 9);
		s.insertNumber(5, 2, 9);
		s.insertNumber(1, 3, 1);
		s.insertNumber(2, 3, 3);
		s.insertNumber(5, 3, 4);
		s.insertNumber(2, 4, 4);
		s.insertNumber(1, 4, 5);
		s.insertNumber(9, 4, 8);
		s.insertNumber(5, 5, 2);
		s.insertNumber(6, 5, 7);
		s.insertNumber(6, 6, 1);
		s.insertNumber(2, 6, 8);
		s.insertNumber(8, 6, 9);
		s.insertNumber(4, 7, 1);
		s.insertNumber(1, 7, 2);
		s.insertNumber(6, 7, 4);
		s.insertNumber(8, 7, 6);
		s.insertNumber(8, 8, 1);
		s.insertNumber(6, 8, 2);
		s.insertNumber(3, 8, 5);
		s.insertNumber(1, 8, 7);
		s.insertNumber(4, 9, 7);
		assertTrue("Could not find solution of solveble sudoku", s.solve(0,0) );
	}
	
	@Test
	public void testsolveFalseRow() {
		s.insertNumber(1, 1, 1);
		s.insertNumber(1, 2, 1);
		assertFalse("Could find solution of unsolve(0,0)ble sudoku", s.solve(0,0) );
		String string = System.console().readLine();
		assertEquals("Does not tell Unsolve(0,0)ble soduko", "Unsolve(0,0)ble soduko", string);
	}
	
	@Test
	public void testsolveFalseColumn() {
		s.insertNumber(1, 1, 1);
		s.insertNumber(1, 1, 2);
		assertFalse("Could find solution of unsolve(0,0)ble sudoku", s.solve(0,0) );
		String string = System.console().readLine();
		assertEquals("Does not tell Unsolve(0,0)ble soduko", "Unsolve(0,0)ble soduko", string);
	}
	
	@Test
	public void testsolveFalseRegion() {
		s.insertNumber(1, 1, 1);
		s.insertNumber(1, 2, 2);
		assertFalse("Could find solution of unsolve(0,0)ble sudoku", s.solve(0,0) );
		String string = System.console().readLine();
		assertEquals("Does not tell Unsolve(0,0)ble soduko", "Unsolve(0,0)ble soduko", string);
	}
}
