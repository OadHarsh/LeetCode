class Solution(object):
    def maximumValueSum(self, nums, k, edges):
        base = sum(nums)
        gains = [(num ^ k) - num for num in nums]

        total_gain = 0
        min_abs_gain = float('inf')
        flip_count = 0

        for g in gains:
            if g > 0:
                total_gain += g
                flip_count += 1
            min_abs_gain = min(min_abs_gain, abs(g))

        if flip_count % 2 == 0:
            return base + total_gain
        else:
            return base + total_gain - min_abs_gain
