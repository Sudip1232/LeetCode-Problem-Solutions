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

## Approach 2 (Optimal)
- Two pointer technique
- Time: O(n), Space: O(1)

    
class Solution {
    public int removeDuplicates(int[] nums) {
        int i=0;
        int j=0;
        for(i=1; j<nums.length;j++){
            if(nums[j] != nums[i-1]){   
            nums[i]=nums[j];
            i++;
                
            }
    }
    return i;
}
}
