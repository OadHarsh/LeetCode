class Solution(object):
    def search(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        
        left , right = 0 ,len(nums)
        mid = (left+right)//2

        if (len(nums) == 1):
            if (target == nums[len(nums)-1]):
                return 0 ;

        if (len(nums) == 2):
            for i in range(0,len(nums)):
                if nums[i] == target:
                    return i      

        if(target <= nums[mid] ):            
            for i in range(left,mid+1):           
                if nums[i] == target :
                    return i

        if(target > nums[mid]):
            for i in range(mid,right):
                if nums[i] == target :
                    return i

        if( target not in nums):
            return -1

           
            
        