import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> newset = new HashSet<>();
        for (int num : nums) {
            newset.add(num);
        }

        int count = nums.length;  

        for (int i = 0; i <= count; i++) {
            if (!newset.contains(i)) {
                return i;
            }
        }
        return -1; 
    }
}
