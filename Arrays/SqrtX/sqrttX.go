func mySqrt(x int) int {
    if x == 0 || x == 1 {
        return x
    }
    
    start := 1
    end := x
    
    for start <= end {
        mid := start + (end-start)/2
        
        if mid*mid > x {
            end = mid - 1
        } else if mid*mid == x {
            return mid
        } else {
            start = mid + 1
        }
    }
    
    return end
}