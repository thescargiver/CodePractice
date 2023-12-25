class Solution {
    public int findDuplicate(int[] nums) {
        // [2,-2,2,2,2] => number => 2
        //  *   *.  *.   *. 
        // [-1, -3, -4, -2, 2] => returning 2

        for (int i = 0 ; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;

            if (nums[index] < 0) {
                // is marked already
                return Math.abs(nums[i]);
            }

            // mark the index
            nums[index] *= -1;
        }

        return nums.length;
    }
}
