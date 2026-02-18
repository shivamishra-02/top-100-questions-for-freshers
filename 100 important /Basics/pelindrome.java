public class pelindrome{
    public static void main(String[] args) {
        String str = "mada m";
        str = str.replace(" ","").toLowerCase();
        boolean isPelindrome = true;
        int start = 0;
        int end = str.length()-1;
        while(start<end){
            if(str.charAt(end)!= str.charAt(start)){
                isPelindrome = false;
                break;
            }
            start ++;
            end--;
        }

        if(isPelindrome){
            System.out.println("Yes string is a pelindrome");
        }else{
            System.out.println("No this string is not a pelindrome");
        }
    }
}