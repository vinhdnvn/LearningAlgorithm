// dynamic programming: memoization
class Solution {
    public int uniquePaths(int m, int n) {
         Integer[][] memo = new Integer[m][n];
         return findPath(m-1, n-1, memo);

         }
    public int findPath(int row, int col , Integer[][] memo){
        if(row ==0 && col ==0) {return 1;}
        if(row <0 || col <0) {return 0;}
        if(memo[row][col] != null) {
            return memo[row][col];
        }

        int up = findPath(row-1, col, memo);
        int left = findPath(row,col-1,memo);

        memo[row][col]= up + left;

        return memo[row][col];
    }

         

        
    
}

// backtracking : i think backtracking is easy to understand
class Solution {
    public int uniquePaths(int m, int n) {
        return findPath(0, 0, m, n);
    }
    public int findPath(int row, int col, int m, int n){
        if(row == m-1 && col == n-1) {return 1;}
        if(row >= m || col >= n) {return 0;}
        int right = findPath(row, col+1, m, n);
        int down = findPath(row+1, col, m, n);
        return right + down;
    }
}