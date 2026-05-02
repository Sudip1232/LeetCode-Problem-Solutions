Problem: Move Zeroes (LeetCode 283)

Approach 1:

Use extra array to store non-zero elements
Time: O(n), Space: O(n)

class Solution {
    public void moveZeroes(int[] nums) {
        
        int n =nums.length;
        int[] temp = new int[n];
        
        int ptr = 0;
        for (int i=0;i<n;i++){
            if(nums[i] != 0 ){
                temp[ptr]=nums[i];          
                ptr++;
            }
        }

        for(int i = ptr; i < n ; i++){
            temp[i] = 0;
        }

        for(int i = 0; i < n; i ++){
            nums[i] = temp[i];
        }
    }
}

Approach 2 (Optimal):

Two-pointer technique
In-place swapping
Time: O(n), Space: O(1)




