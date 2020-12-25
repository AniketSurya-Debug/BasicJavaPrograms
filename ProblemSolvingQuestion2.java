import java.util.*;
public class ProblemSolvingQuestion2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7};
        int evenSum=0;
        int oddSum=0;
      //  int n=arr.length();
        for(int i=0;i<7;i++)
        {
            if(i%2!= 0)
            {
                 evenSum+=arr[i];
            }
            else
            {
                 oddSum+=arr[i];
            }
        }
        System.out.println("even sum="+evenSum);
        System.out.println("odd sum="+oddSum);
    }
}