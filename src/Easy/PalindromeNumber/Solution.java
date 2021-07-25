package Easy.PalindromeNumber;

class Solution {
    public boolean isPalindrome(int x) {

        if(x<0) return false;
        String strX = String.valueOf(x);
        int idx = 0;
        int reverseIdx = strX.length()-1;

        while(idx < reverseIdx){
            if(strX.charAt(idx++) != strX.charAt(reverseIdx--)) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
    }
}