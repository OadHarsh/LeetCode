class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: bool
        """

        if target not in nums:
            return False ;
        else:
            return True ;    
        # for i in nums:
        #     if target == i:
        #         return True ;
        #         break ;
        #     if target
        