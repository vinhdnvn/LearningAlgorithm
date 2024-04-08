
class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n + 1];
        helper(n, ans, 1, 1);
        return ans;
    }

    private void helper(int n, int[] ans, int bits, int i) {
        if (i > n) {
            return;
        }
        ans[i] = bits;
        i <<= 1;
        helper(n, ans, bits, i);
        helper(n, ans, bits + 1, i + 1);
    }
}