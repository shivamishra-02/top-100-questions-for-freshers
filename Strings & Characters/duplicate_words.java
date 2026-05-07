
import java.util.HashMap;

class duplicate_words{
    public static void main(String[] args) {
        String sentence = "i am am a a good boy";
        String words[] = sentence.split(" ");

        //counting the frequency of the words in the sentence
        HashMap<String , Integer> map = new HashMap<>();
        for(int i=0;i<words.length;i++){
            if(map.containsKey(words[i])){
                map.put(words[i],map.get(words[i])+1);
            }else{
                map.put(words[i],1);
            }
        }

        //print the words appeared more than one times
        for(int i=0;i<words.length;i++){
            if(map.get(words[i])>1){
                System.out.println(words[i]+" ");

                //reseting the value to 0 to avoid multiple prints
                map.put(words[i],0);
            }
        }
    }
}