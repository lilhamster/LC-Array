class Solution:
    def findMaxConsecutiveOnes(self, nums: List[int]) -> int:
        ma = 0
        count = 0
        for i in nums:
            if i == 1 :
                count+=1
                ma = max(count,ma)
            else:
                count = 0
        return ma
        
