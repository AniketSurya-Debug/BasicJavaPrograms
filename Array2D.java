import java.util.*;
class Array2D
{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.print("enter the values for 1st Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=scan.nextInt();
            }
        }
        System.out.print("enter the values for 2nd Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=scan.nextInt();

            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
            }
        }
        System.out.println("addition of two matrixes is :");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(c[i][j]+"  ");
            }
            System.out.println();
        }

    }
}