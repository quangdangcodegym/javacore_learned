package com.codegym.buffer;

import java.util.Stack;

public class Ram {
    public static void main(String[] args) throws InterruptedException {

    }
    public static String convertBinaryToString(int num){
        Stack<Integer> stack = new Stack<>();
        while (num!=0){
            stack.add(num%2);
            num = num/2;
        }
        String str = "";
        while (stack.size()!=0){
            str+= stack.pop();
        }
        return str;
    }

    public static int convertStringtoInteger(String str){
        double a = Math.pow(2,4);
        int total = 0;
        for(int i= 0 ;i <= str.length()-1;i++){
            char cItem = str.charAt(i);
            String strItem =String.valueOf(cItem);
            int item = Integer.parseInt(strItem);
            total += item * Math.pow(2,str.length()-1-i);
        }
        return total;
    }
}
