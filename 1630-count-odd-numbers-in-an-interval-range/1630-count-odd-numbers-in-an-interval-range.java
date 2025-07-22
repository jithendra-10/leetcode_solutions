class Solution {
    public int countOdds(int low, int high) {
        int odd_h=(high+1)/2;
        int odd_lo=low/2;
        int count=odd_h-odd_lo;
        return count;
    }
}