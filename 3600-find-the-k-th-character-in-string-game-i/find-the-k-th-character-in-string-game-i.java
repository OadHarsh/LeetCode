class Solution {
    public char kthCharacter(int k) {
        StringBuilder str = new StringBuilder("");
        StringBuilder word = new StringBuilder("a");

        while(k>word.length()){

            for(int i=0;i<word.length();i++){
                int val = word.charAt(i) - '0';
                str.append((char)(val+1 + '0'));
            }
            word.append(str);
            str.setLength(0);
        }

        return word.charAt(k-1);
    }
}