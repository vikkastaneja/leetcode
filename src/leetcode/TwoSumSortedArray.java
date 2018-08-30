package leetcode;

/**
 * Given an array of integers that is already sorted in ascending order, 
 * find two numbers such that they add up to a specific target number.<br/>
 * Leetcode problem #167
 * @author vtaneja
 *
 */
public class TwoSumSortedArray {
	public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length <= 1) return null;
        int [] ret = new int[] {Integer.MIN_VALUE, Integer.MIN_VALUE};
        
        	for (int i = 0, j = numbers.length - 1; i < j;) {
        		int sum = numbers[i] + numbers[j];
        		if (sum == target) {
        			ret[0] = i + 1;
        			ret[1] = j + 1;
        			break;
        		} else if (sum < target) {
        			i++;
        		} else {
        			j--;
        		}
        	}
        	
        return ret;
    }
}
