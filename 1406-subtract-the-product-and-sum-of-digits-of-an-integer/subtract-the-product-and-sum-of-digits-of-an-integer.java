class Solution {
    public int subtractProductAndSum(int n) {
       String s = Integer.toString(n);
        int sum = 0;
        int product = 1;

        for (int i = 0; i < s.length(); i++) {
            int digit = Integer.parseInt(String.valueOf(s.charAt(i)));
            sum += digit;
            product *= digit;
        }

        return product - sum;
    }
}
