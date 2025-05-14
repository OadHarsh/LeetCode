class Solution(object):
    def strStr(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        n = len(haystack)
        answer = -1
        j = len(needle)
        for i in range(0,n):
            if needle == haystack[i:i+j]:
                answer = i
                break;

        return answer        