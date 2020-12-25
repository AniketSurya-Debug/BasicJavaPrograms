public class SumOfNaturalNumberWithRecursion{
    static int count1=0;
      static  int count2=0;
    public static void main(String args[])
    {
       
       // System.out.println(sum(7));
       System.out.println(pow(3,4));
       System.out.println(count1);

       System.out.println(fastPow(3,4));
       System.out.println(count2);
        
        }

        static int sum(int n){
            if(n == 1){
                return 1;
            }
            return n+sum (n-1);
        
    }
    static int pow(int a,int b)
    {
        count1++;
        if(b==0){

                return 1;
        }
        
       
        return a* pow(a,b-1);
    }
    static int fastPow(int a,int b)
    {
        count2++;
        if(b==0){
            return 1;

        }
        if(b%2==0)
        {
            return fastPow(a*a,b/2);
        }
        return a*fastPow(a,b-1);
    }
 
}