import java.util.*;
class ForLoopPattern9{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the number:");
        int n=scan.nextInt();
        System.out.println("* ");
        for(int i=2;i<=n-1;i++)
        {
            System.out.print("* ");
            for(int j=1;j<=i-2;j++)
            {
                System.out.print(" ");
            }
            System.out.print("*");
            System.out.println();
        
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print("*");
        }
    }
}