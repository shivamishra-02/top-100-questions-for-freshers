import java.util.Stack;

public class validate_balanced_parentheses {
    public static void main(String[] args) {

        String str = "{[()]}";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // opening brackets push into stack
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }

            // closing brackets check
            else if (ch == ')' || ch == '}' || ch == ']') {

                if (stack.isEmpty()) {
                    System.out.println("Not Balanced");
                    return;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                    (ch == '}' && top != '{') ||
                    (ch == ']' && top != '[')) {

                    System.out.println("Not Balanced");
                    return;
                }
            }
        }

        // if stack empty -> all brackets matched
        if (stack.isEmpty()) {
            System.out.println("Balanced");
        } else {
            System.out.println("Not Balanced");
        }
    }
}