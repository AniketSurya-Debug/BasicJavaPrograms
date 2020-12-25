import java.util.*;
class ReverseString{
    public static void main(String args[])
    {
        Scanner scan= new Scanner(System.in);
        String s=scan.next();
        System.out.print(s.length());
        for(int i=s.length();i>0;i--)
        {
            System.out.print(s.charAt(i));
        }
    }
}