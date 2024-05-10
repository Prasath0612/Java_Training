public class arrobj {
    public static void main(String[] args) 
    {
        input in1=new input();
        input in2=new input();
        in1.setMob_mod("Redmi");
        in1.setStock_left(10);
        in1.setSold(3);
        in2.setMob_mod("Samsung");
        in2.setStock_left(10);
        in2.setSold(3);
        input inp[]=new input[2];
        inp[0]=in1;
        inp[1]=in2;
        for(int i=0;i<2;i++)
        {
            System.out.println("Mobile model "+inp[i].getMob_mod());
            System.out.println("Stock left "+inp[i].getStock_left());
            System.out.println("Sold "+inp[i].getSold());
        } 
    }
}
class input{
    int stock_left,sold;
    String mob_mod;
    public void setMob_mod(String mob_mod)
    {
        this.mob_mod=mob_mod;
    }
    public String getMob_mod()
    {
        return mob_mod;
    }
    public void setStock_left(int stock_left)
    {
        this.stock_left=stock_left;
    }
    public int getStock_left()
    {
        return stock_left;
    }
    public void setSold(int sold)
    {
        this.sold=sold;
    }
    public int getSold()
    {
        return sold;
    }
}
