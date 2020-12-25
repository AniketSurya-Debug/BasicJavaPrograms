import java.util.*;
class ForLoopPattern3{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the value:");
        int n=scan.nextInt();
        for(int i=1;i<=n;i++)
        {
            for(int k=1;k<=i-1;k++)
            {
                System.out.print("  ");
            }
            for(int j=n;j>=i;j--)
            {
                System.out.print("* ");
            }            
            System.out.println(" ");
        
        }
        
    }
}