import java.util.HashSet;

public class remove_duplicate {
    public static void main(String[] args) {
        String str = "aabbccdaa";
        StringBuilder result = new StringBuilder();

        HashSet<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (!set.contains(ch)) {
                set.add(ch);
                result.append(ch);
            }
        }

        System.out.println(result.toString());
    }
}