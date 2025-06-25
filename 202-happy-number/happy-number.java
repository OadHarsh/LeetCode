class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();

        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = square_sum(n);
        }

        return n == 1;
    }

    public int square_sum(int n){
        int sum = 0;

        while(n>0){
            int rem = n % 10;
            sum += (rem*rem);
            n /= 10;
        }

        return sum;
    }
}