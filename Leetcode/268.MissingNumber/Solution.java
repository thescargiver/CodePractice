class Solution {
    /**
        x ^ 0 => x
        x ^ x => 0
     */
    public int missingNumber(int[] nums) {
        final int n = nums.length;
        // sum of n elements - sum of nums
        return xorOverRange(n) 
            ^ xorOverArray(nums);
    }

    int xorOverArray(int[] nums) {
        int xor = 0;
        for (int i = 0 ; i < nums.length; i++) {
            xor ^= nums[i];
        }
        return xor;
    }

    int xorOverRange(int n) {
        int xor = 0;
        for (int i = 0 ; i <= n; i++) {
            xor ^= i;
        }
        return xor;
    }
}
