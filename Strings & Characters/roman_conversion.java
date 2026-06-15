import java.util.HashMap;

public class roman_conversion {
    public static void main(String[] args) {

        String roman = "MCMIV";

        HashMap<Character, Integer> map = new HashMap<>();

        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int result = 0;

        for (int i = 0; i < roman.length(); i++) {

            char ch = roman.charAt(i);

            // if current value is smaller than next value, subtract
            if (i + 1 < roman.length() &&
                map.get(ch) < map.get(roman.charAt(i + 1))) {

                result -= map.get(ch);
            } 
            else {
                result += map.get(ch);
            }
        }

        System.out.println(result);
    }
}