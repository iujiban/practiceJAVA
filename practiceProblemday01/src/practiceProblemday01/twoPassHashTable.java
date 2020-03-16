package practiceProblemday01;

import java.util.HashMap;

public class twoPassHashTable {
	public static int[] twoSum(int[] nums, int target) {
		//Time Complexity O(n) We traverse the list containing n elements exactly twice.
		// Since the hash table reduces the look up time to O(1), the time complexity is O(n)
		// Space Complexity O(n)
		HashMap<Integer, Integer> map = new HashMap<>();
		//Store the data inside of the HashMap
		for (int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
		}
		for (int i=0; i<nums.length; i++) {
			int complement = target - nums[i];
			//checking the complement number inside of the map which I stored
			//then not having the number of the duplication: map.get(complement) != i
			// if satisfied all the conditions, return the position of i and complement(map.get(complement))
			if (map.containsKey(complement) && map.get(complement) != i) {
				return new int[] {i, map.get(complement)};
			}
		}
		
		return null;
	}
	public static void main(String[] args) {
		//testing the result
				int[] nums = new int[] {2,7,11,15};
				int target = 9;
				int[] twoSum = twoSum(nums,target);
				for (int i=0; i< twoSum.length; i++) {
					System.out.println(twoSum[i]);
				}
		}

}
