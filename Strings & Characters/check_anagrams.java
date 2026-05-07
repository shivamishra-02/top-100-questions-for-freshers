
import java.util.HashMap;

class check_anagrams{
    public static void main(String[] args) {
        String s1 = "shivam";
        String s2 = "mshiva";

        // creating hasmap to count the occurance of each number for string 1
        HashMap<Character,Integer> map1 = new HashMap<>();

        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);
            if(map1.containsKey(ch)){
                map1.put(ch,map1.get(ch)+1);
            }else{
                map1.put(ch,1);
            }
        }

        // Creating hasmap to count the occurance of each character in the second string
        HashMap<Character,Integer> map2 = new HashMap<>();

        for(int i=0;i<s2.length();i++){
            char ch = s2.charAt(i);
            if(map2.containsKey(ch)){
                map2.put(ch,map2.get(ch)+1);
            }else{
                map2.put(ch,1);
            }
        }

        // now comparing both the hashmaps if they ll be equals then the given strings will be anagrams 

        if(map1.equals(map2)){
            System.out.println("Yes both the strings are anagrams");
        }else{
            System.out.println("No both the strings are not anagrams");
        }


    }
}