package leetcode;

import java.util.Arrays;

import junit.framework.*;

public class TwoSumTest extends TestCase {
	private TwoSum tst = new TwoSum();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testTwoSumAscending() {
		int[] expected = new int[]{1,2};
		int [] actual = tst.twoSum(new int[] {1, 2, 3, 4}, 3);
		assertTrue(Arrays.equals(expected, actual));
	}

	public void testTwoSumDescending() {
		int[] expected = new int[]{3,4};
		int [] actual = tst.twoSum(new int[] {4, 3, 2, 1}, 3);
		assertTrue(Arrays.equals(expected, actual));
	}

	public void testTwoSumRandom() {
		int[] expected = new int[]{2,4};
		int [] actual = tst.twoSum(new int[] {4, 2, 3, 1}, 3);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	public void testTwoSumEmpty() {
		int [] actual = tst.twoSum(new int[0], 3);
		assertTrue(Arrays.equals(null, actual));
	}

	public void testTwoSumNull() {
		int [] actual = tst.twoSum(null, 3);
		assertTrue(Arrays.equals(null, actual));
	}

	public void testTwoSumOneElement() {
		int [] actual = tst.twoSum(new int[] {3}, 3);
		assertTrue(Arrays.equals(null, actual));
	}
}
