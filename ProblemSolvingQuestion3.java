import java.util.*;
public class ProblemSolvingQuestion3{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7};
        int b[]={0,0,2,1,3,5,2};
        int c[]=new int[7];
        for(int i=0;i<7;i++)
        {
            c[i]=a[i]+b[i];
        }
        for(int i=0;i<7;i++)
        {
            System.out.print(c[i]+" ");
        }
    }
}