/*
LeetCode 704 - Binary Search

Approach 1: Linear Search
Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        for(int i = 0;i < n;i++){
            if(nums[i] == target)
            return i;
        }
        return -1;
    }
}


/*
Approach 2: Binary Search (Optimal)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int search(int[] nums, int target) {

        int left = 0;
        int right = nums.length - 1;

        while(left <= right) {

            int mid = left + (right - left) / 2;

            if(nums[mid] == target) {
                return mid;
            }

            if(nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
