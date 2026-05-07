class find_permutation{
    static void findPermutation(String str, String ans){
        // base case jisme string me kch nahi bachega
        if(str.length() == 0){
            System.out.println(" "+ans);
            return;
        }

        // Iterate the whole string
        for(int i=0;i<str.length();i++){

            //lets take the string at the ith index and then permutate it with the remaning string
            char ch = str.charAt(i);

            // remaning string rather than the character at i
            String remaning = str.substring(0, i)+str.substring(i+1);

            // recursive call krdo yaha se taaki saare bache hu characters ke sath permutation ho jaye
            findPermutation(remaning, ans+ch);
        }
    }
    public static void main(String[] args) {
        String str = "ABC";

        findPermutation(str, "");
    }
}