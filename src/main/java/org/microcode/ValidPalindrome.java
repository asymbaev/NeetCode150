package org.microcode;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder newStr = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c))