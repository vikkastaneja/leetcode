package leetcode;

import junit.framework.TestCase;

public class ContainerWithMostWaterTest extends TestCase {
	private ContainerWithMostWater tst = new ContainerWithMostWater();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testMaxAreaValid() {
		int []a = {1,8,6,2,5,4,8,3,7};
		
		assertEquals(49, tst.maxArea(a));
	}

	public void testMaxAreaAllSame() {
		int []a = {5, 5, 5, 5, 5, 5};
		
		assertEquals(25, tst.maxArea(a));
	}
	
	public void testMaxAreaEmptyArray() {
		assertEquals(Integer.MIN_VALUE, tst.maxArea(new int[0]));
	}
	
	public void testMaxAreaOneElementInput() {
		int[]a = {1};
		assertEquals(Integer.MIN_VALUE, tst.maxArea(a));
	}
	
	public void testMaxAreaNegativeElementInInput() {
		int []a = {5, 10, 15, 11, 20, -13};
		
		assertEquals(Integer.MIN_VALUE, tst.maxArea(a));
	}
}
