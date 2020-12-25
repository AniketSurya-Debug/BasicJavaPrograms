import java.util.*;
class ForLoopPattern2
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the value:");
        int n=scan.nextInt();
        
        for(int j=1;j<=n;j++)
        {
        for(int i=1;i<=j;i++)
        {
            System.out.print("* ");

        }
        System.out.println();
        }

    }
}