import java.util.*;
public class ReverseInteger{
    public static void main(String args[]){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter any integer:");
    int t=0;
    int n=scan.nextInt();
    while(n !=0)
    {
        t=t*10;
        t=t+n%10;
        n=n/10;
        
     }
    System.out.print(t);

}
}