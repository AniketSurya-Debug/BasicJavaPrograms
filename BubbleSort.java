import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        
        int a[]={1,5,2,9,4};
        int n=a.length;
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]+" ");
        }
        int temp=0;
        for(int i=0;i<n-1-i;i++)
        {
            Boolean sorted=true;
            for(int j=0;j<n-1;j++)
            {
                if(a[j+1]<a[j])
                {
                    temp=a[j+1];
                    a[j+1]=a[j];
                    a[j]=temp;
                    sorted=false;
                

                }
                
            }
            if(sorted) break;

        }
        System.out.print("After Sorting:");
        for(int item: a){
            System.out.print(item+" ");
        }
    }
}