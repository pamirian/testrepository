/*
Write method boolean isPalindrome(String) that checks whether a given word is a palindrome.
A palindrome is a word that reads the same from the front and the back.
isPalindrome(“довод”) -> true
isPalindrome(“невод”) -> false
 */
public class Palindrome {
    public static void main(String[] args) {
        palindrome("довод");
        palindrome("невод");
    }

    public static void palindrome(String str) {
        boolean result = true;
        for (int i = 0; i < str.length(); i++) {
            if ((str.charAt(i)) != (str.charAt((str.length() - 1) - i))) {
                result = false;
            }
        }
        System.out.println(str + " -> " + result);
    }
}
