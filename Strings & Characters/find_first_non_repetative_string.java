import java.util.HashMap;
class find_first_non_repetative_string{
    public static void main(String[] args) {
        String str = "aabbcddefggh";

        // first lets count the freqency of each charachter in tha whole sting
        HashMap<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }

        //now itetrate the hasmap and then find the first char having the value of 1
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(map.get(ch)==1){
                System.out.println(ch);
                break;
            }
        }
    }
}