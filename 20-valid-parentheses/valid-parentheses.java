import java.util.Stack;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> mystack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                mystack.push(ch);
            } else if (ch == ')' || ch == '}' || ch == ']') {
                if (mystack.isEmpty()) return false;

                char top = mystack.pop();
                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return mystack.isEmpty();
    }
}
