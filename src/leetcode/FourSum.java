package leetcode;

import java.util.*;

/**
 * Given an array S of n integers, are there elements a, b, c, and d in S such that a + b + c + d = target?<br/>
 * Find all unique quadruplets in the array which gives the sum of target.<br/>
 * Note: Elements in a quadruplet (a,b,c,d) must be in non-descending order. (ie, a ≤ b ≤ c ≤ d)<br/> 
 * The solution set must not contain duplicate quadruplets.
 * @author vtaneja
 *
 */
public class FourSum {
	/* Four numbers with a given sum. Array is unsorted.
	*/



	public List<List<Integer>> fourSum(int [] a, int v) {
	    List<List<Integer>> retList = new ArrayList<>();
	    if (a == null || a.length < 4) return retList;
	    Arrays.sort(a); // n logn order
	    int len = a.length;
	    for (int i = 0; i < len - 4; i++) {
	        if ( i == 0 || a[i] != a[i - 1]) {
	            for (int j = i + 1; j < len - 3; j++) {
	                //Need logic here to remove j's duplicates
	                if (j < len - 4 && a[j] == a[j + 1]) continue;
	                for (int k = j + 1, z = len - 1; k < z; ) {
	                    int sum = a[i] + a[j] + a[k] + a[z];
	                    if (sum == v) {
	                        List<Integer> l = new ArrayList<Integer>();
	                        l.add(a[i]);
	                        l.add(a[j]);
	                        l.add(a[k]);
	                        l.add(a[z]);
	                        
	                        retList.add(l);
	                        k++;
	                        z--;
	                        
	                        // Remove duplicates
	                        while (k < len - 2 && a[k] == a[k - 1]) {
	                            k++;
	                        }
	                        
	                        while (z > k && a[z] == a[z + 1]) {
	                            z--;
	                        }
	                    } else if (sum < v) {
	                        k++;
	                    } else {
	                        z--;
	                    }
	                }
	            }
	        }
	    }
	    
	    return retList;
	}
}
