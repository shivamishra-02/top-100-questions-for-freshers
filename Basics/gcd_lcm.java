class gcd_lcm{
    public static int gcd(int x, int y){
        while(y!=0){
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int gcd = gcd(a,b);

        int lcm = (a*b)/gcd;

        System.out.println("GCD os these two numbers:-- "+gcd);
        System.out.println("LCM os these two numbers:-- "+lcm);

    }
}