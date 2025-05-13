class Solution(object):
    def searchRange(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        if target not in nums:
            return [-1,-1]

        count = 0   
        for i in range(len(nums)):
            if target == nums[i] and count == 0:
                first = i
                count += 1
            if target == nums[i]:
                second = i
        return [first,second]            