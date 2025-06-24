class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int count = 0;

        for(char ch : jewels.toCharArray()){
            for(char ch1 : stones.toCharArray()){
                if(ch == ch1){
                    count++;
                }
            }
        }

        return count;
    }
}