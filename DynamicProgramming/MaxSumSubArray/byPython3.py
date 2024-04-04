class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        n = len(nums)
        dp = nums.copy()
        max_sum = dp[0]
        for i in range (1,n):
            #take current item and previous item
            dp[i] = max(dp[i], dp[i-1]+nums[i])
            max_sum = max(max_sum, dp[i])
        return max_sum