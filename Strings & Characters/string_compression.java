class string_compression{
    public static void main(String[] args) {
        String str = "aaabbccccddeeeeefff";
        StringBuilder res = new StringBuilder();
        int count = 1;

        //itterating all the string first 
        for(int i=0;i<str.length();i++){

            //checking the condition till the char at the index and the character on the next index is same while 
            while(i<str.length()-1 && str.charAt(i)==str.charAt(i+1)){
                count++;
                i++;
            }
            res.append(str.charAt(i));
            res.append(count);
            count = 1;

        }

        System.out.println(res);
    }
}