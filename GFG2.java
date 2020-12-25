import java.util.*;
class GFG2{
    public static void main(String args[])
    {
		Scanner scan=new Scanner(System.in);
		//int t=scan.nextInt();
		//while(t-->0)
		//{
		    int n=scan.nextInt();
		    int k=scan.nextInt();
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		    {
		        a[i]=scan.nextInt();
		    }
		    for(int i=k-1;i>=0;i--)
		    {
		        System.out.print(a[i]+" ");
		    }
		    for(int i=k;i<a.length;i++)
		    {
		        System.out.print(a[i]+" ");
		        
		    }
		    System.out.println();
		    
		    
		//}
	}
}