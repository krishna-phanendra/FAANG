package com.nk.puzzles.strings;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class ReverseString {

    public static void main(String[] args) {

       /* String str = "hello";
        String str1 = "  hello  ";
        reverse_1(str);
        reverse_1(str1);

        reverse_2(str);
        reverse_2(str1);*/
        reverse_3();
    }

    // using stack -> push & pop
    private static void reverse_1(String str) {
        Stack<Character> stk = new Stack<>();
        char[] chars = str.toCharArray();
        for (char c : chars) {
            stk.push(c);
        }

        char[] opChars = new char[str.length()];
        int size = stk.size();
        for (int i = 0; i < size; i++) {
            opChars[i] = stk.pop();
        }

        System.out.println("reverse : " + Arrays.toString(opChars));
    }

    // reading characters from the end
    private static void reverse_2(String str) {

        if (str != null && str.length() > 0) {
            int size = str.length();
            char[] opChars = new char[size];
            for (int i = size - 1, j = 0; i >= 0; i--, j++) {
                opChars[j] = str.charAt(i);
            }
            System.out.println("reverse : " + Arrays.toString(opChars));
        }
    }

    //taking input from scanner
    private static void reverse_3(){
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter String to reverse");
        String str = scr.nextLine();
        reverse_2(str);
    }

}
