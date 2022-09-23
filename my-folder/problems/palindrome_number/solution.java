class Solution {
    public boolean isPalindrome(int x) {
        String num = x + "";
        char[] chars = num.toCharArray();
        int j = 0;
        for (int i = chars.length - 1; i >=0 ; i--) {
            if (chars[j++] != chars[i]){
                return false;
            }
        }
        return true;
    }
}