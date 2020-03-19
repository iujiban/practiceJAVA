package threeSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? 
 * Find all unique triplets in the array which gives the sum of zero.
 */
public class threeSumsolution {
	public List<List<Integer>> threeSum(int[] nums) {
		Set<List<Integer>> set = new HashSet<>();
		Arrays.sort(nums);
		int target = 0;
		for (int i=0; i< nums.length-1; i++) {
			int j= i+1;
			int k= nums.length-1;
			while (j<k) {
				int sum = nums[i]+nums[j]+nums[k];
				if (target == sum) {
					set.add(Arrays.asList(nums[i],nums[j++],nums[k--]));
					}
				else if (sum > 0 ) {
					k--;
				}
				else {
					j++;
				}
			}
					}
		return new ArrayList<>(set);
				}
		
		
}
