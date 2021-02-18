class Solution {
    public int findNumbers(int[] nums) {
        int count=0, digits =0;
        for(int i=0; i<nums.length;i++) {
            int a = nums[i];
            while(a>0) {
                digits ++;
                a = a/10;

            }
            if(digits%2==0) {
                count++;
            }
            digits=0;
        }
        return count;
    }
}
