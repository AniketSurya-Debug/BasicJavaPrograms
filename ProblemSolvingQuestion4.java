import java.util.*;
public class ProblemSolvingQuestion4{
    public static void main(String args[])
    {
        int a[]={1,2,3,4,5,6,7};
        int b[]={1,2,3,4,5,6,7};
        boolean status=true;
        if(a.length==b.length)
        {
        for(int i=0;i<7;i++)
        {
            if(a[i]!=b[i])
            {
        
                status=false;
        
            }
    

    
        else
        {
            status=false;
        }
        }
        }
        if(status==true)
        {
        System.out.println("arryas are same");
        }
        else
        {
            System.out.println("arrays are not same");
        }


    
}
}