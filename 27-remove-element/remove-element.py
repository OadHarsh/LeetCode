class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        n = len(nums)
        i = 0
        while i <n:
            if nums[i] == val:
                nums.pop(i)
                i -= 1
                n -= 1
                # count += 1
            i += 1    
        return nums.sort()      
        