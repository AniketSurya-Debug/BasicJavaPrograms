import java.util.*;
class ArrayEx1{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        
        int average=0;

        System.out.print("enter the length of the array:");
        int n=scan.nextInt();
        int[] marks=new int[n];
        System.out.print("enter the values:");
        for(int i=0;i<n;i++)
        {
            marks[i]=scan.nextInt();
        }
        for(int i=0;i<n;i++)
        {
             average+=marks[i];
        }
        average/=n;
        System.out.print("average is :"+average);
    }
}  