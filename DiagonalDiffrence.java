import java.util.*;
public class DiagonalDiffernce
{
    public static void main(String args[])
    {
        int maxSum=0;
        int minSum=0;
        int arr[][]=new int[3][3];
        Scaner scan=new Scanner(System.in);
        System.out.prinln("enter the values for the arrays");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                arr[i][j]=scan.nextInt();
            }
        }
        for(int i=0;i<3;i++)
        {
            maxSum+=arr[i][i];
            minSum+=arr[i][3-i-1];
            
            
        }
        System.out.println(maxSum+" "+minSum);

        
    }
}