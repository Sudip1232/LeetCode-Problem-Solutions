Problem: Rotate Array (LeetCode 189)

Approach 1:
- Use an extra array to store rotated elements
- Place each element at index (i + k) % n
- Copy the result back to the original array

Time Complexity: O(n)
Space Complexity: O(n)

class Solution {
    public void rotate(int[] nums, int k) {
        int n =nums.length;
        int[] temp = new int[n];
        for (int i=0;i<n;i++){
            temp[ (i+ k) % n ] = nums[i];
        }
        for (int i=0;i<n;i++){
            nums[i] = temp [i];
        }
    }
}
