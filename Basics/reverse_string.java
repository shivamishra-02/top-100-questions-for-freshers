public class reverse_string{
    public static void main(String[] args) {
        String str = "shivam";
        int l = str.length()-1;
        StringBuilder sb = new StringBuilder();
        for(int i=l;i>=0;i--){
            sb.append(str.charAt(i));
        }
        System.out.println("The reverse string for the above string will be:-- "+sb);
    }
}