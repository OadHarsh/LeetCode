class Solution(object):
    def getLongestSubsequence(self, words, groups):
        """
        :type words: List[str]
        :type groups: List[int]
        :rtype: List[str]
        """
        n = len(words)
        result = [words[0]]          # Always include first word
        prev_group = groups[0]

        for i in range(1, n):
            if groups[i] != prev_group:
                result.append(words[i])
                prev_group = groups[i]

        return result
        