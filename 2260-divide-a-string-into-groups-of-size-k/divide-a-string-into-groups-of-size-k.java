class Solution {
    public String[] divideString(String s, int k, char fill) {
        int n = 0;

        if(s.length() % k == 0){
            n = s.length() / k;
        }
        else{
            n = (s.length() / k) + 1;
        }
        
        String[] arr = new String[n];
        String part = "";
        char[] char_Arr = s.toCharArray();
        
        int j = 0;
        for(int i=0;i<arr.length;i++){
            for(int l=0; l<k;l++){
                if(j>char_Arr.length - 1){
                    part += String.valueOf(fill);
                }
                else{
                    part += String.valueOf(char_Arr[j]);
                    j++;
                }
            }
            arr[i] = part;
            part = "";   
        }

        return arr;
    }
}