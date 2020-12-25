import java.util.*;
class SeriesSumWithAlternativeOperator{
    public static void main(String args[])
   {
       float i,n;
       float result=0;

       Scanner scan=new Scanner(System.in);
       System.out.print("enter how much term you want forr addition:");
       n=scan.nextInt();
       for(i=1;i<=n;i++)
       {
           if(i%2==1)
           {
           result+=1/i;
           }
           else
           {
               result-=1/i;
           }

       }
       System.out.print(result);


   } 


}