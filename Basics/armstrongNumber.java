public class armstrongNumber{
    public static void main(String[] args) {
        int num = 371;
        int original = num;
        int digit = 0;
        int sum = 0;
        while(num>0){
            digit +=1;
            num/=10;
            
        }
        num = original;
        while(num>0){
            int dig = (num%10);
            sum+= Math.pow(dig,digit);
            num/=10;
        }

        if(sum==original){
            System.out.println("Yes the given number is an armstring number!!");
        }else{
            System.out.println("No the given number is not an armstring number ");
        }
    }
}