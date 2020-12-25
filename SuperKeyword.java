class Super1{
    String name;

    public Super1(String name){
        this.name=name;
        System.out.println("inside Super 1 constructor");
        System.out.print(name);

    } 
}
class Super2 extends Super1{
    Super2(String name){
    super(name);
    System.out.println("inside super 2 constructor");}
}
public class SuperKeyword{
    public static void main(String args[]){
        Super2 obj=new Super2("harry");

    }
}