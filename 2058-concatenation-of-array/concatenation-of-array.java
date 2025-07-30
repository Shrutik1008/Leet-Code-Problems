class Solution {
    public int[] getConcatenation(int[] nums) {
        int sizeOfnums = nums.length;
        int sizeOfans = sizeOfnums + sizeOfnums;
        int[] ans = new int[sizeOfans];

        for(int i=0;i<sizeOfans-1-i;i++){

                ans[i]+=nums[i];
                ans[i+sizeOfnums]+=nums[i];
            }
        
        return ans;
    }
}