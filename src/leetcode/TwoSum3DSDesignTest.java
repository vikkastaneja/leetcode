package leetcode;

import org.hamcrest.collection.IsMapContaining;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.*;

import junit.framework.TestCase;

public class TwoSum3DSDesignTest extends TestCase {

	private TwoSum3DSDesign tst;
	
	protected void setUp() throws Exception {
		super.setUp();
		tst = new TwoSum3DSDesign();
	}

	protected void tearDown() throws Exception {
		tst = null;
		super.tearDown();
	}

	public void testAddSingleNoRepetion() {
		tst.add(1).add(3).add(5);
		Map<Integer, Integer> expected = new HashMap<Integer, Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(1, 1);
				put(3, 1);
				put(5, 1);
			}
		};
		
		assertThat(tst.getMap(), is(expected));
		assertThat(tst.getMap().size(), is(3));
		assertThat(tst.getMap(), IsMapContaining.hasEntry(3, 1));
		assertThat(tst.getMap(), not(IsMapContaining.hasEntry(0, 1)));
		assertThat(tst.getMap(), IsMapContaining.hasKey(5));
		assertThat(tst.getMap(), not(IsMapContaining.hasValue(2)));
	}

	public void testAddWithRepetion() {
		tst.add(1).add(3).add(5).add(3);
		Map<Integer, Integer> expected = new HashMap<Integer, Integer>() {
			/**
			 * 
			 */
			private static final long serialVersionUID = 1L;

			{
				put(1, 1);
				put(3, 2);
				put(5, 1);
			}
		};
		
		assertThat(tst.getMap(), is(expected));
		assertThat(tst.getMap().size(), is(3));
		assertThat(tst.getMap(), IsMapContaining.hasEntry(3, 2));
		assertThat(tst.getMap(), IsMapContaining.hasValue(2));
	}
	
	public void testFindOnEmpty() {
		assertFalse("Returning true on no value added", tst.find(0));
	}
	
	// This test uses add() method to fill the data. Hence it is not really a unit test.
	public void testFindValid() {
		tst.add(1).add(3).add(5).add(3);
		assertTrue(tst.find(4));
		assertTrue(tst.find(6));
	}
	
	public void testFindInvalid() {
		tst.add(1).add(3).add(5).add(3);
		assertFalse(tst.find(7));
	}
}
