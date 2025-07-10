class Solution {
    public int titleToNumber(String columnTitle) {
        int sum = 0;
        int j = 0;
        for(int i = columnTitle.length()-1; i>=0 ; i--){
            sum += (columnTitle.charAt(i) - 64) * (int)Math.pow(26,j++);
        }
        return sum;
    }
}