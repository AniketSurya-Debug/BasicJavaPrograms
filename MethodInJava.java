 import java.util.*;
 public class MethodInJava{
     public static void main(String args[]){
         int FirstNum=34;
         int SecondNum=36;
         int result=maxOf(FirstNum,SecondNum);
         System.out.println(result);
         sayHi();

     }
     static int maxOf(int a, int b){
         return a>b?a:b;
     }
     static void sayHi(){
         System.out.print("hello everyone the method is successfully called");
     }

 }
 