class Solution {
    public char kthCharacter(int k) {
        int index = k - 1;
        int increment = 0;
        while (index > 0) {
            long p = 1;
            while (p * 2 <= index) {
                p *= 2;
            }
            increment++;
            index -= p;
        }
        return (char) ('a' + (increment % 26));
    }
}
