class Solution {
    public int removeDuplicates(int[] nums) {
        int n = 0;
	    for (int i = 0; i < nums.length; i++) {
		    if (nums[n] != nums[i]) {
			    nums[++n] = nums[i];
		    }
	    }
	    return ++n;
        
    }
}
