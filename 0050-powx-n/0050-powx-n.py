class Solution:
    def myPow(self, x: float, n: int) -> float:
        pow=n
        if(pow<0):
            x=1/x
            pow=-pow
        res=1.0
        while(pow>0):
            if(pow%2==1):
                res*=x
            x*=x
            pow//=2
        return res
        