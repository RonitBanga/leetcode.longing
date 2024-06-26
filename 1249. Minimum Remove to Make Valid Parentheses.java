// 1249. Minimum Remove to Make Valid Parentheses

class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder(s);
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) == '(') {
                stack.push(i);
            } else if (sb.charAt(i) == ')') {
                if (!stack.isEmpty()) {
                    stack.pop();
                } else {
                    sb.setCharAt(i, '*'); 
                }
            }
        }

        while (!stack.isEmpty()) {
            sb.setCharAt(stack.pop(), '*');
        }

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < sb.length(); ++i) {
            if (sb.charAt(i) != '*') {
                result.append(sb.charAt(i));
            }
        }

        return result.toString();
    }
}
