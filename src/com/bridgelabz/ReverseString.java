package com.bridgelabz;

public class ReverseString {
    public static void main(String[] args) {
    String originalstr = "hello";
    String reversedstr = "";
    for (int i = 0; i< originalstr.length(); i++){
        reversedstr = originalstr.charAt(i) + reversedstr;
    }
        System.out.println("reversed str" + reversedstr);
    }
}
