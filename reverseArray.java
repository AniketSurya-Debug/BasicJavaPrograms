import java.util.*;
 public class ReverseArray{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the size of the aray");
       int  n=scan.nextInt();
        int a[]=new int[n];
        int r[]=new int[n];

      
        for(int i=0;i<=n-1;i++)
        {
            a[i]=scan.nextInt();
        }
        for(int i=n-1;i>=0;i--)
        {
            System.out.println("   "+a[i]);
            r[n-1-i]=a[i];
            
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(" Second array or reverse array::index no="+i+" value is"+r[i]);
           // r[n-1-i]=a[i]
            
        }
    }
}