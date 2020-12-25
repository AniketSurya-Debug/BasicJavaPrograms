class Dog{
    String colour,breed;
    public void walk(){
        System.out.print("dog is walking");
    }

}
class Cat{
    public void walk(){
        System.out.print("cat is walking");
    }
}
public class Obj1{
    public static void main(String args[])
    {
        Dog d=new Dog();
        d.walk();
        Cat c=new Cat();
        c.walk();
    }

}