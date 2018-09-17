package leetcode;

import junit.framework.TestCase;

public class ThreeSumClosestTest extends TestCase {
	private ThreeSumClosest tst = new ThreeSumClosest();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testThreeSumClosestEqualsSorted() {
		int [] a = {-5, -3, -1, 0, 2, 5, 7, 10};
		assertEquals(6, tst.threeSumClosest(a, 6));
	}
	
	public void testThreeSumClosestUnequals() {
		int[]a = {10, 10, 10, 10, 10};
		assertEquals(30, tst.threeSumClosest(a, 20));
	}
	
	public void testThreeSumNullInput() {
		assertEquals(Integer.MAX_VALUE, tst.threeSumClosest(null, -1));
	}
	
	public void testThreeSumEmptyInput() {
		assertEquals(Integer.MAX_VALUE, tst.threeSumClosest(new int[0], -1));
	}
	
	public void testThreeSumLessInput() {
		int[]a = {10, 10};
		assertEquals(Integer.MAX_VALUE, tst.threeSumClosest(a, 20));
	}
	
	public void testThreeSumUnsorted() {
		int [] a = {10, -3, -1, 0, 2, -5, 7, 5};
		assertEquals(6, tst.threeSumClosest(a, 6));
	}
}
