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

//Two pointer
//Keep moving the ith pointer, when n find something diff set it to the position

