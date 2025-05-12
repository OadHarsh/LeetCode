class Solution(object):
    def findEvenNumbers(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        num = set()
        n = len(digits)

        for i in range(n):
            for j in range(n):
                for k in range(n):

                    if i!= j and j!=k and k!=i:

                        a,b,c = digits[i],digits[j],digits[k]

                        if a==0:
                            continue ;

                        digit = a*100 + b*10 + c 

                        if (digit % 2 != 0):
                            continue;
                        
                        num.add(digit)   

        return sorted(num)