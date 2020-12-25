import java.util.*;
class gfgProblem
{
public static void main(String args[])
{
    Scanner scan=new Scanner(System.in);
    System.out.print("enter the size of the array:");
    int n=scan.nextInt();
    int arr[]=new int[n];
    System.out.print("enter the element for array:");
    for(int i=0;i<n;i++)
    {
        arr[i]=scan.nextInt();
    }
    int sum=0;
    int i;
    for( i=0;i<arr.length;i++)
    {
        sum+=arr[i];
    }
    System.out.print(sum);
}
}