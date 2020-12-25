import java.util.*;
class DoWhileLoopEx2{
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the values:");
        int n;
        do{
            n=scan.nextInt();
            System.out.println("number is "+n);  
        
        }
        while(n!=0);

    }
}