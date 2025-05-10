class Solution(object):
    def searchInsert(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        left , right = 0 ,len(nums)

        mid = (left+right)//2 ;

        if(len(nums) ==0):
            return 0;
        
        if (target > nums[right-1]):
            return right

        if(target <= nums[mid]):
            for i in range(0,mid+1):
                if (nums[i]>target):
                    return i

                if (nums[i]==target):
                    return i 

        if(target >= nums[mid]):
            for i in range(mid,right):
                if (nums[i]>target):
                    return i

                if (nums[i]==target):
                    return i 
