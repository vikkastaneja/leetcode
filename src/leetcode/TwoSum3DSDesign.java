package leetcode;

import java.util.*;

/**
 * Design and implement a TwoSum class. It should support the following operations: add and find.<br/>
 * add - Add the number to an internal data structure. <br/>
 * find - Find if there exists any pair of numbers which sum is equal to the value.<br/>
 * For example,<br/>
 * add(1);<br/>
 * add(3);<br/>
 * add(5);<br/>
 * find(4) -> true<br/>
 * find(7) -> false
 * @author vtaneja
 *
 */
public class TwoSum3DSDesign {
	/*
	 * There are two problems here:
	 * 1. To add
	 * 2. To find if there are any sum. 
	 * Note that this is happening repeatedly. So, we need an efficient data structure to store the values,
	 * and then quickly find out if sum is available, rather than running the algorithm repeatedly. 
	 */
	
	// This solution should handle duplicates.
    private Map<Integer, Integer> num = new HashMap<>();
	public TwoSum3DSDesign add(int a) {
		if (!num.containsKey(a)) {
			num.put(a, 1);
		} else {
			num.put(a, num.get(a) + 1);
		}
		
		return this;
	}
	
	public boolean find(int a) {
		for (Map.Entry<Integer, Integer> e : num.entrySet()) {
			int key = e.getKey();
			int value = e.getValue();
			if (key == a - key && value >= 2) return true;
			if (num.containsKey(a - key)) return true;
		}
		
		return false;
	}
	
	// This package private getter of map is only for testing purpose
	Map<Integer, Integer> getMap() {
		return Collections.unmodifiableMap(num);
	}
}
