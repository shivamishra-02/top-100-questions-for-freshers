class check_rotation{
    public static void main(String[] args) {
        String str = "ABCD";
        String str2 = "DBCA";

        // to check wheather the string is being rotated or not we must apply the formula that the rotated string will be the part of twice of the string itself
        String combine = str+str;
        if(str.length()==str2.length()){
            if(combine.contains(str2)){
                System.out.println("Yes it is the rotated part of the first string");
            }else{
                System.out.println("No, it is not a rotated form");
            }
        }else{
            System.out.println("No, second string is not the rotated form of second one");
        }
        

    }
}