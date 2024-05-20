public class inter_day5 {
    public static void main(String[] args) {
        shop sh=new shop("Aravind", 1.5f, 0,.75f , "Cash");
    }
}
interface in
{
    int bro_chicken=200,cout_chicken=500,goat=700;
    public void rate();
}
class shop implements in
{
    String name,pay_mode;
    float br_kg,cc_kg,goat_kg,total;
    shop(String name,float br_kg,float cc_kg,float goat_kg,String pay_mode)
    {
        this.name=name;
        this.br_kg=br_kg;
        this.cc_kg=cc_kg;
        this.goat_kg=goat_kg;
        this.pay_mode=pay_mode;
        this.rate();
    }
    public void rate()
    {
        total=((br_kg*bro_chicken)+(cc_kg*cout_chicken)+(goat_kg*goat));
        System.out.println("Total bill :"+total);
    }
}
