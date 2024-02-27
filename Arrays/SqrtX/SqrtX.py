class Solution:
    def mySqrt(self, x: int) -> int:
        if ( x ==0 | x ==1 ): return x 
        start = 1
        end = x
        mid = -1
        # start binary search to find square root of x
        while (start <= end):
            mid = start + (end - start) // 2 
            if (mid *mid > x):
                end = end -1
            elif mid*mid == x:
                return mid
            else: 
                start = mid +1
        return round(end)
