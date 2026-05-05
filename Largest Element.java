 Question :- Largest Element
  
Input: nums = [3, 3, 6, 1]
Output: 6
Explanation: The largest element in array is 6
Example 2
Input: nums = [3, 3, 0, 99, -40]
Output: 99
Explanation: The largest element in array is 99
  
  
  
## Approach 1

  class Solution {
    public int largestElement(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int last = nums[n - 1];
        return last;
    
    }
}
