class Solution(object):
    def nextGreatestLetter(self, letters, target):
        """
        :type letters: List[str]
        :type target: str
        :rtype: str
        """
        n = len(letters)
        first = letters[0]

        for i in range(len(letters)):
            if letters[i] > target :
                min = letters[i]
                break
            if target != letters[i]:
                min = first       
        return min        