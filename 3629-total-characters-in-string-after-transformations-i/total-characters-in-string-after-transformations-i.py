
class Solution(object):
    def lengthAfterTransformations(self, s, t):
        """
        :type s: str
        :type t: int
        :rtype: int
        """

        MOD = 10**9 + 7
        dp = [[0] * (t + 1) for _ in range(26)]

        # Base case: 0 transformations → length is 1
        for c in range(26):
            dp[c][0] = 1

        # Fill DP table
        for i in range(1, t + 1):
            for c in range(26):
                if c == 25:  # 'z'
                    dp[c][i] = (dp[0][i - 1] + dp[1][i - 1]) % MOD
                else:
                    dp[c][i] = dp[c + 1][i - 1] % MOD

        # Calculate total length after t transformations
        total = 0
        for ch in s:
            total = (total + dp[ord(ch) - ord('a')][t]) % MOD

        return total