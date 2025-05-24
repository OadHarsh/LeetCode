class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        max_signed = 2**31 - 1
        min_signed = -2**31
        
        temp = x ;
        if (x < 0):
            x = x * -1 ;

        reverse = 0
        while (x >0):
            rem = x % 10;
            reverse = (reverse * 10) + rem
            x = x / 10;
        
        if (temp < 0):
            reverse = reverse * (-1)

        if reverse < min_signed or reverse > max_signed:
            return 0    
            
        return reverse;