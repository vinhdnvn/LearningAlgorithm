class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(result, tempList, nums, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, int start) {
        // Thêm bản sao của tập hợp con hiện tại vào kết quả
        result.add(new ArrayList<>(tempList));

        // Duyệt qua các phần tử còn lại của mảng
        for (int i = start; i < nums.length; i++) {
            // Thêm phần tử hiện tại vào tập hợp con tạm thời
            tempList.add(nums[i]);
            // Gọi đệ quy để tạo ra các tập hợp con khác
            backtrack(result, tempList, nums, i + 1);
            tempList.remove(tempList.size() - 1);
        }
    }
}