import java.util.*;
class ForLoopPattern4{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the value");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}