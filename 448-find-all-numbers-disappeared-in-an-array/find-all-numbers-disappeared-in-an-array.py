class Solution(object):
    def findDisappearedNumbers(self, nums):
        """
        :type nums: List[int]
        :rtype: List[int]
        """
        list = [] ;

        num_set = set(nums);
        for i in range(1,len(nums)+1):
            if i not in num_set: 
                list.append(i);

        
        return list;