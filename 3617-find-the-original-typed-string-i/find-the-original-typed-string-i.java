class Solution {
    public int possibleStringCount(String word) {
        int n = word.length();
        int i = n - 1;
        int count = 1;
        
        while(i > 0){
            int j = i - 1;
            if(word.charAt(i)==word.charAt(j)){
                count++;
            }
            i--;
        }

        return count;
    }
}