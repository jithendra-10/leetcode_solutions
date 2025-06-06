class Solution {
    public String robotWithString(String s) {
        int n = s.length();
        int[] minRight = new int[n];
        minRight[n - 1] = s.charAt(n - 1) - 'a';
        for (int i = n - 2; i >= 0; i--) {
            minRight[i] = Math.min(s.charAt(i) - 'a', minRight[i + 1]);
        }
        Stack<Character> stack = new Stack<>();
        StringBuilder t = new StringBuilder();
        for (int i = 0; i < n; i++) {
            stack.push(s.charAt(i));
            while (!stack.isEmpty() && (i == n - 1 || stack.peek() - 'a' <= minRight[i + 1])) {
                t.append(stack.pop());
            }
        }
        return t.toString();
    }
}