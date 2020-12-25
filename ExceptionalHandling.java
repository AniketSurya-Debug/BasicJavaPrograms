public class ExceptionalHandling{
    public static void main(String args[])
    {
       try{
            //int a=4;
            //int b=0;
           //int  c=a/b;
            //System.out.println(c);
            int a[]=new int[5];
            System.out.println(a[6]);
        }
        catch(ArithmeticException e){
            System.out.print(e.getMessage()+" errror");
        }
       catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(" your array should be in size");
        }
        finally{
            System.out.println("Sorry for the inconvenience."); 
        }
    }
}