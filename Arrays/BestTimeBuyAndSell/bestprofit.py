class Solution:
    def maxProfit(self, prices: List[int]) -> int:

                 from sys import maxsize
                 lst = maxsize
                 op = 0
                 pist = 0
                 for i in range(len(prices)):
                     if prices[i] < lst :
                         lst = prices[i]
                         pist = prices[i] - lst 
                         if pist > op:
                             op = pist
                 return op
