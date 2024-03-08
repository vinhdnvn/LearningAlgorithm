func containsDuplicate(nums []int) bool {
    sort.Ints(nums)
    n := len(nums)
    for i := 1; i < n; i++ {
        if nums[i] == nums[i-1] {
            return true
        }
    }
    return false
}