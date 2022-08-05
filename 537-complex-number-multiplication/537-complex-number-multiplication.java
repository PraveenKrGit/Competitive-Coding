class Solution {
    public String complexNumberMultiply(String num1, String num2) {
        String x[] = num1.split("\\+|i");
        String y[] = num2.split("\\+|i");
        
        int num1_real = Integer.parseInt(x[0]);
        int num1_img = Integer.parseInt(x[1]);
        
        int num2_real = Integer.parseInt(y[0]);
        int num2_img = Integer.parseInt(y[1]);
        
        return(num1_real * num2_real - num1_img*num2_img) + "+" +(num1_real*num2_img + num1_img*num2_real)+"i";
    }
}