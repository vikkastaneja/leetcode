package leetcode;

import java.util.Arrays;

import junit.framework.TestCase;

public class TwoSumSortedArrayTest extends TestCase {
	private TwoSumSortedArray ts = new TwoSumSortedArray();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testTwoSumPositive() {
		int[] expected = new int[]{1,2};
		int [] actual = ts.twoSum(new int[] {1, 2, 3, 4}, 3);
		assertTrue(Arrays.equals(expected, actual));
	}

	public void testTwoSumNegative() {
		int[] expected = new int[]{Integer.MIN_VALUE,Integer.MIN_VALUE};
		int [] actual = ts.twoSum(new int[] {1, 2, 3, 4}, 8);
		assertTrue(Arrays.equals(expected, actual));
	}
	
	public void testTwoSumEmpty() {
		int [] actual = ts.twoSum(new int[0], 3);
		assertTrue(Arrays.equals(null, actual));
	}

	public void testTwoSumNull() {
		int [] actual = ts.twoSum(null, 3);
		assertTrue(Arrays.equals(null, actual));
	}

	public void testTwoSumOneElement() {
		int [] actual = ts.twoSum(new int[] {3}, 3);
		assertTrue(Arrays.equals(null, actual));
	}
}
