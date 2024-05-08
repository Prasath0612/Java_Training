class mobile_day2
{
    public static void main(String args[])
    {
        specs sp1=new specs("snapdragon",128,36,128,8);
        amt am1=new amt("White",20000,"Redmi","Note 10",5000,sp1);
        specs sp2=new specs("snapdragon",64,24,128,6);
        amt am2=new amt("Black",15000,"Redmi","Note 7",4000,sp2); 
    }
}

class company
{
    String brand,model;
    int battery;
    specs sp;
    company(String brand,String model,int battery,specs sp)
    {
        this.brand=brand;
        this.model=model;
        this.battery=battery;
        this.sp=sp;
        this.disp();
    }
    public void disp()
    {
        sp.display();
        System.out.println("Brand :"+brand);
        System.out.println("Model :"+model);
        System.out.println("Battery :"+battery);
        
    }
}

class amt extends company
{
    int price;
    String color;
    amt(String color,int price,String brand,String model,int battery,specs spe)
    {
        super(brand,model,battery,spe);
        System.out.println("Price :"+price);
        System.out.println("Color :"+color);

    }
} 