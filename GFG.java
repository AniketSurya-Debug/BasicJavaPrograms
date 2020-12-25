import java.util.*;
class GFG {
	public static void main (String[] args) {
          Scanner sc=new Scanner(System.in);
int t=sc.nextInt();
while(t-->0){
int n=sc.nextInt();
int max=0;
String s[]=new String[n+1];
for(int i=0;i<=n;i++){
s[i]=sc.nextLine();
if(s[i].length()>s[max].length())
max=i;
}
System.out.println(s[max]);
}
}
	}
