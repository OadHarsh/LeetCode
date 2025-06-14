class Solution {
    public int minMaxDifference(int num) {
        String s = String.valueOf(num);

        int mini = Integer.parseInt(s.replace(s.charAt(0), '0'));

        for (char c : s.toCharArray()) {
            if (c != '9') {
                int maxi = Integer.parseInt(s.replace(c, '9'));
                return maxi - mini;
            }
        }

        return num - mini;
    }
}
