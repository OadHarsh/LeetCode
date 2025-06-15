class Solution {
    public int maxDiff(int num) {
        String str = Integer.toString(num);

        // ---------- MAX ----------
        // Replace the first digit that is not 9 with 9
        char maxDigitToReplace = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != '9') {
                maxDigitToReplace = str.charAt(i);
                break;
            }
        }

        String maxStr = (maxDigitToReplace != 0) ? str.replace(maxDigitToReplace, '9') : str;

        // ---------- MIN ----------
        char minDigitToReplace = 0;
        if (str.charAt(0) != '1') {
            minDigitToReplace = str.charAt(0);
        } else {
            for (int i = 1; i < str.length(); i++) {
                if (str.charAt(i) != '0' && str.charAt(i) != '1') {
                    minDigitToReplace = str.charAt(i);
                    break;
                }
            }
        }

        String minStr = (minDigitToReplace != 0) ? str.replace(minDigitToReplace, (str.charAt(0) != '1') ? '1' : '0') : str;

        int maxVal = Integer.parseInt(maxStr);
        int minVal = Integer.parseInt(minStr);

        return maxVal - minVal;
    }
}
