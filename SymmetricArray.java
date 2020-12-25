import java.util.*;
public class SymmetricArray{
    public static void main(String args[])
    {
        int arr[][]={(1,2),(2,1)};
        int z=0;
        for(int r=0;r<2;r++)
        {
            for(int c=0;c<2;c++)
            {
                if(arr[r][c]!=arr[c][r])
                {
                    z++;
                }
            }
        }
        if(z>0)
        {
            System.out.println("not stmmetric");
        }
        else
        {
            System.out.println("Symmetric");
        }
        

    } 

}