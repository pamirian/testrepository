/*
Implement the method that takes a strings and returns the new string that contains
every second character of the original string
“abcde” -> “bd”
“Hello Java” -> “el aa”
 */
public class EverySecondCharacter {
    public static void main(String[] args) {
        System.out.println("\"abcde\" -> "+everySecondCharacter("abcde"));
        System.out.println("\"Hello Java\" -> "+everySecondCharacter("Hello Java"));
    }

    public static String everySecondCharacter(String str) {
        String result = "";
        for (int i = 1; i < str.length(); ) {
            result = result + str.charAt(i);
            i = i + 2;
        }
        return result;
    }
}
