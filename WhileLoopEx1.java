import java.util.*;
class WhileLoopEx1{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.print("enter the value:"); 
        int n=scan.nextInt(); 
        int temp=n;
        int sum=0;
        while(temp>0)
        {
             int lastDigit=temp%10;
             sum+=lastDigit;
             temp=temp/10;

        }
        System.out.print("the sum of all digit is ="+sum);
    }
}