class Solution {
    public void reverseString(char[] s) {
        int n = s.length ;
        char temp ;
        for(int i = 0; i< n/2;i++){
            if(i != n-i-1){
                temp = s[i];
                s[i] = s[n-i-1];
                s[n-i-1] = temp; 
            }   
        }
    }
}