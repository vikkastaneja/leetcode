package leetcode;

/**
 * There are N children standing in a line. Each child is assigned a rating value.<br/>
 * You are giving candies to these children subjected to the following requirements:<br/>
 * 1. Each child must have at least one candy.<br/>
 * 2. Children with a higher rating get more candies than their neighbors.<br/>
 * What is the minimum candies you must give?
 * @author vtaneja
 *
 */
public class Candy {
	public int candy(int[] ratings) {
		if (ratings == null || ratings.length == 0) return 0;
		
		int []candies = new int[ratings.length];
		candies[0] = 1;
		for (int i = 1; i < ratings.length; i++) {
			if (candies[i] == 0) candies[i] = 1;
			
			if (ratings[i] > ratings[i - 1]) {
				candies[i] = candies[i - 1] + 1;
			} else if (ratings[i] < ratings[i - 1]) {
				candies[i - 1] = candies[i] + 1;
			}
		}
		
		int sum = 0;
		for (int candy : candies) {
			sum += candy;
		}
		
		return sum;
	}
}
