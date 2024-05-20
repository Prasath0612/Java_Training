class final_day5
{
    public static void main(String[] args) {
        consumer ad=new consumer( 20000,"Semi automatic", 6, "Cash","Karthi","Erode",9087674565l);
        consumer ad1=new consumer( 30000,"Fully automatic", 4, "Online","Mohan","Trichy",9862345126l);
    }
}
class admin 
{
    final int price;
    String model,pay_mode;
    int stock_left;
    admin(int price,String model,int stock_left,String pay_mode)
    {
        this.price=price;
        this.model=model;
        this.stock_left=stock_left;
        this.pay_mode=pay_mode;
        this.disp();
    }
    final public void disp()
    {
        System.out.println();
        System.out.println("Payment mode:"+pay_mode);
        System.out.println("Washing Machine model:"+model);
        System.out.println("Stock left:"+stock_left);
        System.out.println("Price:"+price);
        //System.out.println("Payment mode:"+pay_mode);
    }
}
class consumer extends admin

{
    String name,city;
    long mobno;
    consumer(int price,String model,int stock_left,String pay_mode,String name,String city,long mobno)
    {
        super(price,model, stock_left, pay_mode);
        this.name=name;
        this.city=city;
        this.mobno=mobno;
        this.display();
    }
    public void display()
    {
        System.out.println("-----------------");
        System.out.println("Customer name:"+name);
        System.out.println("Mobile number:"+mobno);
        System.out.println("City:"+city);
        System.out.println("Purchased model:"+model);
        System.out.println("Price:"+price);
        System.out.println("Payment mode:"+pay_mode);
    }
}
