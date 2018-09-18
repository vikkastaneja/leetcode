package leetcode;

/**
 * Given n non-negative integers a1, a2, ..., an, where each represents a point at coordinate (i, ai).<br/>
 * n vertical lines are drawn such that the two endpoints of line i is at (i, ai) and (i, 0). <br/>
 * Find two lines, which together with x-axis forms a container, such that the container contains the most water.
 * @author vtaneja
 *
 */
public class ContainerWithMostWater {

	// We will find bigger line each time and leave the smaller one. Hence to ensure that we will get max area coverage.
	public int maxArea(int[] height) {
		if (height == null || height.length < 2) return Integer.MIN_VALUE;
		
		int maxValue = Integer.MIN_VALUE;
		for (int i = 0, j = height.length - 1; i < j; ) {
			if (height[i] < 0 || height[j] < 0) return Integer.MIN_VALUE;
			int temp = (height[i] < height[j] ? height[i] : height[j]) * (j - i);
			maxValue = maxValue < temp ? temp : maxValue;
			if (height[i] < height[j]) {
				int t1 = height[i];
				while (t1 >= height[i] && i < j) i++;
			} else {
				int t1 = height[j];
				while (t1 >= height[j] && i < j) j--;
			} 
		}
		
		return maxValue;
	}
}
