class Solution:
    def merge(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        for n in range(n):
            nums1[m+n] = nums2[n]
        nums1.sort()
