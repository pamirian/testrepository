/*
Implement the method that counts how many words in the given String.
The words are separate by space. You have to use only length() and charAt() methods of String class.
“It’s new task for me” -> 5;
 */
public class HowManyWords {
    public static void main(String[] args) {
        howManyWords("It’s new task for me");
        howManyWords("It’s new task for me ");
        howManyWords("It’s new     task for me");
        howManyWords(" It’s new task for me");
        howManyWords(" It’s   new task for me  ");
    }

    public static void howManyWords(String str) {
        int gaps = 0;
        for (int i = 1; i < str.length(); i++) {
            if ((str.charAt(i - 1) != ' ') && (str.charAt(i) == ' ')) {
                gaps++;
            }
        }
        if (str.charAt(str.length() - 1) == ' ') {
            gaps--;
        }
        System.out.println(str + " -> " + (gaps + 1));
    }
}
