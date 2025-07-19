class Solution {
    public String numberToWords(int num) {
        if(num==0) return "Zero";

        String[] lessThan20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten","Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
        String [] tens={"","Ten","Twenty","Thirty","Forty","Fifty","Sixty","Seventy","Eighty","Ninety"};
        String[] thousands={"","Thousand","Million","Billion"};
        StringBuilder result=new StringBuilder();
        int i=0;
        while(num>0){
            if(num%1000!=0){
                StringBuilder temp = new StringBuilder();
                helper(num % 1000, temp, lessThan20, tens);
                result.insert(0, temp.append(thousands[i]).append(" "));   
            }
            num/=1000;
            i++;
        }
        return result.toString().trim();
        }
        private void helper(int num, StringBuilder sb, String[] lessThan20, String[] tens) {
        if (num == 0) return;
        
        if (num < 20) {
            sb.append(lessThan20[num]).append(" ");
        } else if (num < 100) {
            sb.append(tens[num / 10]).append(" ");
            helper(num % 10, sb, lessThan20, tens);
        } else {
            sb.append(lessThan20[num / 100]).append(" Hundred ");
            helper(num % 100, sb, lessThan20, tens);
        }
    }
}