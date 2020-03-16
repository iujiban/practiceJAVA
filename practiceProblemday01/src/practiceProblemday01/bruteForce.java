package practiceProblemday01;

public class bruteForce {
	public static int[] twoSum(int[] nums, int target) {
		//Time Complexity O(n^2), Space Complexity O(1)
		for (int i=0; i<nums.length; i++) {
			for (int j=i+1; j<nums.length; j++) {
				// Loop through each element x and find if there is another value that equals to target - x
				if (target == nums[i] + nums[j]) {
					int[] arr1= new int[] {i,j};
					return arr1;
				}
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
