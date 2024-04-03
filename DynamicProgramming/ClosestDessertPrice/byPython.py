# import List
from typing import List

class Solution:
    def closestCost(self, baseCosts: List[int], toppingCosts: List[int], target: int) -> int:
        
        self.bestTotalCost = float('inf')

        def TC(toppingIdx, cost) :
            if toppingIdx >= len(toppingCosts):
                 if abs(target -cost) == abs(target - self.bestTotalCost): 
                    self.bestTotalCost = min(self.bestTotalCost,cost)
                 else:
                    self.bestTotalCost = min([self.bestTotalCost, cost], key= lambda cost:abs(target-cost))
            else:
                TC(toppingIdx +1, cost + 0* toppingCosts[toppingIdx])
                TC(toppingIdx +1, cost + 1* toppingCosts[toppingIdx])
                TC(toppingIdx +1, cost + 2* toppingCosts[toppingIdx])
        for baseCost in baseCosts:
            TC(0,baseCost)
        return self.bestTotalCost
