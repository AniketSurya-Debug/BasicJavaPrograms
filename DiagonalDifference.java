import java.util.*;
public class DiagonalDifference
{
    public static void main(String args[])
    {
        int maxSum=0;
        int minSum=0;
        int arr[][]=new int[3][3];
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the values for the arrays");
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
        int diff=maxSum-minSum;
        System.out.println("difference is "+diff);

        
    }
}
