// LeetCode 977 - Squares of a Sorted Array
// Approach 1: Brute Force
// Time Complexity: O(n log n)
// Space Complexity: O(1)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        for (int i = 0;i<n;i++){
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;   
    }
}
