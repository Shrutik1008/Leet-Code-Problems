class Solution {
    public int romanToInt(String s) {
        // Create a HashMap
        HashMap<Character, Integer> hashMap = new HashMap<>();
        
        // Add elements to the HashMap
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);

        int res = 0;

        for (int i = 0; i < s.length(); i++) {
            int curr = hashMap.get(s.charAt(i));
            if (i + 1 < s.length() && curr < hashMap.get(s.charAt(i + 1))) {
                res -= curr;
            } else {
                res += curr;
            }
        }
        
        return res;
    }
}
