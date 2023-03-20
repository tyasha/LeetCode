class Solution {
    public int search(int[] nums, int target) {
        int startIndex = 0;
        int endIndex = nums.length - 1;
        int middle;

        while (startIndex <= endIndex) {
            middle = startIndex + (endIndex - startIndex) / 2;

            if (nums[middle] == target) {
                return middle;
            }

            if(nums[middle] > target) {
                endIndex = middle - 1;
            } else {
                startIndex = middle + 1;
            }
        }
        return -1;
    }
}