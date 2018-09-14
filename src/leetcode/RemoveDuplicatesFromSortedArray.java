package leetcode;

/**
 * Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.<br.>
 * Do not allocate extra space for another array, you must do this in place with constant memory.<br/>
 * For example, given input array A = [1,1,2], your function should return length = 2, and A is now [1,2].
 * @author vtaneja
 *
 */
public class RemoveDuplicatesFromSortedArray {
	public int removeDuplicatesNaive(int[] a) {
		if (a == null || a.length == 0) return 0;
		int count = 1;
		for (int i = 0, j = 1; i <= j && j < a.length; j++) {
			if (a[i] != a[j]) {
				a[i+1] = a[j];
				i++;
				count++;
			}
		}
		
		return count;
	}

}
