class Solution {
    public int removeDuplicates(int[] nums) {
        int k=1;
        int x = 0;
        for(int i=1;i<nums.length;i++){
            if(nums[i] != nums[x]){
                nums[k] = nums[i];
                x = k;
                k ++;
            }
        }
        return k;
    }
}