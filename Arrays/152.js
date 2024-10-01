// Maximum Product Subarray
// Given an integer array nums, find the contiguous subarray within an array (containing at least one number) which has the largest product.
// Example 1:
// Input: [2,3,-2,4]
// Output: 6
// Explanation: [2,3] has the largest product 6.
// Example 2:
// Input: [-2,0,-1]
// Output: 0
// Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
function maxProduct(nums) {
    var globalMax = nums[0];
    for (var i = 0; i < nums.length; i++) {
        if (nums[i] === 0) {
            globalMax = Math.max(globalMax, 0);
            continue;
        }
        var localMax = nums[i];
        if (nums[i] + 1 == nums[i + 1]) {
            localMax = Math.max(localMax, nums[i] * nums[i + 1]);
        }
    }
    return globalMax;
}
maxProduct([2, 3, -2, 4]);
