package leetcode;

import static org.junit.Assert.assertArrayEquals;
import junit.framework.TestCase;

public class RemoveDuplicatesFromSortedArrayTest extends TestCase {
	private RemoveDuplicatesFromSortedArray tst = new RemoveDuplicatesFromSortedArray();
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testRemoveDuplicatesNaive() {
		int [] input = {1,2,2,3,4,4,4,5,5,5};
		assertEquals(5, tst.removeDuplicatesNaive(input));
	}

	public void testRemoveDuplicatesNaiveNoDuplicate() {
		int [] input = {1,2,3,4,5};
		assertEquals(5, tst.removeDuplicatesNaive(input));
	}
	
	public void testRemoveDuplicatesNaiveNullInput() {
		assertEquals(0, tst.removeDuplicatesNaive(null));
	}

	public void testRemoveDuplicatesNaiveEmptyInput() {
		int [] input = {};
		assertEquals(0, tst.removeDuplicatesNaive(input));
	}
	
	public void testRemoveDuplicatesNaiveArrayValidation() {
		int [] input = {1, 2, 2, 3, 4, 4, 4, 5, 5, 5};
		int [] expected = {1, 2, 3, 4, 5, 4, 4, 5, 5, 5};
		assertEquals(5, tst.removeDuplicatesNaive(input));
		assertArrayEquals(input, expected);
	}
}
