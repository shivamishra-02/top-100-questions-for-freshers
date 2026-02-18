public class factorial{
    public static int factorial(int n){
        if(n<=1){
            return 1;
        }
        return n* factorial(n-1);
    }
    public static void main(String[] args) {
        // loop method to find the factorial 
        int n = 5;
        int fact = 1;
        while(n>0){
            fact *=n;
            n--;
        }
        System.out.println("The factorial of this number is :-- "+fact);

        // calling the recursive method to find the factorial of the number
        int num = 6;
        System.out.println(factorial(num));
    }
}