package com.test;

import java.util.ArrayList;
import java.util.List;

public class MyString {
    private static char[] chars;

    public MyString(String str) {
        this.chars = str.toCharArray();
    }

    public static int length() {
        return chars.length;
    }

    @Override
    public String toString() {
        return new String(chars);
    }

    public static MyString toUpperCase(String s) {
        char[] upperChars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                upperChars[i] = (char)(c - 32);
            } else {
                upperChars[i] = c;
            }
        }
        return new MyString(new String(upperChars));
    }

    public static MyString toLowerCase(String s) {
        char[] lowerChars = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                lowerChars[i] = (char) (c + 32);
            } else {
                lowerChars[i] = c;
            }
        }
        return new MyString(new String(lowerChars));
    }

    public char charAt(int index) {
        if (index < 0 || index >= chars.length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return chars[index];
    }

    public boolean equals(MyString str) {
        if (str == null || this.chars.length != str.chars.length) {
            return false;
        }
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != str.chars[i]) {
                return false;
            }
        }
        return true;
    }

    public static List<Integer> searchPattern(MyString text, MyString pattern) {
        List<Integer> indices = new ArrayList<>();
        int n = text.length();
        int m = pattern.length();
        int d = 256;
        int q = 101;
        int h = 1;

        for (int i = 0; i < m - 1; i++) {
            h = (h * d) % q;
        }

        int p = 0;
        int t = 0;
        for (int i = 0; i < m; i++) {
            p = (d * p + pattern.charAt(i)) % q;
            t = (d * t + chars[i]) % q;
        }

        for (int i = 0; i <= n - m; i++) {
            if (p == t) {
                boolean match = true;
                for (int j = 0; j < m; j++) {
                    if (chars[i + j] != pattern.charAt(j)) {
                        match = false;
                        break;
                    }
                }
                if (match) {
                    indices.add(i);
                }
            }
            if (i < n - m) {
                t = (d * (t - chars[i] * h) + chars[i + m]) % q;
                if (t < 0) {
                    t = (t + q);
                }
            }
        }
        return indices;
    }

    public static void main(String[] args) {
        MyString str = new MyString("Test");
        System.out.println(str);

        System.out.println(str.length());

        MyString upperString = str.toUpperCase("trt");
        System.out.println(upperString);

        MyString lowerString = str.toLowerCase("RTe");
        System.out.println(lowerString);

        char charAt = str.charAt(0);
        System.out.println(charAt);

        MyString text = new MyString("What is your name");
        MyString pattern = new MyString("name");


        List<Integer> index = searchPattern(text, pattern);
        System.out.println(index);

    }
}
