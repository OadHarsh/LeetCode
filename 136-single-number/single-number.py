class Solution(object):
    def singleNumber(self, arr):
        """
        :type nums: List[int]
        :rtype: int
        """
        freq = {}

        for num in arr:
            if num in freq:
                freq[num] += 1
            else:
                freq[num] = 1

        for key in freq:
            if freq[key] == 1:
                return key