class Solution {
    public boolean isValid(String word) {
       if(word.length()<3){
        return false;
       } 
       int V=0;
       int C=0;
       for(char c: word.toCharArray()){
        if(Character.isLetter(c)){
            if("aeiouAEIOU".indexOf(c)!=-1) V+=1;
            else C+=1;
        }
        else if(!Character.isDigit(c)){
            return false;
        }
       }
       return V>=1 && C>=1;
    }
}