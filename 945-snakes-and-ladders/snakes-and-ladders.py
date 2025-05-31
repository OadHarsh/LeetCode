from collections import deque

class Solution(object):
    def snakesAndLadders(self, board):
        """
        :type board: List[List[int]]
        :rtype: int
        """
        n = len(board)

        # Converts a 1D square number into a (row, col) in the board
        def get_coordinates(square):
            quot, rem = divmod(square - 1, n)
            row = n - 1 - quot
            col = rem if row % 2 != n % 2 else n - 1 - rem
            return row, col

        visited = set()
        queue = deque([(1, 0)])  # (current_square, moves)

        while queue:
            square, moves = queue.popleft()

            for i in range(1, 7):  # simulate die roll from 1 to 6
                next_square = square + i
                if next_square > n * n:
                    continue

                row, col = get_coordinates(next_square)
                if board[row][col] != -1:
                    next_square = board[row][col]

                if next_square == n * n:
                    return moves + 1

                if next_square not in visited:
                    visited.add(next_square)
                    queue.append((next_square, moves + 1))

        return -1  # not reachable
