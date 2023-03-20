class Solution {
    public boolean isPalindrome(int x) {
        String number = x + "";
        return  number.equals(new StringBuilder(number).reverse().toString());
    }
}