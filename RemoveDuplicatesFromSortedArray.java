## Approach 1
- Uses extra array
- Time: O(n), Space: O(n)

class Solution {
    public int removeDuplicates(int[] nums) {
        int [] arr =new int[nums.length];
         arr[0]=nums[0];
        int indx=1;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[i-1]){
                arr[indx]=nums[i];
                indx++;
            }
            
        }
        for(int i=0;i<indx;i++){
            nums[i] = arr[i];
        }
        return indx;
    }
}

