import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if (digits == null || digits.length() == 0) return result;

        String[] phoneMap = {
            "",    // 0
            "",    // 1
            "abc", // 2
            "def", // 3
            "ghi", // 4
            "jkl", // 5
            "mno", // 6
            "pqrs",// 7
            "tuv", // 8
            "wxyz" // 9
        };

        Queue<String> queue = new LinkedList<>();
        queue.offer("");

        for (char digit : digits.toCharArray()) {
            String letters = phoneMap[digit - '0'];
            int size = queue.size();

            for (int i = 0; i < size; i++) {
                String combination = queue.poll();
                for (char c : letters.toCharArray()) {
                    queue.offer(combination + c);
                }
            }
        }

        result.addAll(queue);
        return result;
    }
}
