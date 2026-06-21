class Solution {
    public boolean isValid(String s) {
        Stack<Character> x = new Stack<>();
        char[] c = s.toCharArray();
        for (char ch : c) {
            if (ch == '(' || ch == '[' || ch == '{') {
                x.push(ch);
            } else {
                if (x.isEmpty()) return false;
                char open = x.pop();
                if (ch == ')' && open != '(' || ch == '}' && open != '{' || ch == ']' && open != '[') {
                    return false;
                }
            }
        }
        return x.isEmpty();
    }
}