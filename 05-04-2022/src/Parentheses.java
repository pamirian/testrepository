/*
Given the String like “20*((876/8)+19)” , implements the method that check if the parentheses are correct.
Try to solve it yourself without help of Google
“9*(8+3)-( (9+1)5)” -> true
“9(8+3)- (9+1)5)” -> false
“98+3)-( (9+1)*5” -> false
 */
public class Parentheses {
    public static void main(String[] args) {
        System.out.println("\"9*(8+3)-( (9+1)5)\" -> " + parentheses("9*(8+3)-( (9+1)5)"));
        System.out.println("\"9(8+3)- (9+1)5)\" -> " + parentheses("9(8+3)- (9+1)5)"));
        System.out.println("\"98+3)-( (9+1)*5\" -> " + parentheses("98+3)-( (9+1)*5"));
    }

    public static Boolean parentheses(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                counter++;
                continue;
            }
            if (str.charAt(i) == ')') {
                if (counter==0) {
                    return false;
                }
                counter--;
            }
        }
        if (counter == 0) return true;
        return false;
    }
}


/*
old version
public class Parentheses {
    public static void main(String[] args) {
        System.out.println("\"9*(8+3)-( (9+1)5)\" -> " + Parentheses("9*(8+3)-( (9+1)5)"));
        System.out.println("\"9(8+3)- (9+1)5)\" -> " + Parentheses("9(8+3)- (9+1)5)"));
        System.out.println("\"98+3)-( (9+1)*5\" -> " + Parentheses("98+3)-( (9+1)*5"));
    }

    public static Boolean Parentheses(String str) {
        boolean result = false;
        int parenthesOpenCounter = 0, parenthesClosedCounter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ')') {
                parenthesClosedCounter++;
            }
            if (str.charAt(i) == '(') {
                parenthesOpenCounter++;
            }
        }
        if (parenthesOpenCounter == parenthesClosedCounter) {
            result = true;
        }
        return result;
    }
}
 */