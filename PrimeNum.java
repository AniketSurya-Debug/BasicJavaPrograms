import java.util.*;
class PrimeNum{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in); 
        int i,n;
        Boolean prime=true;
        System.out.println("enter the number to check wether it is a prime number or not:");
        n=scan.nextInt();
        Boolean isPrime=true;
        for(i=2;i*i<=n;i++)
        {
            if(n%i==0)
            {
                isPrime =false;
                break;
            }

        }
         if(n<2)
        {
           isPrime =false;
        }
        System.out.print("prime number  "+isPrime);
    }
}