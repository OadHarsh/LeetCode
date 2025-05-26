class Solution {
    public String reverseWords(String s) {
        String s1 = s.trim().replaceAll("\\s+"," ");
        String reverse[] = s1.split(" ");
        String answer ="" ; 
        for(int i= reverse.length - 1 ; i>=0 ; i--){
            answer += reverse[i] ;
            if (i != 0){
                answer += " " ;
            }

        } 

        return answer;
    }
}