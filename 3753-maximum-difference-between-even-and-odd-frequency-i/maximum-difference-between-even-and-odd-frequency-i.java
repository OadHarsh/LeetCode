class Solution {
    public int maxDifference(String s) {
        int[] count = new int[26];
        for (char c : s.toCharArray())
            count[c - 'a']++;

        int maxOdd = 0;
        int minEven = s.length();  

        for (int freq : count) {
            if (freq == 0) continue;
            if (freq % 2 == 0) {
                minEven = Math.min(minEven, freq);
            } else {
                maxOdd = Math.max(maxOdd, freq);
            }
        }
        return maxOdd - minEven;
    }
}
