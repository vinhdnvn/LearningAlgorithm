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

function maxProduct(nums: number[]): any {
  let max = nums[0];
  let min = nums[0];
  let globalMax = nums[0];

  for (let i = 1; i < nums.length; i++) {
    let temp = max;
    max = Math.max(nums[i], Math.max(max * nums[i], min * nums[i]));
    min = Math.min(nums[i], Math.min(temp * nums[i], min * nums[i]));

    if (max > globalMax) {
      globalMax = max;
    }
  }
  return globalMax;
}

maxProduct([2, 3, -2, 4]);
