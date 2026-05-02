Problem: Single Number (LeetCode 136)

Approach:

Use XOR operation to cancel out duplicate elements
Traverse the array and XOR all elements
Time: O(n), Space: O(1)

Key Idea:
XOR of a number with itself is 0, and XOR with 0 gives the number.
So all duplicate elements cancel out, leaving only the single element.

  

class Solution {
    public int singleNumber(int[] nums) {
      int result = 0;
      for(int i = 0;i<nums.length;i++){
        result=result^nums[i]; 
        }
      return result;
    }
}
