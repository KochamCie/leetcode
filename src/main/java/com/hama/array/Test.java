package com.hama.array;

/**
 * @Author: rns
 * @Date: 2019/1/17 下午4:22
 * @Description: Test
 *
 */
public class Test {

    public static int s(int num){
        int max = 1<<31-1;
        int min = -1<<31;
        if(num>max || num<min){
            return 0;
        }
        boolean negative = false;
        if(num<0){
            negative = true;
            num = Math.abs(num);
        }
        String temp = num+"";
        char[] chars = temp.toCharArray();
        char[] result = new char[chars.length];
        
        for (int i = chars.length-1,j=0; i >=0; i--,j++) {
            result[j] = chars[i];
        }
        String rev = String.valueOf(result);

        Integer integer = Integer.parseInt(rev);
        if(negative){
            integer = -integer;
        }
        return integer.intValue();
    }

    public static void main(String [] args){
        System.out.println(x(-2147483648));

    }

    public static int x(int x){
        int number = x;
        boolean isNegative = number < 0 ? true : false;

        if(isNegative){
            number = number * -1;
        }
        int reverse = 0;
        int lastDigit = 0;
        while (number >= 1) {
            lastDigit = number % 10; // gives you last digit
            if(reverse > Integer.MAX_VALUE/10){
                return 0;
            }
            reverse = reverse * 10 + lastDigit;
            number = number / 10; // get rid of last digit

        }
        return isNegative == true? reverse*-1 : reverse;
    }


}
