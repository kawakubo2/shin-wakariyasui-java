package chapter22;

public class StringSubstring {
    public static void main(String[] args) {
        String alphabet = "ABCDEFGHIJLKLMOPQRSTUVWXYZ";
        int start = 0, step = 5, end = start + step;
        for (; start < alphabet.length(); start += step) {
            end = (start + step >= alphabet.length()) ? alphabet.length(): start + step;
            System.out.println(alphabet.substring(start, end));
        }
    }
}
