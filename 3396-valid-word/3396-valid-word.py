class Solution:
    def isValid(self, word: str) -> bool:
        if(len(word)<3):
            return False
        vowels=0
        consonents=0
        v_set="aeiouAEIOU"
        for c in word:
            if c.isalpha():
                if c in v_set:
                    vowels+=1
                else:
                    consonents+=1
            elif not c.isdigit():
                return False
        return vowels>=1 and consonents>=1

