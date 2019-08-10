package com.CK;

public class Main {

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        Solution solution = new Solution();
        System.out.println(solution.removeDuplicates(nums));
    }
}

class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int left = -1, right = 0, prev = nums[0], cnt = 0;
        for (right = 0; right < nums.length; right++) {
            if (right == 0 || nums[right] == prev) {
                cnt++;
            } else {
                cnt = 1;
                prev = nums[right];
            }

            if (cnt <= 2) {
                left++;
            }

            nums[left] = nums[right];
        }

        return left + 1;
    }
}


class Solution2 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i < 2 || n > nums[i - 2])
                nums[i++] = n;
        return i;
    }
}