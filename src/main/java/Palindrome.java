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

}
