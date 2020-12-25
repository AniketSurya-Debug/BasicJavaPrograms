import java.util.*;
public class TcsCodevita1{
  			public static void main(String args[])
            {
              Scanner scan=new Scanner(System.in);
              System.out.println("enter the size:");
               int N=scan.nextInt();
              int max=0;
              System.out.println("enter the element:");
              char arr[][]=new char[N][N];
              for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)
                {
                  arr[i][j]=scan.next().charAt(0);
                }
              }
              for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)
                {
                  System.out.print(arr[i][j]);//arr[i][j]=scan.next().charAt(0);
                }
                System.out.println();
              }
              
              for(int i=0;i<N/2;i++)
              {
                for(int j=i;j<N-i-1;j++)
                {
                  char temp=arr[i][j];
                  arr[i][j]=arr[j][N-1-i];
                  arr[j][N-1-i]=arr[N-1-i][N-1-j];
                  arr[N-1-i][N-1-j]=arr[N-1-j][i];
                  arr[N-1-j][i]=temp;
                }
              }
             for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)
                {
                  System.out.print(arr[i][j]);//arr[i][j]=scan.next().charAt(0);
                }
                System.out.println();
              }
              
             for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)    
                {
                   if(arr[i][j]=='D')
                   {
                     arr[i][j]='-';
                     
                   }
                }
              }
            for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)
                {
                  System.out.print(arr[i][j]);//arr[i][j]=scan.next().charAt(0);
                }
                System.out.println();
              }
              for(int i=0;i<N-1;i++)
              {
                for(int j=0;j<N-1;j++)
                {
                   if((arr[i][j]=='C') && (arr[i+1][j]=='-'))
                   {
                     arr[i][j]='-';
                     arr[i+1][j]='C';
                    }
                   
                }
              }
             for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)
                {
                  System.out.print(arr[i][j]);//arr[i][j]=scan.next().charAt(0);
                }
                System.out.println();
              }
              for(int i=0;i<N;i++)
              {
                for(int j=0;j<N;j++)
                {
                  if(arr[i][j]=='C')
                  {
                    
                    int count=i-N;
                    int pos=~(count - 1);
                    if(max<pos)
                    {
                    max=pos;
                    }
                  }
                }
                   
              }
               System.out.print(max);
              
              
              
              
              
             
            }
}

