package leetcode;
import java.util.*;

/**
 * Given an array of integers, find two numbers such that they add up to a specific target number.<br/>
 * Unsorted array
 * @author vtaneja
 *
 */
public class TwoSum {

	public int[] twoSum(int[] numbers, int target) {
		if (numbers == null || numbers.length <= 1) return null;
		
		HashMap<Integer, Integer> map = new HashMap<>();
		int [] ret = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			if (map.containsKey(target - numbers[i])) {
				int j = map.get(target - numbers[i]);
				if (i < j) {
					ret[0] = i + 1;
					ret[1] = j + 1;
				} else {
					ret[0] = j + 1;
					ret[1] = i + 1;
				}
				break;
			} else {
				map.put(numbers[i], i);
			}
		}
		
		return ret;
	}
}
