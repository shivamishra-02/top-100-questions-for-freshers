public class count_words {
    public static void main(String[] args) {

        String str = "Java is easy to learn";

        int count = 0;
        boolean word = false;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            // when character is not space and new word starts
            if (ch != ' ' && !word) {
                count++;
                word = true;
            }

            // space means word ended
            else if (ch == ' ') {
                word = false;
            }
        }

        System.out.println("Number of words: " + count);
    }
}