public class innercls {
    public static void main(String[] args) {
        miprod m=new miprod();
        miprod.note9 obj=m.new note9();
        obj.amt("note 9",20000);
        miprod.blueHeadset obj1=m.new blueHeadset();
        obj1.am("mi123", 2400);
    }
}
class miprod
{
    String brand="Redmi";
    String model="";
    int price=0;
    public void re()
    {
        System.out.println("Welcome to mi world");
    }
    class note9
    {
        String model="Note 9 pro";
        int price=20000;
        public void amt(String model,int price)
        {
            System.out.println("Brand: "+brand);
            System.out.println("Model: "+model);
            System.out.println("Price: "+price);
        }
    }
    class blueHeadset
    {
        public void am(String model,int price)
        {
            System.out.println("Brand: "+brand);
            System.out.println("Model: "+model);
            System.out.println("Price: "+price);
        }
    }
}
