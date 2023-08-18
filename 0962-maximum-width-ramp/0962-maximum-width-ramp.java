class Solution {
    public int maxWidthRamp(int[] nums) {
        int ans = 0;
        Deque<Integer> numStack = new ArrayDeque<>();
        
        for (int i = 0; i < nums.length; ++i)
            if(numStack.isEmpty() || nums[i] < nums[numStack.peek()])
                numStack.push(i);
        
        for (int i = nums.length - 1;i > ans; --i)
            while(!numStack.isEmpty() && nums[i] >= nums[numStack.peek()])
                ans = Math.max(ans, i - numStack.pop());
        
        return ans;
        
    }
}