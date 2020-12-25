import java.util.*;
public class CountWord
{
    public static void main(String args[])
    {
        int count=0;
        String s="My name is himanshu";
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==' ' && s.letterAt((i+1))
            {
                count+=1;
            }
        }
        System.out.print(count+1);
        
    }
}