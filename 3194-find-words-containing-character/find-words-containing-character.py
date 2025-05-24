class Solution(object):
    def findWordsContaining(self, words, x):
        """
        :type words: List[str]
        :type x: str
        :rtype: List[int]
        """
        indices  = [];
        for i in range(0,len(words)):
            for j in words[i]:
                if (x == j):
                    indices.append(i);
                    break;
        return indices;            