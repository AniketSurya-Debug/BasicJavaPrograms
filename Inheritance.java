class Person{ 
    protected String name;
   
    public void walk(){
        System.out.println(name +" can walk");
    }
    public void eat(){
        System.out.println(name+" can eat");
    }
}
class Teacher extends Person{
    public void teach(){
        System.out.println(name+" who is teacher can teach");
    } 
}
class Singer extends Person{
    public void sing(){
        System.out.println(name+" can sing");
    }
}
public class Inheritance{
    public static void main(String args[])
    {
        Singer obj=new Singer();
        obj.name="mr.Aniket";
        obj.walk();                      
        obj.eat();
        obj.sing();
   //     obj.teach();
 
    }
}