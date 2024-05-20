public class definterface_day5 
{
    public static void main(String[] args) {
        sample s=new sample();
        s.petrol_diesel();
        s.die_rate(2);
        s.pet_rate(1);
    }
}
interface in1
{
    int diesel_rate=92;
    public void die_rate(int d);
    default public void petrol_diesel()
    {
        System.out.println("Diesel is available here");
    }
}
interface in2
{
    int petrol_rate=101;
    public void pet_rate(int p);
    default public void petrol_diesel()
    {
        System.out.println("Petrol is available here");
    }
}
class sample implements in1,in2
{
    public void petrol_diesel()
    {
        in1.super.petrol_diesel();
        in2.super.petrol_diesel();
    }
    @Override
    public void die_rate(int d)
    {
        System.out.println("Diesel pumped="+(d*diesel_rate));
    }
    @Override
    public void pet_rate(int p)
    {
        System.out.println("Petrol pumped="+(p*petrol_rate));
    }


    
}
