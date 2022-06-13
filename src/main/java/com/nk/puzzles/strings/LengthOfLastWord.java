package com.nk.puzzles.strings;

import java.util.Arrays;
import java.util.function.DoubleToIntFunction;

public class LengthOfLastWord {

    public static void main(String[] args) {
        String str = "  ";
        String str1 = "Hello World";
        String str2 = " Hello World";
        String str3 = " Hello  World  ";

        System.out.println("str : " + Arrays.toString(str.split(" ")) + ", length : " + lengthOfLastWord_1(str));
        System.out.println("str1 : " + Arrays.toString(str1.split(" ")) + ", length : " + lengthOfLastWord_1(str1));
        System.out.println("str2 : " + Arrays.toString(str2.split(" ")) + ", length : " + lengthOfLastWord_1(str2));
        System.out.println("str3 : " + Arrays.toString(str3.split(" ")) + ", length : " + lengthOfLastWord_1(str3));

        System.out.println("str : '" + str + "', length : " + lengthOfLastWord_2(str));
        System.out.println("str1 : '" + str1 + "', length : " + lengthOfLastWord_2(str1));
        System.out.println("str2 : '" + str2 + "', length : " + lengthOfLastWord_2(str2));
        System.out.println("str3 : '" + str3 + "', length : " + lengthOfLastWord_2(str3));
    }

    // Using split method
    private static int lengthOfLastWord_1(String str) {
        String[] split = str.split(" ");
        return split.length > 0 ? split[split.length - 1].length() : 0;
    }


    private static int lengthOfLastWord_2(String str) {
        int count = 0;
        int size = str.length() - 1;
        for (int i = size; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                if (count != 0) break;
            } else count++;
        }

        return count;
    }


}
