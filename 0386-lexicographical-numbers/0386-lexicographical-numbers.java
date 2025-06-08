class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<Integer> ans = new ArrayList<>();
        int current = 1;
        for (int i = 1; i <= n; i++) {
            ans.add(current);
            if (current * 10 <= n) {
                current *= 10;
            } else {
                if (current >= n) current /= 10;
                current += 1;
                while (current % 10 == 0) {
                    current /= 10;
                }
            }
        }
        return ans;
    }
}