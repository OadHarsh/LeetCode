class Solution {
    public String largestOddNumber(String num) {
        String answer = "";
        for(int i=num.length() - 1;i >= 0 ;i--){
            char ch = num.charAt(i);
            if(Integer.parseInt(num.valueOf(ch)) %2 != 0){
                answer = num.substring(0,i+1);
                break;
            }
        }


        return answer ;
    }
}