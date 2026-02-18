public class vowels_consonant{
    public static void main(String[] args) {
        String str = "Shivam Mishra";
        String vowels = "aeiouAEIOU";
        int con = 0;
        int vow = 0;
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==' '){
                continue;
            }
            if(vowels.indexOf(str.charAt(i)) != -1){
                vow+=1;
            }
            else{
                con +=1;
            }
        }
        System.out.println("The number of vowels in this string is:- "+vow);
        System.out.println("The number of consonant in this string is:- "+con);
    }
}