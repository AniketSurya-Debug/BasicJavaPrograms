import java.util.*;
class Palindrome{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number to check wether it is palindrome number or not:");
        int n=scan.nextInt();
        int r=0;
       int temp=n;
        while(temp>0)
        {
            int lastDigit=temp%10;
            temp/=10;
            
            r=r*10+lastDigit;
            

        }
        if(r==n)
        {
            System.out.print("it is palindrome number");

        }
        else{
            System.out.print("it is not a palindrome numnber");
        }
        
    }
}