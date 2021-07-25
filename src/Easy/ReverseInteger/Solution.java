package Easy.ReverseInteger;

class Solution {

    boolean check(String x){
        String compare = String.valueOf(2147483646);
        if(compare.length() == x.length()){
            int idx = 0;
            while(idx < compare.length()){
                int comChar = compare.charAt(idx);
                int xChar = x.charAt(idx);
                if(comChar < xChar) return true;
                else if (comChar == xChar) idx++;
                else return false;
            }
        }
        return false;
    }

    public int reverse(int x) {
        boolean minus = false;
        if(x < 0 ) {
            minus = true;
            x *= -1;
        }
        if(x == Integer.MIN_VALUE) return 0;

        String strX = String.valueOf(x);
        StringBuilder sb = new StringBuilder(strX);
        String sbReverse = sb.reverse().toString();


        if(check(sbReverse)) return 0;

        int answer = minus ? -1 * Integer.parseInt(sbReverse) : Integer.parseInt(sbReverse);

        return answer;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println("s.reverse(-2147483648) = " + s.reverse(-2147483648));

    }
}
