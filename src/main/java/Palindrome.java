package main.java;

public class Palindrome {

    public String isPalindrome(String text) {

        int len = text.length();
        for(int i = 0,  j = len-1; i < len/2; i++, j--) {
            if(text.charAt(i) != text.charAt(j)) {
                return "No";
            }
        }
        return "Yes";
    }

    public static void main(String... args) {
        String candidate = "anis";
        String name = String.format("hello %s", candidate);
        System.out.println(name);
    }
}
