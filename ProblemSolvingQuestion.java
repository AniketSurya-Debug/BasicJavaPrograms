import java.util.*;
 public class ProblemSolvingQuestion{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[4][4];
       int leftSum=0;
        int rightSum=0;
        int sum=0;
        System.out.println("enter the elemnt of arrays:");
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                a[i][j]=scan.nextInt();
            }

        }
          for(int i=0;i<4;i++)
        {
            for(int j=0;j<4;j++)
            {
                if(i==j)
                {
                     leftSum+=a[i][j];
                }
            }

        }
       
      //  System.out.println("thew sum is "+leftSum);
           for(int i=0;i<4;i++)
        {
            for(int j=3;j>= 0;j--)

            {
                if(i+j== 4-1)
                 
                {
                 rightSum+=a[i][j];
                }
            }
        }
             sum=rightSum+leftSum;
        System.out.println("the sum is :"+sum);
    } 
}
          
    
 
 