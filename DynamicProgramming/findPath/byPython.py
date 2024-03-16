# // backtracking : i think backtracking is easy to understand
# class Solution {
#     public int uniquePaths(int m, int n) {
#         return findPath(0, 0, m, n);
#     }
#     public int findPath(int row, int col, int m, int n){
#         if(row == m-1 && col == n-1) {return 1;}
#         if(row >= m || col >= n) {return 0;}
#         int right = findPath(row, col+1, m, n);
#         int down = findPath(row+1, col, m, n);
#         return right + down;
#     }
# }


class Solution:
    def uniquePaths(self, m: int, n: int) -> int:
        return self.findPath(0, 0, m, n)
    def findPath(self, row,col,m,n) -> int:
        if row == m-1 and col == n-1:
            return 1
        if row >= m or col >=n:
            return 0
        right = self.findPath(row, col+1, m, n)
        down = self.findPath(row+1, col, m, n)
        return right+down
        