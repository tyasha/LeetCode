class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = 0; j < nums.length; j++) {
                if (j == i) continue;

                if (nums[i] + nums[j] == target) {
                    int[] numbers = {i , j};
                    return numbers;
                }
            }
        }
        throw new ArithmeticException();
    }
}