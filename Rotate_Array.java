class Solution {
    public void rotate(int[] nums, int k) {
        k=k % nums.length;
        rotate(nums, 0, nums.length-1);
        rotate(nums, 0, k-1);
        rotate(nums,k, nums.length-1);
        

        
    }

    public void rotate(int[] nums, int start, int end) {
    while (end > start) {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
        start++;
        end--;
    }
}

    
}