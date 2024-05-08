public class instance_day3 {
    public static void main(String[] args) {
        shopping sh=new shopping(3, 2, 5, 4);
        shopping sh1=new shopping(6, 4, 2, 3);
        shopping sh2=new shopping(2, 3, 8, 3);
    }
}
class shopping
{
    {
        System.out.println();
        System.out.println("*****************");
        System.out.println("The Chennai Silks");
        wel();
    }
    int shirt,pant,tshirt,shorts,total;
    shopping(int shirt,int pant,int tshirt,int shorts)
    {
        this.shirt=shirt;
        this.pant=pant;
        this.tshirt=tshirt;
        this.shorts=shorts;
        this.bill();
    }
    public void wel()
    {
        System.out.println("Welcome to Chennai Silks");
    }
    public void bill()
    {
        total=(shirt*650)+(pant*700)+(tshirt*200)+(shorts*100);
        System.out.println("Shirts:"+shirt);
        System.out.println("Pants"+pant);
        System.out.println("Tshirts"+tshirt);
        System.out.println("Shorts"+shorts);
        System.out.println("Total:"+total);
    }

}
