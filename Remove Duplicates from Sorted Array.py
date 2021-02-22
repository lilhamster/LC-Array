class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        nums[:] = sorted(set(nums))
        return len(nums)
        
        '''
        brilliant answer 
        set does not contain duplicate items!
        nums[:] is used because it does not create a new list
        '''
