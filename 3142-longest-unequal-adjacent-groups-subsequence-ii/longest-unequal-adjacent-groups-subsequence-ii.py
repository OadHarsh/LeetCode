class Solution(object):
    def getWordsInLongestSubsequence(self, words, groups):
        def hamming_distance(a, b):
            return sum(x != y for x, y in zip(a, b))

        n = len(words)
        dp = [[i] for i in range(n)]

        for i in range(n):
            for j in range(i + 1, n):
                if groups[i] != groups[j] and len(words[i]) == len(words[j]) and hamming_distance(words[i], words[j]) == 1:
                    if len(dp[i]) + 1 > len(dp[j]):
                        dp[j] = dp[i] + [j]

        longest_seq = max(dp, key=len)
        return [words[i] for i in longest_seq]
