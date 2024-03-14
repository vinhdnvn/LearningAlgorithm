class Solution {
    public int titleToNumber(String columnTitle) {
        int sum =0;
        int power = 0;
        int n = columnTitle.length();
        for ( int i =n-1; i>=0;i--){
            int temp = columnTitle.charAt(i)-64;
            sum = sum+(int)Math.pow(26,power++)*temp;
        }
        return sum;
    }
}



//example
// 1. A = 1
// 2. AA = 27
// 3. AAA = 703
//explain the code 
// 1. we are using the power of 26 to calculate the value of the column
// 2. we are using the ASCII value of the character to calculate the value of the column
// 3. we are using the power of 26 to calculate the value of the column

//calculate the value of the column
// 1. 26^0 * 1 = 1
// 2. 26^1 * 1 = 26
// 3. 26^2 * 1 = 676
// 4. 26^3 * 1 = 17576