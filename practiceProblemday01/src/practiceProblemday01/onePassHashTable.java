package practiceProblemday01;

import java.util.HashMap;

public class onePassHashTable {
	// Time Complexity O(n),
	// We traverse the list containing n elements only once.
	// Each look up in the table costs only O(1) time.
	// Space Complexity O(n)
	public static int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i=0; i<nums.length; i++) {
			map.put(nums[i], i);
			//Getting the value which we are looking for
			int complement = target- nums[i];
			//Finding the value which it stores inside of the hashmap
			if(map.containsKey(complement)) {
				return new int[] {map.get(complement), i};
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
