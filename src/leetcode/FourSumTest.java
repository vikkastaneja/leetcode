package leetcode;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

public class FourSumTest extends TestCase {
	private FourSum tst = new FourSum();
	
	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testFourSumValidSumSorted() {
		int[] nums = {-11, -9, 0, 1, 2, 7, 9, 10};
		List<List<Integer>> lst = tst.fourSum(nums, -19);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-11);
				add(-9);
				add(0);
				add(1);
			}
		});
		
		assertEquals(expected.size(), lst.size());
		assertThat(lst, is(expected));
		for (int i = 0; i < lst.size(); i++) {
			assertThat(lst.get(i), is(expected.get(i)));
		}
	}
	
	public void testFourSumValidSumUnsorted() {
		int[] nums = {-11, 10, 0, 2, -9, 1, 7, 9};
		List<List<Integer>> lst = tst.fourSum(nums, -19);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-11);
				add(-9);
				add(0);
				add(1);
			}
		});
		
		assertEquals(expected.size(), lst.size());
		assertThat(lst, is(expected));
		for (int i = 0; i < lst.size(); i++) {
			assertThat(lst.get(i), is(expected.get(i)));
		}
	}
	
	public void testFourSumNullInput() {
		List<List<Integer>> lst = tst.fourSum(null, 1);
		assertEquals(lst.size(), 0);
	}
	
	public void testFourSumLessThan4ElementsInInput() {
		int []nums = {0, 0, 0};
		List<List<Integer>> lst = tst.fourSum(nums, 0);
		assertEquals(lst.size(), 0);
	}
	
	public void testFourSumSumNotExist() {
		int[] nums = {-11, -9, 0, 1, 2, 7, 9, 10};
		List<List<Integer>> lst = tst.fourSum(nums, -100);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		
		assertEquals(expected.size(), lst.size());
		assertThat(lst, is(expected));
	}
	
	public void testFourSumValidSumDuplicate() {
		int[] nums = {-11, -11, -9, -9, 0, 1, 2, 7, 9, 10};
		List<List<Integer>> lst = tst.fourSum(nums, -19);
		assertNotNull(lst);
		List<List<Integer>> expected = new ArrayList<>();
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-11);
				add(-11);
				add(1);
				add(2);
			}
		});
		
		expected.add(new ArrayList<Integer>() {
			{
				add(-11);
				add(-9);
				add(0);
				add(1);
			}
		});
		
		assertEquals(expected.size(), lst.size());
		assertThat(lst, is(expected));
		for (int i = 0; i < lst.size(); i++) {
			assertThat(lst.get(i), is(expected.get(i)));
		}
	}
}
