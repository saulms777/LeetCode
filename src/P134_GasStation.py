class Solution:
    def canCompleteCircuit(self, gas: list[int], cost: list[int]) -> int:
        fuel = low = loc = 0
        for i, (g, c) in enumerate(zip(gas, cost)):
            if fuel < low:
                low = fuel
                loc = i
            fuel += g
            fuel -= c
        
        if fuel < 0:
            return -1
        else:
            return loc