package leetcode;

import java.util.Arrays;

import junit.framework.TestCase;

public class MoveZeroesTest extends TestCase {
	private MoveZeroes tst = new MoveZeroes();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMoveZeroesValid() {
		int []actual = {0, 1, 0, 3, 12};
		int []expected = {1, 3, 12, 0, 0};
		
		tst.moveZeroes(actual);
		assertTrue(Arrays.equals(actual, expected));
	}

	public void testMoveZeroesValidNonZero() {
		int []actual = {1, 3, 12};
		int []expected = {1, 3, 12};
		
		tst.moveZeroes(actual);
		assertTrue(Arrays.equals(actual, expected));
	}
	
	public void testMoveZeroesSingleElementArray() {
		int []actual = {1};
		int []expected = {1};
		tst.moveZeroes(actual);
		assertTrue(Arrays.equals(actual, expected));
	}
}
