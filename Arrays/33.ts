function search(nums: number[], target: number): number {
  let right = nums.length - 1;
  let left = 0;
  while (left <= right) {
    let mid = Math.floor((left + right) / 2);
    if (target == nums[mid]) return mid;
    if (nums[left] <= nums[mid]) {
      if (nums[left] <= target && target < nums[mid]) {
        right = mid - 1;
      } else {
        left = mid + 1;
      }
    } else {
      if (nums[right] >= target && target > nums[mid]) {
        left = mid + 1;
      } else {
        right = mid - 1;
      }
    }
  }
  return -1;
}
