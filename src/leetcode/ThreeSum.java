package leetcode;

import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c in S such that a + b + c = 0?<br>
 * Find all unique triplets in the array which gives the sum of zero.<br/>
 * Note: Elements in a triplet (a,b,c) must be in non-descending order. (ie, a ≤ b ≤ c)<br/>
 * The solution set must not contain duplicate triplets.
 * @author vtaneja
 *
 */
public class ThreeSum {
	public List<List<Integer>> threeSum(int[] nums) {
		if (nums == null || nums.length < 3) return null;
		Arrays.sort(nums);
		List<List<Integer>> finalList = new ArrayList<>();
		for (int i = 0; i < nums.length - 3; i++) {
			int ti = nums[i];
			for (int j = i + 1, k = nums.length - 1; j < k;) {
				int tj = nums[j];
				int tk = nums[k];
				if (ti + tj + tk == 0) {
					List<Integer> lst = new ArrayList<>();
					lst.add(ti);
					lst.add(tj);
					lst.add(tk);
					finalList.add(lst);
					j++;
				} else if (ti + tj + tk < 0) {
					j++;
				} else {
					k--;
				}
			}
		}
		
		return finalList;
	}
}
