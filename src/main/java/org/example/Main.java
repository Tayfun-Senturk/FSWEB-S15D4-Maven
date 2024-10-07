package org.example;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
    }

    public static boolean checkForPalindrome(String text){
        String[] chars=text.replaceAll("[^a-zA-Z0-9]","").toLowerCase(Locale.ROOT).split("");
        String[] reverseChars = new String[chars.length];
        for(int i=0;i<chars.length;i++){
            int x= chars.length-i-1;
            reverseChars[i]=chars[x];
        }
        System.out.println(Arrays.equals(reverseChars, chars));
        return Arrays.equals(reverseChars, chars);
    }

    public static String  convertDecimalToBinary(int x) {
        StringBuilder c = new StringBuilder();
        while (x>0){
            if(x%2==0){
                c.append(0);
                x=x/2;
            }else{
                c.append(1);
                x=x/2;
            }
        }
        System.out.println(c);
        return c.reverse().toString();
    }
}