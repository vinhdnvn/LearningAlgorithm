func uniquePaths(m, n int) int {
    memo := make([][]int, m)
    for i := range memo {
        memo[i] = make([]int, n)
    }
    return findPath(m-1, n-1, memo)
}

func findPath(row, col int, memo [][]int) int {
    if row == 0 && col == 0 {
        return 1
    }
    if row < 0 || col < 0 {
        return 0
    }
    if memo[row][col] != 0 {
        return memo[row][col]
    }

    up := findPath(row-1, col, memo)
    left := findPath(row, col-1, memo)

    memo[row][col] = up + left

    return memo[row][col]
}