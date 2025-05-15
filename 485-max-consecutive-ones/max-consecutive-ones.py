class Solution(object):
    def findMaxConsecutiveOnes(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count = 0
        maximum = 0

        for i in nums:
            if i % 2 != 0 :
                count +=1
                if count > maximum:
                    maximum = count;
            if i % 2 == 0:
                count = 0

        return maximum       
