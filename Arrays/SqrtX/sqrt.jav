 class Solution {
     public int mySqrt(int x) {
         if (x == 0 || x== 1 ){
             return x;
         };
         int start = 1;
         int end =x ;
         int mid = -1;
         // binary search to find square root of x
         while (start <= end) {
              mid = start + (end -start ) /2 ;
              if ((long) mid * mid > (long) x)
                   end = mid -1 ;
                 //   if mid pow 2 = x then return mid now 
             else if (mid *mid ==x)
                   return mid;
             else 
                 start = mid +1;
         }

         return Math.round(end);
     }
    }
    
