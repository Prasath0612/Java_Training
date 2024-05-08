class Day3
{
    public static void main(String args[])
    {
        consumer com=new consumer(8763,4,"Krishna","Rajini",3,1,20);
        com.show();
        consumer.display();
        com.items();
        consumer.quantity();
    }
}
class admin
{
    int sugar,dhal,rice;
    static int oil;
    {
        System.out.println("---------------------");
        System.out.println("Welcome to Ration Shop");
    }
    admin(int sugar,int dhal,int rice)
    {
        this.sugar=sugar;
        this.dhal=dhal;
        this.rice=rice;
    }
    public void items()
    {
        System.out.println("Sugar in kg:"+sugar);
        System.out.println("Dhal in kg:"+dhal);
        System.out.println("Rice in kg:"+rice);  
    }
    static public void quantity()
    {
        System.out.println("Oil in ml:"+oil);
        
    }
}
class consumer extends admin
{
    int id,members;
    String name,street;
    static String city,state;
    static
    {
        oil=500;
        city="Chennai";
        state="Tamil Nadu";
    }
    consumer(int id,int members,String name,String street,int sugar,int dhal,int rice)
    {
        super(sugar,dhal,rice);
        this.id=id;
        this.members=members;
        this.name=name;
        this.street=street;
    }
    public void show()
    {
        System.out.println("Name:"+name);
        System.out.println("Id:"+id);
        System.out.println("Family Members:"+members);
        System.out.println("Street:"+street);
        
    }
    static public void display()
    {
        System.out.println("City:"+city);
        System.out.println("State:"+state);
    }
}

