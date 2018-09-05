package leetcode;

import java.util.*;

import junit.framework.TestCase;
import org.hamcrest.collection.IsArrayContaining;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

public class ThreeSumTest extends TestCase {
	private ThreeSum tst;
	protected void setUp() throws Exception {
		super.setUp();
		tst = new ThreeSum();
	}

	protected void tearDown() throws Exception {
		tst = null;
		super.tearDown();
	}

	public void testThreeSumUnsorted() {
		int[] nums = {0, -1, 1, 9, 7, 2, 10, -2}; // -2, -1, 0, 1, 2, 7, 9, 10
		List<List<Integer>> lst = tst.threeSum(nums);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		expected.add(new ArrayList<Integer>() {
			{
				add(-2);
				add(0);
				add(2);
			}
		});
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-1);
				add(0);
				add(1);
			}
		});
		
		assertEquals(expected.size(), lst.size());
		assertThat(lst, is(expected));
		assertThat(lst.get(0), is(expected.get(0)));
		assertThat(lst.get(1), is(expected.get(1)));
	}

	public void testThreeSumSorted() {
		int[] nums = {-11, -9, 0, 1, 2, 7, 9, 10};
		List<List<Integer>> lst = tst.threeSum(nums);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-11);
				add(1);
				add(10);
			}
		});
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-11);
				add(2);
				add(9);
			}
		});
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-9);
				add(0);
				add(9);
			}
		});
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-9);
				add(2);
				add(7);
			}
		});
		
		assertEquals(expected.size(), lst.size());
		assertThat(lst, is(expected));
		for (int i = 0; i < lst.size(); i++) {
			assertThat(lst.get(i), is(expected.get(i)));
		}
	}
	
	public void testThreeSumNullInput() {
		List<List<Integer>> lst = tst.threeSum(null);
		assertNull(lst);
	}
	
	public void testThreeSumLessThan3ElementsInInput() {
		int []nums = {0, 0};
		List<List<Integer>> lst = tst.threeSum(nums);
		assertNull(lst);
	}
	
	public void testThreeSumNoMatch() {
		int[] nums = {1, 2, 7, 9, 10};
		List<List<Integer>> lst = tst.threeSum(nums);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		assertEquals(expected.size(), lst.size());
	}
}
