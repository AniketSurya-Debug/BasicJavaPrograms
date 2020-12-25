import java.util.*;
class ForLoopPattern7{
    public static void main(String args[])
    {
        int u=1; 
         Scanner scan=new Scanner(System.in);
         System.out.print("enter the value:");
         int n=scan.nextInt();
         for (int i=1;i<=n;i++)
         {
             for(int j=1;j<=n-i;j++)
             {
                 System.out.print("  ");
             }
             for(int k=1;k<=i;k++)
             {
                 System.out.print(u++ +"  ");
             }
             System.out.println();
         }
    }
}