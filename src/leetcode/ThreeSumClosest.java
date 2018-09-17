package leetcode;

import java.util.Arrays;

/**
 * Given an array S of n integers, find three integers in S such that the sum is closest
 * to a given number, target. <br/>Return the sum of the three integers. You may assume that each
 * input would have exactly one solution.<br/>
 * For example, given array S = {-1 2 1 -4}, and target = 1.<br/>
 * The sum that is closest to the target is 2. (-1 + 2 + 1 = 2)
 * @author vtaneja
 *
 */
public class ThreeSumClosest {
	public int threeSumClosest(int[] nums, int target) {
		if (nums == null || nums.length == 0) return Integer.MAX_VALUE;
		Arrays.sort(nums);
		target = Math.abs(target);
		int minSum = Integer.MAX_VALUE;
		
		for (int i = 0; i < nums.length - 3; i++) {
			if (i == 0 || nums[i] != nums[i - 1]) {
				for (int j = i + 1, k = nums.length - 1; j < k;) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == target) {
						return sum;
					} else if (Math.abs(sum - target) > minSum) {
						j++;
					} else {
						k--;
						minSum = sum;
					}
				}
			}
		}
		
		return minSum;
	}
}
