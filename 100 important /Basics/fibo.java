public class fibo{
    public static void main(String[] args) {
        int num = 10; // the number till which the fibonacchi is going to printed
        int a = 0;
        int b = 1;
        for(int i =0;i<num;i++){
            System.out.print(a+" ");
            int sum = a+b;
            a = b;
            b = sum;
        }
    }
}