class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0) return 0;

        int i = 0, sign = 1, result = 0;
        int n = str.length();

        while (i < n && str.charAt(i) == ' ') {
            i++;
        }

    
        if (i < n && (str.charAt(i) == '+' || str.charAt(i) == '-')) {
            sign = (str.charAt(i) == '-') ? -1 : 1;
            i++;
        }

        
        while (i < n) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') break; 

            int digit = ch - '0';

            
            if (result > (Integer.MAX_VALUE - digit) / 10) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }

            result = result * 10 + digit;
            i++;
        }

        return result * sign;
    }
}
