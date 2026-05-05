Second Largest Element

Given an array of integers nums, return the second-largest element in the array. If the second-largest element does not exist, return -1.

Example 1
Input: nums = [8, 8, 7, 6, 5]
Output: 7
Explanation:
The largest value in nums is 8, the second largest is 7
Example 2
Input: nums = [10, 10, 10, 10, 10]
Output: -1
Explanation:
The only value in nums is 10, so there is no second largest value, thus -1 is returned

## Approach 1

  class Solution {
    public int secondLargestElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int largest = nums[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] != largest) {
        return nums[i];
        }
    }
    return -1;
    }
}
