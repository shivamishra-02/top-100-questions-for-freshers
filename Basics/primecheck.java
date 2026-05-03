public class primecheck{
    public static boolean isPrime(int n){
        if(n<=1) return false;
        if (n==2) return true;
        if(n%2==0) return false; 
        for(int i=3;i*i<=n;i+=2){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 17;

        System.out.println(isPrime(n));
        int m = 100;
        int count = 0;

        for(int i=1;i<=m;i++){
            if(isPrime(i)==true){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Total number of prime number till the number "+m+" is:- "+count);
    }
}