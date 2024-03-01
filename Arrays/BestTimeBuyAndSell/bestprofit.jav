class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length; 
         int op = 0;
         int pist = 0;

         for ( int i =0; i< prices.length; i++){
             if (prices[i]< lsf){
                 lst = prices[i];
             }
             pist  = prices[i] - lsf ;
             if ( op < pist ){
                 op = pist ; 
             }
         }
        return op;
    }
}