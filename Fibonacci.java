import java.util.*;
class Fibonacci{
    public static void main(String args[])
    {
        int i,c;
        int a=0,b=1;
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the length of the series:");
        int n=scan.nextInt();
        System.out.print(a+" ");
        System.out.print(b+" ");
        for(i=0;i<=n-2;i++)
        {
            c=a+b;
            System.out.print(c+" ");
            a=b;
            b=c;
        }



    }
}