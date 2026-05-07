class reverse_each_word_in_sentence{
    public static void main(String[] args) {
        // first we will make an array of string type which includes all the words of any sentence in it
        String sentence = "I am Shivam Mishra and I am Great";
        StringBuilder result = new StringBuilder();
        String words[] = sentence.split(" ");

        // now itterating the words array in order to go to every word
        for(int i=0;i<words.length;i++){
            String word = words[i];
            
            // reverse the word
            String rev = "";
            for(int j=word.length()-1;j>=0;j--){
                rev+=word.charAt(j);
            }

            // add the word to the result
            result.append(rev+" ");
        }
        System.out.println(result);
    }
}