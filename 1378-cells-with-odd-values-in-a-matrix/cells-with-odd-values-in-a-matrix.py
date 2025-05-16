class Solution(object):
    def oddCells(self, m, n, indices):
        """
        :type m: int
        :type n: int
        :type indices: List[List[int]]
        :rtype: int
        """
        row = [0] * m
        col = [0] * n

    # Count row and column increments
        for r, c in indices:
            row[r] += 1
            col[c] += 1

    # Count cells with odd values
        count = 0
        for i in range(m):
            for j in range(n):
                if (row[i] + col[j]) % 2 == 1:
                    count += 1

        return count
        