package leetcode;

/**
 * Given an array nums, write a function to move all 0’s to the end of it while maintaining the relative order of the non-zero elements.<br/>
 * For example, given nums = [0, 1, 0, 3, 12], after calling your function, nums should be [1, 3, 12, 0, 0].
 * @author vtaneja
 *
 */
public class MoveZeroes {
	public void moveZeroes(int[] nums) {
		if (nums == null || nums.length <= 1) return;
		int current = 0;
		for (int j = 0; j < nums.length; j++) {
			if (nums[j] != 0) {
				nums[current++] = nums[j];
			}
		}
		
		while (current < nums.length) nums[current++] = 0;
	}
}
