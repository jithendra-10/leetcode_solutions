class Solution {
    public String multiply(String num1, String num2) {
        int m=num1.length();
        int n=num2.length();
        int res []=new int[m+n];
        if(num1.equals("0") || num2.equals("0")) return "0";
        for (int i = m - 1; i >= 0; i--) {
        int digit1 = num1.charAt(i) - '0';
        for (int j = n - 1; j >= 0; j--) {
            int digit2 = num2.charAt(j) - '0';
            int product = digit1 * digit2;
            int sum = product + res[i + j + 1]; 
            res[i + j + 1] = sum % 10;          
            res[i + j] += sum / 10; 
        }
    }
    StringBuilder sb = new StringBuilder();
    for (int num : res) {
        if (!(sb.length() == 0 && num == 0)) {
            sb.append(num);
        }
    }
    return sb.length() == 0 ? "0" : sb.toString();
    }
}