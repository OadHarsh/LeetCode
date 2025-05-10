class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        left , right = 0 ,len(nums)


        if(len(nums) ==0):
            return 0;
        
        if (target > nums[right-1]):
            return right

        if(target <= nums[(left+right)//2]):
            for i in range(0,((left+right)//2)+1):
                if (nums[i]>target):
                    return i

                if (nums[i]==target):
                    return i 
        else:
        # if(target >= nums[(left+right)//2]):
            for i in range(((left+right)//2),right):
                if (nums[i]>target):
                    return i

                if (nums[i]==target):
                    return i 
