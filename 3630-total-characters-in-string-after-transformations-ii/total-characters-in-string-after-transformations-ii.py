class Solution(object):
    def lengthAfterTransformations(self, s, t, nums):
        """
        :type s: str
        :type t: int
        :type nums: List[int]
        :rtype: int
        """
        MOD = 10**9 + 7
        
        # Step 1: Create transformation matrix M (26x26)
        M = [[0] * 26 for _ in range(26)]
        for i in range(26):
            for j in range(nums[i]):
                M[i][(i + j + 1) % 26] += 1

        # Step 2: Matrix multiplication
        def mat_mult(A, B):
            res = [[0] * 26 for _ in range(26)]
            for i in range(26):
                for j in range(26):
                    for k in range(26):
                        res[i][j] = (res[i][j] + A[i][k] * B[k][j]) % MOD
            return res

        # Step 3: Matrix exponentiation
        def mat_pow(mat, power):
            res = [[int(i == j) for j in range(26)] for i in range(26)]  # identity matrix
            while power:
                if power % 2:
                    res = mat_mult(res, mat)
                mat = mat_mult(mat, mat)
                power //= 2
            return res

        # Step 4: Vector multiplication
        def vec_mult(vec, mat):
            res = [0] * 26
            for i in range(26):
                for j in range(26):
                    res[j] = (res[j] + vec[i] * mat[i][j]) % MOD
            return res

        # Step 5: Initialize frequency vector from the input string
        v = [0] * 26
        for ch in s:
            v[ord(ch) - ord('a')] += 1

        # Step 6: Exponentiate transformation matrix M^t
        M_t = mat_pow(M, t)

        # Step 7: Apply transformation vector * M^t
        final_vec = vec_mult(v, M_t)

        # Step 8: Return the sum of all character frequencies
        return sum(final_vec) % MOD
