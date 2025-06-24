class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();

        for(int i:nums1){
            for(int j : nums2){
                if(i == j){
                    set.add(i);
                }
            }
        }
        int[] arr = new int[set.size()];
        int k = 0;
        for(int i : set){
            arr[k]=i;
            k++;
        }

        return arr;
    }
}