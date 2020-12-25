public class PeriCons
{
    int wheels;
    PeriCons(int wheels){
        this.wheels=wheels;
        }
        public static void main(String args[])
    {
        PeriCons car=new PeriCons(4);
        PeriCons scooty=new PeriCons(2);
        System.out.println(car.wheels+" wheels");
        System.out.print(scooty.wheels+" wheels");

    }
}