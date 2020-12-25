import java.util.*;
public class ReverseString2{
    public static void main(String args[]){
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the string:");
        String s=scan.nextL ine();
      int i=s.length()-1;
        String ans="";
        while(i>=0)
        {
            while(i>=0 && s.charAt(i) ==' ')i--;
              int j=i;
            
            if(i<0) break;
            while(i>=0 && s.charAt(i) !=' ')i--;
            
               ans=ans.concat(s.substring(i+1,j+1));
            
            if(ans.isEmpty()){
                System.out.print(ans.concat(s.substring(i+1,j+1)));
            }
            
            else{
            System.out.print(ans.concat(" "+s.substring(i+1,j+1)));
            }
        }

    }
}