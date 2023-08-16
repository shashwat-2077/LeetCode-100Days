class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int ans = 0;
        
        for(int left=0, right=0; right<nums.length; ++right){
            if(right > 0 && nums[right] <= nums[right-1])
                left = right;
            ans = Math.max(ans, right-left+1);
        }
        return ans;
    }
}