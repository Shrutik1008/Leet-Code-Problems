class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int exsum = n*(n+1)/2;
        int sum=0;

        for(int num:nums){
            sum+=num;
        }

        int result = exsum-sum;
        return result;
    }
}