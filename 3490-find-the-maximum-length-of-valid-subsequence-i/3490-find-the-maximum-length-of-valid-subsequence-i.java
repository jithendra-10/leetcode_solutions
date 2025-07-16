class Solution {
    public int maximumLength(int[] nums) {
        int cnteven=0;
        int cntodd=0;
        for(int num:nums){
            if (num%2==0) cnteven++;
            else cntodd++;
        }
        int evendp=0;
        int odddp=0;
        for(int num:nums){
            if(num%2==0) evendp=Math.max(evendp,odddp+1);
            else odddp=Math.max(odddp,evendp+1);
        }
        return Math.max(Math.max(cnteven,cntodd),Math.max(evendp,odddp));
    }
}