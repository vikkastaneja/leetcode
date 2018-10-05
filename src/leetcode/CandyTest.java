package leetcode;

import junit.framework.TestCase;

public class CandyTest extends TestCase {
	private Candy tst = new Candy();
	public void testCandyAllDifferent1() {
		assertEquals(4, tst.candy(new int[] {1,2,1}));
	}

	public void testCandyAllDifferent2() {
		assertEquals(5, tst.candy(new int[] {1,0,2}));
	}
	
	public void testCandyAllDifferent3() {
		assertEquals(4, tst.candy(new int[] {1,2,2}));
	}
	
	public void testCandyAllSame() {
		assertEquals(3, tst.candy(new int[] {1,1,1}));
	}
}
