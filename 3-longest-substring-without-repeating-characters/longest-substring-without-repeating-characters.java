class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;

        for(int left = 0; left<s.length(); left++){
            String substring = "";
            for(int right=left; right<s.length(); right++){
                char ch = s.charAt(right);
                if(!substring.contains(String.valueOf(ch))){
                    substring += String.valueOf(ch);
                }
                else{
                    break;
                }

                if(substring.length()>max){
                    max = substring.length();
                }
            }
        }

        return max;
    }
}